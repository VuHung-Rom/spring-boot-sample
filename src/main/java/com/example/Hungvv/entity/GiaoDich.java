package com.example.Hungvv.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity

public class GiaoDich {
    @Column
    @Id
    private String MaGD;
    private String TenGD;
    private Date NgayBD;
    private Date NgayKT;
    private String NguoiTH;
    private String MaDT;



    public String getMaGD() {
        return MaGD;
    }

    public void setMaGD(String maGD) {
        MaGD = maGD;
    }

    public String getTenGD() {
        return TenGD;
    }

    public void setTenGD(String tenGD) {
        TenGD = tenGD;
    }

    public Date getNgayBD() {
        return NgayBD;
    }

    public void setNgayBD(Date ngayBD) {
        NgayBD = ngayBD;
    }

    public Date getNgayKT() {
        return NgayKT;
    }

    public void setNgayKT(Date ngayKT) {
        NgayKT = ngayKT;
    }

    public String getNguoiTH() {
        return NguoiTH;
    }

    public void setNguoiTH(String nguoiTH) {
        NguoiTH = nguoiTH;
    }

    public String getMaDT() {
        return MaDT;
    }

    public void setMaDT(String maDT) {
        MaDT = maDT;
    }
}
