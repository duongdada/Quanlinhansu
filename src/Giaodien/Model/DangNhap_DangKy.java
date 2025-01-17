/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Giaodien.Model;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class DangNhap_DangKy extends javax.swing.JFrame {

    /**
     * Creates new form DangNhap_DangKy
     */
    public DangNhap_DangKy() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        chk = new javax.swing.JCheckBox();
        txt_Password = new javax.swing.JTextField();
        txt_usename = new javax.swing.JTextField();
        btn_SignIn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng Nhập");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 36)); // NOI18N
        jLabel1.setText("PASSWORD");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 121, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 36)); // NOI18N
        jLabel2.setText("USE NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 45, 189, -1));

        chk.setText("Remember Me");
        getContentPane().add(chk, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 197, 137, 32));
        getContentPane().add(txt_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 105, 255, 49));
        getContentPane().add(txt_usename, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 37, 255, 49));

        btn_SignIn.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_SignIn.setText("Đăng Nhập");
        btn_SignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SignInActionPerformed(evt);
            }
        });
        getContentPane().add(btn_SignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 181, 255, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ảnh/background-tuyen-dung-cong-nhan_055956439.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SignInActionPerformed
        // TODO add your handling code here:
        String username = txt_usename.getText();
        String password = txt_Password.getText();
        String rs = "qlns";
        String ps = "123456";

        StringBuilder sb = new StringBuilder();

        if (username.equals("")) {
            sb.append("Username is empty");
        }
        if (password.equals("")) {
            sb.append("Password is empty");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation", JOptionPane.ERROR_MESSAGE);
            return;

        }

        if (new String(txt_usename.getText()).equals(rs) && new String(txt_Password.getText()).equals(ps)) {
            JOptionPane.showMessageDialog(this, "Đăng nhập thành công");

            dispose();
            new Dashboard().setVisible(true);


    }//GEN-LAST:event_btn_SignInActionPerformed
    }

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
            java.util.logging.Logger.getLogger(DangNhap_DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap_DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap_DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap_DangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap_DangKy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_SignIn;
    private javax.swing.JCheckBox chk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_Password;
    private javax.swing.JTextField txt_usename;
    // End of variables declaration//GEN-END:variables

    private boolean authenticate(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
