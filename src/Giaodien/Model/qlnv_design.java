/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Giaodien.Model;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.awt.*;
import javax.swing.ImageIcon;
/**
 *
 * @author Admin
 */
public class qlnv_design extends javax.swing.JFrame {

    /**
     * Creates new form Quan_ly_chung
     */
    public qlnv_design() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_qlnv = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_ns = new javax.swing.JTextField();
        txt_dc = new javax.swing.JTextField();
        txt_gt = new javax.swing.JTextField();
        txt_ma = new javax.swing.JTextField();
        txt_ht = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_ngayvao = new javax.swing.JTextField();
        txt_chucvu = new javax.swing.JTextField();
        txt_mapb = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_dt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_lcb = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btn_thoat = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btn_hienthi = new javax.swing.JButton();
        btn_them2 = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_find = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        jLabel13.setText("jLabel13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lí nhân sự");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_qlnv.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic", 0, 18))); // NOI18N
        tb_qlnv.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        tb_qlnv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Họ tên", "Ngày sinh", "Giới tính ", "Địa chỉ", "Điện thoại", "Email", "Mã phòng ban", "Chức vụ", "Ngày vào làm ", "Lương cơ bản"
            }
        ));
        tb_qlnv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_qlnvMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_qlnv);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 478, 1200, 353));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Họ tên:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 108, 81, 46));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Mã nhân viên: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 50, 86, 46));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Địa chỉ:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 300, 66, 46));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Giới tính:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 236, 66, 46));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Ngày sinh: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 172, 73, 46));
        jPanel1.add(txt_ns, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 172, 337, 46));
        jPanel1.add(txt_dc, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 306, 334, 46));
        jPanel1.add(txt_gt, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 236, 334, 46));
        jPanel1.add(txt_ma, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 50, 337, 46));
        jPanel1.add(txt_ht, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 108, 337, 46));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 66, 46));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Điện thoại");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 370, 66, 46));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Chức vụ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 172, 90, 46));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Ngày vào làm");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 236, 93, 46));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Mã phòng ban");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 108, 90, 46));
        jPanel1.add(txt_ngayvao, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 242, 297, 46));
        jPanel1.add(txt_chucvu, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 172, 300, 46));
        jPanel1.add(txt_mapb, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 108, 300, 46));
        jPanel1.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 50, 302, 46));
        jPanel1.add(txt_dt, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 370, 334, 46));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Lương cơ bản:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 306, 93, 46));
        jPanel1.add(txt_lcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 306, 297, 46));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1164, 97, -1, 42));

        btn_thoat.setBackground(new java.awt.Color(204, 204, 204));
        btn_thoat.setForeground(new java.awt.Color(204, 204, 204));
        btn_thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ảnh/Exit.png"))); // NOI18N
        btn_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoatActionPerformed(evt);
            }
        });
        jPanel1.add(btn_thoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 50, 40, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ảnh/Background_qlnv.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 20, 1200, 450));

        jLabel15.setText("jLabel15");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 170, 160, 140));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 2, -1, 480));

        btn_hienthi.setBackground(new java.awt.Color(204, 204, 204));
        btn_hienthi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ảnh/Fatcow-Farm-Fresh-Table-export.32.png"))); // NOI18N
        btn_hienthi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hienthiActionPerformed(evt);
            }
        });
        getContentPane().add(btn_hienthi, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 837, 133, 62));

        btn_them2.setBackground(new java.awt.Color(204, 204, 204));
        btn_them2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_them2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ảnh/Add.png"))); // NOI18N
        btn_them2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_them2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_them2, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 837, 146, 62));

        btn_xoa.setBackground(new java.awt.Color(204, 204, 204));
        btn_xoa.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ảnh/Delete.png"))); // NOI18N
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(955, 837, 146, 62));

        btn_sua.setBackground(new java.awt.Color(204, 204, 204));
        btn_sua.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ảnh/Edit.png"))); // NOI18N
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 837, 146, 62));

        btn_find.setBackground(new java.awt.Color(204, 204, 204));
        btn_find.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_find.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ảnh/Search-icon.png"))); // NOI18N
        btn_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_findActionPerformed(evt);
            }
        });
        getContentPane().add(btn_find, new org.netbeans.lib.awtextra.AbsoluteConstraints(747, 837, 146, 62));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ảnh/Background_qlnv.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 830, 1200, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_hienthiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hienthiActionPerformed
        // TODO add your handling code here:
         
       try{
           
            Connection kn = ketnoi.KNCSDL();
            String sql1="Select *from nhanvien";
            Statement stm = kn.createStatement();
            ResultSet rs = stm.executeQuery(sql1);
            DefaultTableModel dtm = (DefaultTableModel) tb_qlnv.getModel();
                dtm.setRowCount(0);
                
            //Doc cac ban ghi trong rs va dua len bang
            while(rs.next()){
                Object objliss[]={
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getString(10),
                    rs.getString(11)
                };
                dtm.addRow(objliss);
                tb_qlnv.setModel(dtm);
                
            }
            
        } catch(SQLException ex){
            Logger.getLogger(qlnv_design.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_hienthiActionPerformed

    private void tb_qlnvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_qlnvMouseClicked
        // TODO add your handling code here:
        int row=tb_qlnv.getSelectedRow();;
         String ma = tb_qlnv.getValueAt(row, 0).toString();
         String hoten = tb_qlnv.getValueAt(row, 1).toString();
         String ngaysinh = tb_qlnv.getValueAt(row, 2).toString();
         String gioitinh = tb_qlnv.getValueAt(row, 3).toString();
         String diachi = tb_qlnv.getValueAt(row, 4).toString();
         String dienthoai = tb_qlnv.getValueAt(row, 5).toString();
         String email = tb_qlnv.getValueAt(row, 6).toString();
         String maphongban = tb_qlnv.getValueAt(row, 7).toString();
         String chucvu = tb_qlnv.getValueAt(row, 8).toString();
         String ngayvaolam = tb_qlnv.getValueAt(row, 9).toString();
         String luongcoban = tb_qlnv.getValueAt(row, 10).toString();
         
         txt_ma.setText(ma);
         txt_ht.setText(hoten);
         txt_ns.setText(hoten);
         txt_gt.setText(gioitinh);
         txt_dc.setText(diachi);
         txt_dt.setText(dienthoai);
         txt_email.setText(email);
         txt_mapb.setText(maphongban);
         txt_chucvu.setText(chucvu);
         txt_ngayvao.setText(ngayvaolam);
         txt_lcb.setText(luongcoban);
    }//GEN-LAST:event_tb_qlnvMouseClicked

    private void btn_them2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_them2ActionPerformed
        // TODO add your handling code here:
        
          String ma=txt_ma.getText();
          String hoten=txt_ht.getText();
          String ngaysinh=txt_ns.getText();
                  String gioitinh=txt_gt.getText();
                          String diachi=txt_dc.getText();
                                  String dienthoai=txt_dt.getText();
                                          String email=txt_email.getText();
                                                  String maphongban=txt_mapb.getText();
                                                          String chucvu=txt_chucvu.getText();
                                                                  String ngayvaolam=txt_ngayvao.getText();
                                                                          String luongcoban=txt_lcb.getText();
                                                                  
          
        try{
            Connection kn=ketnoi.KNCSDL();
           String sqlthem=" Insert into nhanvien values('"+ma+"','"+hoten+"','"+ngaysinh+"','"+gioitinh+"','"+diachi+"','"+dienthoai+"','"+email+"','"+maphongban+"','"+chucvu+"','"+ngayvaolam+"','"+luongcoban+"')";
            Statement stm =kn.createStatement();
            stm.executeUpdate(sqlthem);
            String sql1="Select *from nhanvien";
            ResultSet rs = stm.executeQuery(sql1);
            DefaultTableModel dtm = (DefaultTableModel) tb_qlnv.getModel();
            dtm.setRowCount(0);
            
            while(rs.next()){
                Object objliss[]={
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getString(10),
                    rs.getString(11)
                     
                    
                };
                dtm.addRow(objliss);
                tb_qlnv.setModel(dtm);
            }
            
        } catch(SQLException ex){
            Logger.getLogger(qlnv_design.this.getName()).log(Level.SEVERE,null,ex);
        }
        
    }//GEN-LAST:event_btn_them2ActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:
        String ma=txt_ma.getText();
        String hoten=txt_ht.getText();
        String ngaysinh = txt_ns.getText();
        String gioitinh = txt_gt.getText();
        String diachi = txt_dc.getText();
        String dienthoai = txt_dt.getText();
        String email = txt_email.getText();
        String maphongban = txt_mapb.getText();
        String chucvu = txt_chucvu.getText();
        String ngayvaolam = txt_ngayvao.getText();
        String luongcoban = txt_lcb.getText();
        
        try {
            Connection kn = ketnoi.KNCSDL();
            String sqlsua = "Update nhanvien set HoTen = '"+hoten+"', NgaySinh='"+ngaysinh+"', GioiTinh='"+gioitinh+"', DiaChi='"+diachi+"', DienThoai = '"+dienthoai+"', Email='"+email+"', MaPhongBan='"+maphongban+"',ChucVu='"+chucvu+"',NgayVaoLam='"+ngayvaolam+"', LuongCoBan='"+luongcoban+"' where MaNhanVien='"+ma+"'";
            Statement stm = kn.createStatement();
            stm.executeUpdate(sqlsua);
            String sq2 = "Select * from nhanvien";
            ResultSet rs = stm.executeQuery(sq2);
            DefaultTableModel dtm = (DefaultTableModel) tb_qlnv.getModel();
            dtm.setRowCount(0)
                    ;
            
            while(rs.next()){
                Object objliss[]={
                  rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getString(10),
                    rs.getString(11)
                };
                dtm.addRow(objliss);
                tb_qlnv.setModel(dtm);
            }
        } catch (SQLException ex) {
            Logger.getLogger(qlnv_design.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoatActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this,"Bạn chắc chắn muốn thoát chứ","Thoát",JOptionPane.YES_NO_OPTION);
        if(confirm==JOptionPane.YES_OPTION)
        {
            dispose();
        }
        
     
         new Dashboard().setVisible(true); 
    }//GEN-LAST:event_btn_thoatActionPerformed

    private void btn_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_findActionPerformed
        // TODO add your handling code here:
         String ma=txt_ma.getText();
        String hoten=txt_ht.getText();
        String ngaysinh = txt_ns.getText();
        String gioitinh = txt_gt.getText();
        String diachi = txt_dc.getText();
        String dienthoai = txt_dt.getText();
        String email = txt_email.getText();
        String maphongban = txt_mapb.getText();
        String chucvu = txt_chucvu.getText();
        String ngayvaolam = txt_ngayvao.getText();
        String luongcoban = txt_lcb.getText();
        
        try {
            Connection kn = ketnoi.KNCSDL();
            String sqlfind="Select * from nhanvien where MaNhanVien = '"+txt_ma.getText()+"'";
            Statement stm = kn.createStatement();
          
            ResultSet rs= stm.executeQuery(sqlfind);
            DefaultTableModel dtm = (DefaultTableModel) tb_qlnv.getModel();
            dtm.setRowCount(0);
            
            
            while(rs.next()){
                Object objliss[]={
                  rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getString(10),
                    rs.getString(11)
                };
                dtm.addRow(objliss);
                tb_qlnv.setModel(dtm);
            }
                    
        
        } catch (SQLException ex) {
            Logger.getLogger(qlnv_design.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_findActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
         String ma=txt_ma.getText();
        String hoten=txt_ht.getText();
        String ngaysinh = txt_ns.getText();
        String gioitinh = txt_gt.getText();
        String diachi = txt_dc.getText();
        String dienthoai = txt_dt.getText();
        String email = txt_email.getText();
        String maphongban = txt_mapb.getText();
        String chucvu = txt_chucvu.getText();
        String ngayvaolam = txt_ngayvao.getText();
        String luongcoban = txt_lcb.getText();
        
        try {
            Connection kn = ketnoi.KNCSDL();
            String sqlxoa="Delete from nhanvien where MaNhanVien='"+ma+"'";
            Statement stm=kn.createStatement();
            stm.executeUpdate(sqlxoa);
            String sql1="Select *from nhanvien";
            ResultSet rs = stm.executeQuery(sql1);
            DefaultTableModel dtm = (DefaultTableModel) tb_qlnv.getModel();
            dtm.setRowCount(0);
            while(rs.next()){
                Object objliss[]={
                rs.getString(1),
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),rs.getString(10),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getString(11)
                    
            };
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(qlnv_design.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(qlnv_design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(qlnv_design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(qlnv_design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(qlnv_design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new qlnv_design().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_find;
    private javax.swing.JButton btn_hienthi;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them2;
    private javax.swing.JButton btn_thoat;
    private javax.swing.JButton btn_xoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_qlnv;
    private javax.swing.JTextField txt_chucvu;
    private javax.swing.JTextField txt_dc;
    private javax.swing.JTextField txt_dt;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_gt;
    private javax.swing.JTextField txt_ht;
    private javax.swing.JTextField txt_lcb;
    private javax.swing.JTextField txt_ma;
    private javax.swing.JTextField txt_mapb;
    private javax.swing.JTextField txt_ngayvao;
    private javax.swing.JTextField txt_ns;
    // End of variables declaration//GEN-END:variables
}
