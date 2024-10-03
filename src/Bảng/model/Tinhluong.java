/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bảng.model;

import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Tinhluong {
    private String MaChamCong;
    private String TongCong;
    private String GioLam;
    private String TongLuong;
    
    
    public Tinhluong(){
       
        
    }

    public Tinhluong(String MaChamCong, String TongCong, String GioLam, String TongLuong) {
        this.MaChamCong = MaChamCong;
        this.TongCong = TongCong;
        this.GioLam = GioLam;
        this.TongLuong = TongLuong;
    }

    @Override
    public String toString() {
        return "Tinhluong{" + "MaChamCong=" + MaChamCong + ", TongCong=" + TongCong + ", GioLam=" + GioLam + ", TongLuong=" + TongLuong + '}';
    }
    private static final Logger LOG = Logger.getLogger(Tinhluong.class.getName());

    public String getMaChamCong() {
        return MaChamCong;
    }

    public void setMaChamCong(String MaChamCong) {
        this.MaChamCong = MaChamCong;
    }

    public String getTongCong() {
        return TongCong;
    }

    public void setTongCong(String TongCong) {
        this.TongCong = TongCong;
    }

    public String getGioLam() {
        return GioLam;
    }

    public void setGioLam(String GioLam) {
        this.GioLam = GioLam;
    }

    public String getTongLuong() {
        return TongLuong;
    }

    public void setTongLuong(String TongLuong) {
        this.TongLuong = TongLuong;
    }
    
   
    private String calculateTongLuong (String TongCong, String GioLam){
    int lenTongCong = TongCong.length();
        int lenGioLam = GioLam.length();
        
         // Điều kiện dừng: Nếu một trong hai chuỗi rỗng thì trả về chuỗi còn lại
        if (lenTongCong == 0) return GioLam;
        if (lenGioLam == 0) return TongCong;  // Điều kiện dừng, 1 trong 2 chuỗi rỗng thì trả về chuỗi còn lại
        
        // Lấy ký tự cuối cùng của mỗi chuỗi và tính tổng chúng
        char lastCharTongCong = TongCong.charAt(lenTongCong - 1);
        char lastCharGioLam = GioLam.charAt(lenGioLam - 1);

        int sum = (lastCharTongCong - '0') + (lastCharGioLam - '0');

        // Nếu tổng lớn hơn 9 thì cần phải nhớ 1 cho lần tính tiếp theo
        String remainingTongLuong = calculateTongLuong(
                TongCong.substring(0, lenTongCong - 1),
                GioLam.substring(0, lenGioLam - 1)  //Đệ quy
        );

        // Thêm giá trị nhớ nếu có
        if (sum > 9) {
            sum -= 10;
            remainingTongLuong = calculateTongLuong(remainingTongLuong, "1"); //Xử lý số nhớ
        }

        return remainingTongLuong + sum;
      
    }
       
    
    
    
}
