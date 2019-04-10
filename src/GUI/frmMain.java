/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.NhanVienDAO;
import OBJ.NhanVien;
import javax.swing.JOptionPane;

public class frmMain extends javax.swing.JFrame {
    private String tk;
    public frmMain() {
        initComponents();
        
    }

    public frmMain(boolean bl, String name, String manv, String tk) {
        initComponents();
        lbName.setText(name);
        lbmanv.setText(manv);
        this.tk = tk;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbmanv = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        mnuBanHang = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        mnuNV5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuNV1 = new javax.swing.JMenuItem();
        mnuNV2 = new javax.swing.JMenuItem();
        mnuNV3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));

        jPanel1.setBackground(new java.awt.Color(51, 204, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PHẦN MỀM QUẢN LÝ BÁN HÀNG");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Xin Chào:");

        lbName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbName.setForeground(new java.awt.Color(0, 0, 204));

        lbmanv.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbmanv.setForeground(new java.awt.Color(0, 0, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbmanv, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbmanv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 204, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/634449434755739630_CuaHang3.jpg"))); // NOI18N

        jMenuBar1.setBackground(new java.awt.Color(153, 255, 153));

        jMenu2.setForeground(new java.awt.Color(255, 0, 0));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Settings-icon.png"))); // NOI18N
        jMenu2.setText("Hệ Thống");

        jMenuItem8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jMenuItem8.setForeground(new java.awt.Color(0, 51, 153));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Register-icon.png"))); // NOI18N
        jMenuItem8.setText("Đổi mật khẩu");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jMenuItem11.setForeground(new java.awt.Color(0, 51, 153));
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home-icon (1).png"))); // NOI18N
        jMenuItem11.setText("Đăng xuất");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jMenuBar1.add(jMenu2);

        jMenu1.setForeground(new java.awt.Color(255, 0, 0));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/investment-menu-quality-icon.png"))); // NOI18N
        jMenu1.setText("Danh Mục");

        jMenuItem3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(0, 51, 153));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Office-Girl-icon.png"))); // NOI18N
        jMenuItem3.setText("Khách hàng");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jMenuItem4.setForeground(new java.awt.Color(0, 51, 153));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Download-to-laptop-icon.png"))); // NOI18N
        jMenuItem4.setText("Sản phẩm");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        mnuBanHang.setForeground(new java.awt.Color(255, 0, 0));
        mnuBanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/restaurant-menu-icon.png"))); // NOI18N
        mnuBanHang.setText("Bán Hàng");
        mnuBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuBanHangMouseClicked(evt);
            }
        });
        mnuBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBanHangActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnuBanHang);

        jMenu4.setForeground(new java.awt.Color(204, 0, 0));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/preferences-management-service-icon.png"))); // NOI18N
        jMenu4.setText("Quản Lý");

        mnuNV5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        mnuNV5.setForeground(new java.awt.Color(0, 51, 153));
        mnuNV5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-icon.png"))); // NOI18N
        mnuNV5.setText("Tìm Kiếm HĐ");
        mnuNV5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNV5ActionPerformed(evt);
            }
        });
        jMenu4.add(mnuNV5);

        jMenuBar1.add(jMenu4);

        jMenu3.setForeground(new java.awt.Color(204, 0, 0));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Apps-Help-Info-icon.png"))); // NOI18N
        jMenu3.setText("Trợ Giúp");

        mnuNV1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        mnuNV1.setForeground(new java.awt.Color(0, 51, 153));
        mnuNV1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Phone-icon.png"))); // NOI18N
        mnuNV1.setText("Liên hệ");
        mnuNV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNV1ActionPerformed(evt);
            }
        });
        jMenu3.add(mnuNV1);

        mnuNV2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        mnuNV2.setForeground(new java.awt.Color(0, 51, 153));
        mnuNV2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/info-icon.png"))); // NOI18N
        mnuNV2.setText("Thông tin phần mềm");
        mnuNV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNV2ActionPerformed(evt);
            }
        });
        jMenu3.add(mnuNV2);

        mnuNV3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        mnuNV3.setForeground(new java.awt.Color(0, 51, 153));
        mnuNV3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Apps-system-software-update-icon.png"))); // NOI18N
        mnuNV3.setText("Cập nhật phần mềm");
        mnuNV3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNV3ActionPerformed(evt);
            }
        });
        jMenu3.add(mnuNV3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        frmSanpham sp = new frmSanpham(lbName.getText(), lbmanv.getText());
        sp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        frmKhachhang kh = new frmKhachhang(lbName.getText(), lbmanv.getText());
        kh.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void mnuBanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuBanHangMouseClicked
        // TODO add your handling code here:
        frmBanHang hoadon = new frmBanHang(lbName.getText(), lbmanv.getText(), this.tk);
        hoadon.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuBanHangMouseClicked

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        Integer confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn đăng xuất?", "Thoát", 2);
        if (confirm == JOptionPane.YES_OPTION) {
            frmLogin login = new frmLogin();
            login.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        frmDoiMK doimk = new frmDoiMK(this.tk);
        doimk.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void mnuNV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNV1ActionPerformed
        // TODO add your handling code here:
        String lh = "";
        lh += "Mọi thông tin về phần mềm xin liên hệ:\n\n";
        lh += "Mẫn Văn Hậu\n\n";
        lh += "Điện thoại: 01696461667\n\n";
        lh += "Facebook: facebook.com/hau.manvan\n\n";
        lh += "Email: manhau.174@gmail.com";
        JOptionPane.showMessageDialog(this, lh, "Thông tin liên hệ", 1);
    }//GEN-LAST:event_mnuNV1ActionPerformed

    private void mnuNV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNV2ActionPerformed
        // TODO add your handling code here:
        String tt = "";
        tt += "Phần mềm: QUẢN LÝ BÁN HÀNG\n\n";
        tt += "Version: 1.0\n\n";
        tt += "Copy right@năm 2016\n";
        JOptionPane.showMessageDialog(this, tt, "Thông tin phần mềm", 1);
    }//GEN-LAST:event_mnuNV2ActionPerformed

    private void mnuNV3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNV3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Phần mềm đã được cập nhật phiên bản mới nhất.", "Cập nhật", 1);
    }//GEN-LAST:event_mnuNV3ActionPerformed

    private void mnuBanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBanHangActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_mnuBanHangActionPerformed

    private void mnuNV5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNV5ActionPerformed
        // TODO add your handling code here:
        frmTimKiemHD timkiemhd = new frmTimKiemHD(lbName.getText(), lbmanv.getText(), this.tk);
        timkiemhd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuNV5ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbmanv;
    private javax.swing.JMenu mnuBanHang;
    private javax.swing.JMenuItem mnuNV1;
    private javax.swing.JMenuItem mnuNV2;
    private javax.swing.JMenuItem mnuNV3;
    private javax.swing.JMenuItem mnuNV5;
    // End of variables declaration//GEN-END:variables
}
