package com.example.Hungvv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class DoiTac {
    @Column
    @Id
    private String MaDT;
    private String TenDT;
    private String DiaChi;
    private String SDT;
    private String Fax;
    private String Website;
    private String Email;
    private String NoiCongTac;
    private String ChucVu;
    private String MaKH;


    public String getMaDT() {
        return MaDT;
    }

    public void setMaDT(String maDT) {
        MaDT = maDT;
    }

    public String getTenDT() {
        return TenDT;
    }

    public void setTenDT(String tenDT) {
        TenDT = tenDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }

    public String getWebsite() {
        return Website;
    }

    public void setWebsite(String website) {
        Website = website;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getNoiCongTac() {
        return NoiCongTac;
    }

    public void setNoiCongTac(String noiCongTac) {
        NoiCongTac = noiCongTac;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String chucVu) {
        ChucVu = chucVu;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String maKH) {
        MaKH = maKH;
    }
}
