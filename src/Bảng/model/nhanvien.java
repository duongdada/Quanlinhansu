/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bảng.model;

import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class nhanvien {
    private String MaNhanVien;
    private String HoTen;
    private String NgaySinh;
    private Enum GioiTinh;
    private String  DiaChi;
    private String DienThoai;
    private String Email;
    private String MaPhongBan;
    private String ChucVu;
    private String NgayVaoLam;
    private String LuongCoBan;
    
    public nhanvien(){
        
    }

    public nhanvien(String MaNhanVien, String HoTen, String NgaySinh, Enum GioiTinh, String DiaChi, String DienThoai, String Email, String MaPhongBan, String ChucVu, String NgayVaoLam, String LuongCoBan) {
        this.MaNhanVien = MaNhanVien;
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
        this.DienThoai = DienThoai;
        this.Email = Email;
        this.MaPhongBan = MaPhongBan;
        this.ChucVu = ChucVu;
        this.NgayVaoLam = NgayVaoLam;
        this.LuongCoBan = LuongCoBan;
    }
    

    @Override
    public String toString() {
        return "nhanvien{" + "MaNhanVien=" + MaNhanVien + ", HoTen=" + HoTen + ", NgaySinh=" + NgaySinh + ", GioiTinh=" + GioiTinh + ", DiaChi=" + DiaChi + ", DienThoai=" + DienThoai + ", Email=" + Email + ", MaPhongBan=" + MaPhongBan + ", ChucVu=" + ChucVu + ", NgayVaoLam=" + NgayVaoLam + ", LuongCoBan=" + LuongCoBan + '}';
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public Enum getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(Enum GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getDienThoai() {
        return DienThoai;
    }

    public void setDienThoai(String DienThoai) {
        this.DienThoai = DienThoai;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getMaPhongBan() {
        return MaPhongBan;
    }

    public void setMaPhongBan(String MaPhongBan) {
        this.MaPhongBan = MaPhongBan;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public String getNgayVaoLam() {
        return NgayVaoLam;
    }

    public void setNgayVaoLam(String NgayVaoLam) {
        this.NgayVaoLam = NgayVaoLam;
    }

    public String getLuongCoBan() {
        return LuongCoBan;
    }

    public void setLuongCoBan(String LuongCoBan) {
        this.LuongCoBan = LuongCoBan;
    }
    
    
    
    
    
}
