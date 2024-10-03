/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bảng.model;

/**
 *
 * @author Admin
 */
public class hopdong {
    private String MaHopDong;
    private String MaNhanVien;
    private String LoaiHopDong;
    private String NgayBatDau;
    private String NgayKetThuc;
    
    public hopdong(){
        
    }

    public hopdong(String MaHopDong, String MaNhanVien, String LoaiHopDong, String NgayBatDau, String NgayKetThuc) {
        this.MaHopDong = MaHopDong;
        this.MaNhanVien = MaNhanVien;
        this.LoaiHopDong = LoaiHopDong;
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
    }

    @Override
    public String toString() {
        return "hopdong{" + "MaHopDong=" + MaHopDong + ", MaNhanVien=" + MaNhanVien + ", LoaiHopDong=" + LoaiHopDong + ", NgayBatDau=" + NgayBatDau + ", NgayKetThuc=" + NgayKetThuc + '}';
    }

    public String getMaHopDong() {
        return MaHopDong;
    }

    public void setMaHopDong(String MaHopDong) {
        this.MaHopDong = MaHopDong;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getLoaiHopDong() {
        return LoaiHopDong;
    }

    public void setLoaiHopDong(String LoaiHopDong) {
        this.LoaiHopDong = LoaiHopDong;
    }

    public String getNgayBatDau() {
        return NgayBatDau;
    }

    public void setNgayBatDau(String NgayBatDau) {
        this.NgayBatDau = NgayBatDau;
    }

    public String getNgayKetThuc() {
        return NgayKetThuc;
    }

    public void setNgayKetThuc(String NgayKetThuc) {
        this.NgayKetThuc = NgayKetThuc;
    }
    
    
    
    
}

