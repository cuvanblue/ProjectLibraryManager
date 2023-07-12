/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3.mode;

/**
 *
 * @author DELL
 */
public class sinhvien {
    String Tensv;
    String MSSV;
    String Lopquanly;
    String Khoa;
    String Email;

    public sinhvien(String Tensv, String MSSV, String Lopquanly, String Khoa, String Email) {
        this.Tensv = Tensv.trim();
        this.MSSV = MSSV.trim();
        this.Lopquanly = Lopquanly.trim();
        this.Khoa = Khoa.trim();
        this.Email = Email.trim();
    }

    public String getTensv() {
        return Tensv;
    }

    public void setTensv(String Tensv) {
        this.Tensv = Tensv;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getLopquanly() {
        return Lopquanly;
    }

    public void setLopquanly(String Lopquanly) {
        this.Lopquanly = Lopquanly;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
}
