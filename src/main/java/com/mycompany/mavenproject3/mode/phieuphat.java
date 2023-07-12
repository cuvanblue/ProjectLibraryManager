/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3.mode;

/**
 *
 * @author DELL
 */
public class phieuphat {
    String idmuon;
    String idphat;
    String MSSV;
    String Ngayxuly;
    String Hinhthucxuly;
    String Lydoxuly;
    boolean tinhtrang;

    public phieuphat(String idphat, String idmuon, String MSSV, String Ngayxuly, String Lydoxyly, String Hinhthucxyly, boolean  tinhtrang) {
        this.idmuon = idmuon.trim();
        this.idphat = idphat.trim();
        this.MSSV = MSSV.trim();
        this.Ngayxuly = Ngayxuly.trim();
        this.Hinhthucxuly = Hinhthucxyly.trim();
        this.Lydoxuly = Lydoxyly.trim();
        this.tinhtrang = tinhtrang;
    }

    public boolean isTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(boolean tinhtrang) {
        this.tinhtrang = tinhtrang;
    }
    
    
    
    public String getIdmuon() {
        return idmuon;
    }

    public void setIdmuon(String idmuon) {
        this.idmuon = idmuon;
    }

   

    public String getIdphat() {
        return idphat;
    }

    public void setIdphat(String idphat) {
        this.idphat = idphat;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getNgayxuly() {
        return Ngayxuly;
    }

    public void setNgayxuly(String Ngayxuly) {
        this.Ngayxuly = Ngayxuly;
    }

    public String getHinhthucxuly() {
        return Hinhthucxuly;
    }

    public void setHinhthucxuly(String Hinhthucxuly) {
        this.Hinhthucxuly = Hinhthucxuly;
    }

    public String getLydoxuly() {
        return Lydoxuly;
    }

    public void setLydoxuly(String Lydoxuly) {
        this.Lydoxuly = Lydoxuly;
    }

}
