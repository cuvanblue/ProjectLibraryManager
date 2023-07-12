/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.*;
import com.mycompany.mavenproject3.mode.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import view.quanlythuvien;

/**
 *
 * @author DELL
 */
public class mainclass {
    public static void main(String[] args) { 
        quanlythuvien thuvien = new quanlythuvien();
        Connection conn = null;
       try 
       {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-8RTP8V7:1433;databaseName =ThuVien2;user = sa;password = 123456789;encrypt = false");
       }
       catch(ClassNotFoundException|SQLException e ){
           e.printStackTrace();
       }
       
        ArrayList<Sach> sach = new ArrayList<Sach>();
        try {
             PreparedStatement prest = conn.prepareStatement("SELECT * FROM Sach");
             ResultSet rs = prest.executeQuery();
             while(rs.next()){
                 Sach a = new Sach(rs.getString(1), rs.getString(2), rs.getString(3),
                         rs.getInt(4), rs.getString(5), rs.getString(6));
                 sach.add(a);          
             }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    ArrayList<phieuphat> dsPhieuphat = new ArrayList<phieuphat>();
        try {
             PreparedStatement prest = conn.prepareStatement("SELECT * FROM PhieuPhat");
             ResultSet rs = prest.executeQuery();
             while(rs.next()){
                 phieuphat a = new phieuphat(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)
                         , rs.getString(5), rs.getString(6), rs.getBoolean(7));
                 dsPhieuphat.add(a);
             }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        ArrayList<sinhvien> dsSinhVien = new ArrayList<sinhvien>();
        try {
             PreparedStatement prest = conn.prepareStatement("SELECT * FROM SinhVien");
             ResultSet rs = prest.executeQuery();
             while(rs.next()){
                 sinhvien a = new sinhvien(rs.getString(1), rs.getString(2), rs.getString(3)
                         , rs.getString(4), rs.getString(5));
                 dsSinhVien.add(a);
             }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        ArrayList<Phieumuon> dsPhieumuon = new ArrayList<Phieumuon>();
        try {
             PreparedStatement prest = conn.prepareStatement("SELECT * FROM PhieuMuon");
             ResultSet rs = prest.executeQuery();
             while(rs.next()){
                 Phieumuon a = new Phieumuon(rs.getString(1), rs.getString(2), rs.getString(3)
                         , rs.getString(4), rs.getString(5), rs.getString(6),rs.getBoolean(7));
                 dsPhieumuon.add(a);
                 int[] hantra = thuvien.getdate(a.getHantra());
                 Calendar cal = Calendar.getInstance();
                 SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                 String homnay = dateFormat.format(cal.getTime());
                 int[] ngayhomnay = thuvien.getdate(homnay);
                 boolean kt_date = false;
                 if ((ngayhomnay[2] > hantra[2]) || (ngayhomnay[2] == hantra[2] && ngayhomnay[1] > hantra[1])) {
                     kt_date = true;
                 } else if (ngayhomnay[2] == hantra[2] && ngayhomnay[1] == hantra[1] && ngayhomnay[0] > hantra[0]) {
                     kt_date = true;
                 }
                 if(!a.isTinhtrang()&&kt_date){
                     boolean ktphieuphat = false;
                     for(phieuphat i: dsPhieuphat){
                         if(i.getIdmuon().equals(a.getidmuon()))
                         {
                             ktphieuphat = true;
                             break;
                         }
                     }
                     if(!ktphieuphat){
                         String idphat = a.getidmuon()+"p"+String.valueOf(dsPhieuphat.size()+1);
                         phieuphat phat = new phieuphat(idphat, a.getidmuon(), a.getMSSV(), homnay, "Trả sách muộn", "Cảnh cáo đến số điện thoại và lớp quản lý cho đến khi sinh viên lên thư viện giải quyết", false);
                         dsPhieuphat.add(phat);
                         thuvien.addPhieuphat(phat);
                     }
                 }
             }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        thuvien = new quanlythuvien(sach,dsPhieuphat,dsSinhVien,dsPhieumuon);
        thuvien.setVisible(true);
    
    }
    
}