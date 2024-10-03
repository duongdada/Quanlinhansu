/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bảng.model;

/**
 *
 * @author Admin
 */
public class phongban {
    private String MaPhongBan;
    private String TenPhongBan;
    private String Mota;
    
    public phongban(){
        
    }

    public phongban(String MaPhongBan, String TenPhongBan, String Mota) {
        this.MaPhongBan = MaPhongBan;
        this.TenPhongBan = TenPhongBan;
        this.Mota = Mota;
    }

    @Override
    public String toString() {
        return "phongban{" + "MaPhongBan=" + MaPhongBan + ", TenPhongBan=" + TenPhongBan + ", Mota=" + Mota + '}';
    }

    public String getMaPhongBan() {
        return MaPhongBan;
    }

    public void setMaPhongBan(String MaPhongBan) {
        this.MaPhongBan = MaPhongBan;
    }

    public String getTenPhongBan() {
        return TenPhongBan;
    }

    public void setTenPhongBan(String TenPhongBan) {
        this.TenPhongBan = TenPhongBan;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }
    
    
    
    
}
