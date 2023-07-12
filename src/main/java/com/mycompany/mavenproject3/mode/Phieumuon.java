/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3.mode;

/**
 *
 * @author DELL
 */
public class Phieumuon {
    String idmuon;  
    String MSSV;
    String idsach;
    String Ngaymuon;
    String Hantra;
    String Ngaytra;
    boolean tinhtrang;

    public String getidmuon() {
        return idmuon;
    }

    public void setidmuon(String idmuon) {
        this.idmuon = idmuon;
    }

    

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getNgaymuon() {
        return Ngaymuon;
    }

    public void setNgaymuon(String Ngaymuon) {
        this.Ngaymuon = Ngaymuon;
    }

    public String getidsach() {
        return idsach;
    }

    public void setidsach(String idsach) {
        this.idsach = idsach;
    }

   
    public String getHantra() {
        return Hantra;
    }

    public void setHantra(String Hantra) {
        this.Hantra = Hantra;
    }

    public boolean isTinhtrang() {
        return tinhtrang;
    }

    public String getIdmuon() {
        return idmuon;
    }

    public void setIdmuon(String idmuon) {
        this.idmuon = idmuon;
    }

    public String getIdsach() {
        return idsach;
    }

    public void setIdsach(String idsach) {
        this.idsach = idsach;
    }

    public String getNgaytra() {
        return Ngaytra;
    }

    public void setNgaytra(String Ngaytra) {
        this.Ngaytra = Ngaytra;
    }
    
    public void setTinhtrang(boolean tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    /**
     *
     * @param idmuon
     * @param tensinhvien
     * @param MSSV
     * @param idsach
     * @param Ngaymuon
     * @param Hantra
     */
    public Phieumuon(String idmuon, String MSSV,String idsach, String Ngaymuon, String Hantra, String ngaytra,boolean tinhtrang) {
        this.idmuon = idmuon.trim();
        
        this.MSSV = MSSV.trim();
        this.Ngaytra = ngaytra.trim();
        this.idsach = idsach.trim();
        this.Ngaymuon = Ngaymuon.trim();
        this.Hantra = Hantra.trim();
        this.tinhtrang=tinhtrang;
    }
}
