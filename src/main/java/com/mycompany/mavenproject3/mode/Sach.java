/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3.mode;

/**
 *
 * @author DELL
 */
public class Sach {
    String sachID;
    String Loaisach;
    String Tensach;
    int Giasach;
    String Tinhtrang;
    String vitri;

    public String getSachID() {
        return sachID;
    }

    public void setSachID(String sachID) {
        this.sachID = sachID;
    }

    public String getLoaisach() {
        return Loaisach;
    }

    public void setLoaisach(String Loaisach) {
        this.Loaisach = Loaisach;
    }

    public String getTensach() {
        return Tensach;
    }

    public void setTensach(String Tensach) {
        this.Tensach = Tensach;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }



    public     int getGiasach() {
        return Giasach;
    }

    public void setGiasach(int Giasach) {
        this.Giasach = Giasach;
    }

    public String getTinhtrang() {
        return Tinhtrang;
    }

    public void setTinhtrang(String Tinhtrang) {
        this.Tinhtrang = Tinhtrang;
    }

    public Sach(String sachID, String Loaisach, String Tensach, int Giasach, String Tinhtrang, String vitri) {
        this.sachID = sachID.trim();
        this.Loaisach = Loaisach.trim();
        this.Tensach = Tensach.trim();
        this.Giasach = Giasach;
        this.Tinhtrang = Tinhtrang.trim();
        this.vitri = vitri;
    }

    
}
