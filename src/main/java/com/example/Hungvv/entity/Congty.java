package com.example.Hungvv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Congty {
    @Column
    @Id
    private String mact;
    private String tenct;
    private String nhanvienkd;
    private String sdt;
    private String fax;
    private String website;
    private String email;
    private String diachi;
    private String tinhthanh;
    private String giamdoc;
    private String masothue;
    private String nhacungcap;
    private String htsh;
    private String lvkd;
    private int xuathd;
    private String moiquanhe;
    private int mdut;

    public String getMact() {
        return mact;
    }

    public void setMact(String mact) {
        this.mact = mact;
    }

    public String getTenct() {
        return tenct;
    }

    public void setTenct(String tenct) {
        this.tenct = tenct;
    }

    public String getNhanvienkd() {
        return nhanvienkd;
    }

    public void setNhanvienkd(String nhanvienkd) {
        this.nhanvienkd = nhanvienkd;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getTinhthanh() {
        return tinhthanh;
    }

    public void setTinhthanh(String tinhthanh) {
        this.tinhthanh = tinhthanh;
    }

    public String getGiamdoc() {
        return giamdoc;
    }

    public void setGiamdoc(String giamdoc) {
        this.giamdoc = giamdoc;
    }

    public String getMasothue() {
        return masothue;
    }

    public void setMasothue(String masothue) {
        this.masothue = masothue;
    }

    public String getNhacungcap() {
        return nhacungcap;
    }

    public void setNhacungcap(String nhacungcap) {
        this.nhacungcap = nhacungcap;
    }

    public String getHtsh() {
        return htsh;
    }

    public void setHtsh(String htsh) {
        this.htsh = htsh;
    }

    public String getLvkd() {
        return lvkd;
    }

    public void setLvkd(String lvkd) {
        this.lvkd = lvkd;
    }

    public int getXuathd() {
        return xuathd;
    }

    public void setXuathd(int xuathd) {
        this.xuathd = xuathd;
    }

    public String getMoiquanhe() {
        return moiquanhe;
    }

    public void setMoiquanhe(String moiquanhe) {
        this.moiquanhe = moiquanhe;
    }

    public int getMdut() {
        return mdut;
    }

    public void setMdut(int mdut) {
        this.mdut = mdut;
    }
}

