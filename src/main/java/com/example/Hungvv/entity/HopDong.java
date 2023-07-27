package com.example.Hungvv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity

public class HopDong {
    @Column
    @Id
    private String MaHD;
    private String TenHD;
    private Date NgayKy;
    private Date NgayTK;
    private Date NgayKT;
    private String NguoiKy;
    private String NVTK;
    private String TinhTrang;
    private String DongSP;
    private String MaDT;
    private String MaKH;
    private double Tien;
    private String LoaiTien;



    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String maHD) {
        MaHD = maHD;
    }

    public String getTenHD() {
        return TenHD;
    }

    public void setTenHD(String tenHD) {
        TenHD = tenHD;
    }

    public Date getNgayKy() {
        return NgayKy;
    }

    public void setNgayKy(Date ngayKy) {
        NgayKy = ngayKy;
    }

    public Date getNgayTK() {
        return NgayTK;
    }

    public void setNgayTK(Date ngayTK) {
        NgayTK = ngayTK;
    }

    public Date getNgayKT() {
        return NgayKT;
    }

    public void setNgayKT(Date ngayKT) {
        NgayKT = ngayKT;
    }

    public String getNguoiKy() {
        return NguoiKy;
    }

    public void setNguoiKy(String nguoiKy) {
        NguoiKy = nguoiKy;
    }

    public String getNVTK() {
        return NVTK;
    }

    public void setNVTK(String NVTK) {
        this.NVTK = NVTK;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        TinhTrang = tinhTrang;
    }

    public String getDongSP() {
        return DongSP;
    }

    public void setDongSP(String dongSP) {
        DongSP = dongSP;
    }

    public String getMaDT() {
        return MaDT;
    }

    public void setMaDT(String maDT) {
        MaDT = maDT;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String maKH) {
        MaKH = maKH;
    }

    public double getTien() {
        return Tien;
    }

    public void setTien(double tien) {
        Tien = tien;
    }

    public String getLoaiTien() {
        return LoaiTien;
    }

    public void setLoaiTien(String loaiTien) {
        LoaiTien = loaiTien;
    }
}
