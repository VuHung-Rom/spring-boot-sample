package com.example.Hungvv.entity;

import javax.persistence.*;


@Entity
public class Nguoidung {
    @Column
    @Id
    private String ten;
    @Column
    private String matkhau;
    @Column
    private String manv;
    @Column
    private String manhom;



    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getManhom() {
        return manhom;
    }

    public void setManhom(String manhom) {
        this.manhom = manhom;
    }
}


