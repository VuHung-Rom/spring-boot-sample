package com.example.Hungvv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.math.BigDecimal;
@Entity
public class ThuChi {
    @Column
    @Id
    private String MaKhoan;
    private String TenKhoan;
    private Date NgayTH;
    private String NguoiTH;
    private String NguoiNhan;
    private BigDecimal Tien;
    private String LoaiTien;
    private String LoaiHinh;
    private String MaGD;


    public String getMaKhoan() {
        return MaKhoan;
    }

    public void setMaKhoan(String maKhoan) {
        MaKhoan = maKhoan;
    }

    public String getTenKhoan() {
        return TenKhoan;
    }

    public void setTenKhoan(String tenKhoan) {
        TenKhoan = tenKhoan;
    }

    public Date getNgayTH() {
        return NgayTH;
    }

    public void setNgayTH(Date ngayTH) {
        NgayTH = ngayTH;
    }

    public String getNguoiTH() {
        return NguoiTH;
    }

    public void setNguoiTH(String nguoiTH) {
        NguoiTH = nguoiTH;
    }

    public String getNguoiNhan() {
        return NguoiNhan;
    }

    public void setNguoiNhan(String nguoiNhan) {
        NguoiNhan = nguoiNhan;
    }

    public BigDecimal getTien() {
        return Tien;
    }

    public void setTien(BigDecimal tien) {
        Tien = tien;
    }

    public String getLoaiTien() {
        return LoaiTien;
    }

    public void setLoaiTien(String loaiTien) {
        LoaiTien = loaiTien;
    }

    public String getLoaiHinh() {
        return LoaiHinh;
    }

    public void setLoaiHinh(String loaiHinh) {
        LoaiHinh = loaiHinh;
    }

    public String getMaGD() {
        return MaGD;
    }

    public void setMaGD(String maGD) {
        MaGD = maGD;
    }
}
