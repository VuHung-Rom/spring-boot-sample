package com.example.Hungvv.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Nhanvien {
    @Column
    @Id
    private String manvid;
    private String tennv;
    private String chucvu;
    private Date ngaysinh;
    private String quequan;
    private BigDecimal luong;
    private byte[] anh;

    @OneToOne
    @JoinColumn(name = "manv") // Tên cột trong bảng Nhanvien liên kết với id trong bảng NguoiDung
    private Nguoidung nguoiDung;

    public Nguoidung getNguoiDung() {
        return nguoiDung;
    }

    public void setNguoiDung(Nguoidung nguoiDung) {
        this.nguoiDung = nguoiDung;
    }

    public String getManvid() {
        return manvid;
    }

    public void setManvid(String manvid) {
        this.manvid = manvid;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public BigDecimal getLuong() {
        return luong;
    }

    public void setLuong(BigDecimal luong) {
        this.luong = luong;
    }

    public byte[] getAnh() {
        return anh;
    }

    public void setAnh(byte[] anh) {
        this.anh = anh;
    }
}