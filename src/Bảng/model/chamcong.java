/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bảng.model;

/**
 *
 * @author Admin
 */
public class chamcong {
    private String MaChamCong;
    private String MaNhanVien;
    private String Ngay;
    private String GioVao;
    private String GioRa;
    
    public chamcong(){
    }

    public chamcong(String MaChamCong, String MaNhanVien, String Ngay, String GioVao, String GioRa) {
        this.MaChamCong = MaChamCong;
        this.MaNhanVien = MaNhanVien;
        this.Ngay = Ngay;
        this.GioVao = GioVao;
        this.GioRa = GioRa;
    }

    @Override
    public String toString() {
        return "chamcong{" + "MaChamCong=" + MaChamCong + ", MaNhanVien=" + MaNhanVien + ", Ngay=" + Ngay + ", GioVao=" + GioVao + ", GioRa=" + GioRa + '}';
    }

    public String getMaChamCong() {
        return MaChamCong;
    }

    public void setMaChamCong(String MaChamCong) {
        this.MaChamCong = MaChamCong;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getNgay() {
        return Ngay;
    }

    public void setNgay(String Ngay) {
        this.Ngay = Ngay;
    }

    public String getGioVao() {
        return GioVao;
    }

    public void setGioVao(String GioVao) {
        this.GioVao = GioVao;
    }

    public String getGioRa() {
        return GioRa;
    }

    public void setGioRa(String GioRa) {
        this.GioRa = GioRa;
    }
    
    
}
