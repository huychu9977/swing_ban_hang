/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.HangSanXuatDAO;
import DAO.LoaiSanPhamDAO;
import DAO.NhaCungCapDAO;
import DAO.NhanVienDAO;
import DAO.SanPhamDAO;
import DAO.XuatXuDAO;
import OBJ.HangSanXuat;
import OBJ.LoaiSanPham;
import OBJ.NhaCungCap;
import OBJ.NhanVien;
import OBJ.SanPham;
import OBJ.XuatXu;
import java.awt.Cursor;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class frmSanpham extends javax.swing.JFrame {

    /**
     * Creates new form frmSanpham
     */
    public frmSanpham() {
        initComponents();
        showData();

        loadCbLSP();
        loadCbHsx();
        loadCbXX();
        loadCbNCC();
        LoaiSanPham lspSelect = (LoaiSanPham) cbLoaisp.getItemAt(0);
        loaiSPstr = lspSelect.getMaLoaiSanPham();
        HangSanXuat hsxSelect = (HangSanXuat) cbHangsp.getItemAt(0);
        hsxStr = hsxSelect.getMaHangSX();
        XuatXu xxSelect = (XuatXu) cbXuatxu.getItemAt(0);
        xxStr = xxSelect.getMaNuoc();
        NhaCungCap nccSelect = (NhaCungCap) cbNhaCC.getItemAt(0);
        nccStr = nccSelect.getMaNCC();
    }
    public frmSanpham(String ten, String ma) {
        initComponents();
        showData();

        loadCbLSP();
        loadCbHsx();
        loadCbXX();
        loadCbNCC();
        lbName.setText(ten);
        lbmanv.setText(ma);
        LoaiSanPham lspSelect = (LoaiSanPham) cbLoaisp.getItemAt(0);
        loaiSPstr = lspSelect.getMaLoaiSanPham();
        HangSanXuat hsxSelect = (HangSanXuat) cbHangsp.getItemAt(0);
        hsxStr = hsxSelect.getMaHangSX();
        XuatXu xxSelect = (XuatXu) cbXuatxu.getItemAt(0);
        xxStr = xxSelect.getMaNuoc();
        NhaCungCap nccSelect = (NhaCungCap) cbNhaCC.getItemAt(0);
        nccStr = nccSelect.getMaNCC();
    }
    NumberFormat formatter = new DecimalFormat("###,###");
    DefaultTableModel dtm = new DefaultTableModel();
    SanPhamDAO spDAO = new SanPhamDAO();
    SanPham spOBJ = new SanPham();
    List<SanPham> spList = new ArrayList<>();
    DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
    String loaiSPstr;
    String hsxStr;
    String xxStr;
    String nccStr;
    String searchStr = "Mã Sản Phẩm";

    public void showData() {

        spList = spDAO.getAll();

        dtm = new DefaultTableModel();
        dtm.addColumn("Mã Sản Phẩm");
        dtm.addColumn("Tên Sản Phẩm");
        dtm.addColumn("Loại Sản Phẩm");
        dtm.addColumn("Hãng Sản Xuất");
        dtm.addColumn("Xuất Xứ");
        dtm.addColumn("Nhà Cung Cấp");
        dtm.addColumn("Đơn Giá");
        dtm.addColumn("Số Lượng Còn");

        for (SanPham sp : spList) {
            Vector vt = new Vector();
            vt.add(sp.getMaSanPham());
            vt.add(sp.getTenSanPham());
            vt.add(sp.getMaLoaiSanPham());
            vt.add(sp.getMaHangSanXuat());
            vt.add(sp.getXuatXu());
            vt.add(sp.getNhaCC());
            vt.add(formatter.format(sp.getDonGia()));
            vt.add(sp.getSoLuong());

            dtm.addRow(vt);
        }
        tblSanpham.setModel(dtm);
    }
    
    public void loadCbNCC(){
        List<NhaCungCap> ncclist = new ArrayList<>();
        NhaCungCapDAO nccDAO = new NhaCungCapDAO();
        
        ncclist = nccDAO.getAll();
        dcbm = new DefaultComboBoxModel();
        for (NhaCungCap ncc: ncclist) {
            dcbm.addElement(ncc);
        }
        cbNhaCC.setModel(dcbm);
    }

    public void loadCbLSP() {

        List<LoaiSanPham> lspList = new ArrayList<>();
        LoaiSanPhamDAO lspDAO = new LoaiSanPhamDAO();
        dcbm = new DefaultComboBoxModel();
        lspList = lspDAO.getAll();
        for (LoaiSanPham lspOBJ : lspList) {
            dcbm.addElement(lspOBJ);
        }
        cbLoaisp.setModel(dcbm);
    }

    public void loadCbXX() {
        List<XuatXu> xxList = new ArrayList<>();
        XuatXuDAO xxDAO = new XuatXuDAO();

        xxList = xxDAO.getAll();

        dcbm = new DefaultComboBoxModel();

        for (XuatXu xxOBJ : xxList) {
            dcbm.addElement(xxOBJ);
        }
        cbXuatxu.setModel(dcbm);
    }

    public void loadCbHsx() {
        List<HangSanXuat> hsxList = new ArrayList<>();
        HangSanXuatDAO hsxDAO = new HangSanXuatDAO();

        hsxList = hsxDAO.getAll();
        dcbm = new DefaultComboBoxModel();
        for (HangSanXuat hsxOBJ : hsxList) {
            dcbm.addElement(hsxOBJ);

        }
        cbHangsp.setModel(dcbm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        tblSanpham = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbmanv = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbHangsp = new javax.swing.JLabel();
        lbXuatxu = new javax.swing.JLabel();
        lbDongia = new javax.swing.JLabel();
        lbMasp = new javax.swing.JLabel();
        txtDongia = new javax.swing.JTextField();
        txtMasp = new javax.swing.JTextField();
        lbTensp = new javax.swing.JLabel();
        txtTensp = new javax.swing.JTextField();
        lbLoaisp = new javax.swing.JLabel();
        cbLoaisp = new javax.swing.JComboBox();
        cbHangsp = new javax.swing.JComboBox();
        cbXuatxu = new javax.swing.JComboBox();
        lbDongia1 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        cbNhaCC = new javax.swing.JComboBox();
        lbXuatxu1 = new javax.swing.JLabel();
        lb = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btluu = new javax.swing.JButton();
        btsua = new javax.swing.JButton();
        btxoa = new javax.swing.JButton();
        btthoat = new javax.swing.JButton();
        lb1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        cbNhomkh = new javax.swing.JComboBox<>();
        lbsearch = new javax.swing.JLabel();
        lbsearch1 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        btsua1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblSanpham.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tblSanpham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblSanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanphamMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblSanpham);

        jPanel3.setBackground(new java.awt.Color(0, 204, 0));
        jPanel3.setForeground(new java.awt.Color(51, 204, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Download-to-laptop-icon (1).png"))); // NOI18N
        jLabel1.setText("SẢN PHẨM");

        lbName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbName.setForeground(new java.awt.Color(0, 0, 204));

        lbmanv.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbmanv.setForeground(new java.awt.Color(0, 0, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbmanv, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(lbmanv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 0), 2));

        lbHangsp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbHangsp.setText("Hãng SP:");

        lbXuatxu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbXuatxu.setText("Xuất xứ:");

        lbDongia.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbDongia.setText("Đơn giá:");

        lbMasp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbMasp.setText("Mã SP:");

        txtDongia.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDongia.setText("0");

        txtMasp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lbTensp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbTensp.setText("Tên SP:");

        txtTensp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lbLoaisp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbLoaisp.setText("Loại SP:");

        cbLoaisp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbLoaisp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        cbLoaisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLoaispActionPerformed(evt);
            }
        });

        cbHangsp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbHangsp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        cbHangsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHangspActionPerformed(evt);
            }
        });

        cbXuatxu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbXuatxu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        cbXuatxu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbXuatxuActionPerformed(evt);
            }
        });

        lbDongia1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbDongia1.setText("Số Lượng:");

        txtSoLuong.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSoLuong.setText("0");

        cbNhaCC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbNhaCC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        cbNhaCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNhaCCActionPerformed(evt);
            }
        });

        lbXuatxu1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbXuatxu1.setText("Nhà CC:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbDongia, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txtDongia, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbDongia1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbXuatxu, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(cbXuatxu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbXuatxu1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbNhaCC, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbMasp, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(txtMasp, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTensp, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbLoaisp, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTensp, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(cbLoaisp, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbHangsp, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbHangsp, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMasp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMasp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTensp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTensp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLoaisp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbLoaisp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHangsp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbHangsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbXuatxu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbXuatxu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbXuatxu1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNhaCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbDongia1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbDongia, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDongia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        lb.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb.setForeground(new java.awt.Color(255, 51, 102));
        lb.setText("Thông Tin Sản Phẩm:");

        jPanel5.setBackground(new java.awt.Color(51, 204, 0));
        jPanel5.setPreferredSize(new java.awt.Dimension(100, 5));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        btluu.setBackground(new java.awt.Color(102, 255, 102));
        btluu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btluu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button-Add-icon (1).png"))); // NOI18N
        btluu.setText("Thêm");
        btluu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btluuActionPerformed(evt);
            }
        });

        btsua.setBackground(new java.awt.Color(102, 255, 102));
        btsua.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btsua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pencil-icon.png"))); // NOI18N
        btsua.setText("Sửa");
        btsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsuaActionPerformed(evt);
            }
        });

        btxoa.setBackground(new java.awt.Color(102, 255, 102));
        btxoa.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btxoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Actions-window-close-icon.png"))); // NOI18N
        btxoa.setText("Xóa");
        btxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxoaActionPerformed(evt);
            }
        });

        btthoat.setBackground(new java.awt.Color(102, 255, 102));
        btthoat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btthoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow-back-icon.png"))); // NOI18N
        btthoat.setText("Thoát");
        btthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btluu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addComponent(btsua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(55, 55, 55)
                .addComponent(btxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btthoat, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btluu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btsua, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btthoat, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lb1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 51, 102));
        lb1.setText("Tìm kiếm:");

        jPanel7.setBackground(new java.awt.Color(255, 255, 204));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 204, 0), 2, true));

        cbNhomkh.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbNhomkh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã Sản Phẩm", "Tên Sản Phẩm" }));
        cbNhomkh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNhomkhActionPerformed(evt);
            }
        });

        lbsearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbsearch.setText("Tìm kiếm theo:");

        lbsearch1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbsearch1.setText("Thông tin tìm kiếm:");

        txtsearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btsua1.setBackground(new java.awt.Color(102, 255, 102));
        btsua1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btsua1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-icon.png"))); // NOI18N
        btsua1.setText("Tìm kiếm");
        btsua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsua1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(cbNhomkh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btsua1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbNhomkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btsua1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(51, 204, 0));
        jPanel8.setPreferredSize(new java.awt.Dimension(100, 5));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button-White-Load-icon.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)))
                .addGap(14, 14, 14)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void reset() {
        txtMasp.setEnabled(true);
        txtSoLuong.setEnabled(true);
        txtMasp.setText("");
        txtTensp.setText("");
        txtDongia.setText("0");
        txtSoLuong.setText("0");
    }
    private void btluuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btluuActionPerformed
        // TODO add your handling code here:
        spOBJ.setMaSanPham(txtMasp.getText());
        spOBJ.setTenSanPham(txtTensp.getText());
        spOBJ.setMaLoaiSanPham(loaiSPstr);
        spOBJ.setMaHangSanXuat(hsxStr);
        spOBJ.setXuatXu(xxStr);
        spOBJ.setNhaCC(nccStr);
        spOBJ.setDonGia(Integer.parseInt(txtDongia.getText()));
        spOBJ.setSoLuong(Integer.parseInt(txtSoLuong.getText()));
        System.out.println(nccStr);

        if (spOBJ.getMaSanPham().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Mã không được bỏ trống!");
        } else {
            if (spDAO.checkExist(spOBJ.getMaSanPham())) {
                JOptionPane.showMessageDialog(this, "Mã đã tồn tại. Mời nhập lại!");
            } else {
                if (spDAO.insertData(spOBJ)) {
                    showData();
                    reset();
                    JOptionPane.showMessageDialog(this, "Thêm dữ liệu thành công!");
                } else {
                    JOptionPane.showMessageDialog(this, "Thêm dữ liệu thất bại!");
                }
            }
        }

    }//GEN-LAST:event_btluuActionPerformed

    private void cbLoaispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLoaispActionPerformed
        // TODO add your handling code here:
        JComboBox<LoaiSanPham> jcb = (JComboBox<LoaiSanPham>) evt.getSource();
        LoaiSanPham lspOBJ = jcb.getItemAt(jcb.getSelectedIndex());
        loaiSPstr = lspOBJ.getMaLoaiSanPham();
    }//GEN-LAST:event_cbLoaispActionPerformed

    private void cbHangspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHangspActionPerformed
        // TODO add your handling code here:
        JComboBox<HangSanXuat> jcb = (JComboBox<HangSanXuat>) evt.getSource();
        HangSanXuat hsxOBJ = jcb.getItemAt(jcb.getSelectedIndex());
        hsxStr = hsxOBJ.getMaHangSX();
    }//GEN-LAST:event_cbHangspActionPerformed

    private void cbXuatxuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbXuatxuActionPerformed
        // TODO add your handling code here:
        JComboBox<XuatXu> jcb = (JComboBox<XuatXu>) evt.getSource();
        XuatXu xxOBJ = jcb.getItemAt(jcb.getSelectedIndex());
        xxStr = xxOBJ.getMaNuoc();
    }//GEN-LAST:event_cbXuatxuActionPerformed

    private void tblSanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanphamMouseClicked
        // TODO add your handling code here:
        txtMasp.setEnabled(false);
        txtSoLuong.setEnabled(false);
        int row = tblSanpham.getSelectedRow();
        String maSP = tblSanpham.getValueAt(row, 0).toString();
        spOBJ = spDAO.Find(maSP);
        txtMasp.setText(spOBJ.getMaSanPham());
        txtTensp.setText(spOBJ.getTenSanPham());
        txtDongia.setText(String.valueOf(spOBJ.getDonGia()));
        txtSoLuong.setText(String.valueOf(spOBJ.getSoLuong()));

        LoaiSanPham lsp = new LoaiSanPham("", tblSanpham.getValueAt(row, 2).toString());
        cbLoaisp.setSelectedItem(lsp);

        HangSanXuat hsx = new HangSanXuat("", tblSanpham.getValueAt(row, 3).toString());
        cbHangsp.setSelectedItem(hsx);

        XuatXu xx = new XuatXu("", tblSanpham.getValueAt(row, 4).toString());
        cbXuatxu.setSelectedItem(xx);
        
        NhaCungCap ncc = new NhaCungCap("", tblSanpham.getValueAt(row, 5).toString(), "", "", "");
        cbNhaCC.setSelectedItem(ncc);
    }//GEN-LAST:event_tblSanphamMouseClicked

    private void btsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsuaActionPerformed
        // TODO add your handling code here:

        spOBJ.setMaSanPham(txtMasp.getText());
        spOBJ.setTenSanPham(txtTensp.getText());
        spOBJ.setMaLoaiSanPham(loaiSPstr);
        spOBJ.setMaHangSanXuat(hsxStr);
        spOBJ.setXuatXu(xxStr);
        spOBJ.setNhaCC(nccStr);
        spOBJ.setDonGia(Integer.parseInt(txtDongia.getText()));
        spOBJ.setSoLuong(Integer.parseInt(txtSoLuong.getText()));

        if (spDAO.updateData(spOBJ)) {
            showData();
            reset();
            JOptionPane.showMessageDialog(this, "Sửa dữ liệu thành công!");
        } else {
            JOptionPane.showMessageDialog(this, "Sửa dữ liệu thất bại!");
        }


    }//GEN-LAST:event_btsuaActionPerformed

    private void btxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxoaActionPerformed
        // TODO add your handling code here:
        Integer confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn xóa không?", "Xóa", 2);

        if (confirm == JOptionPane.YES_OPTION) {
            if (spDAO.deleteData(spOBJ)) {
                showData();
                reset();
                JOptionPane.showMessageDialog(this, "Xóa dữ liệu thành công!");
            } else {
                JOptionPane.showMessageDialog(this, "Xóa dữ liệu thất bại!");
            }
        }
    }//GEN-LAST:event_btxoaActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        showData();
        reset();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btsua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsua1ActionPerformed
        // TODO add your handling code here:
        dtm = new DefaultTableModel();
        if (searchStr.equalsIgnoreCase("Mã Sản Phẩm")) {
            spList = spDAO.searchData("MA_SAN_PHAM", txtsearch.getText());
        }
        if (searchStr.equalsIgnoreCase("Tên Sản Phẩm")) {
            spList = spDAO.searchData("TEN_SAN_PHAM", txtsearch.getText());
        }
        dtm.addColumn("Mã Sản Phẩm");
        dtm.addColumn("Tên Sản Phẩm");
        dtm.addColumn("Loại Sản Phẩm");
        dtm.addColumn("Hãng Sản Xuất");
        dtm.addColumn("Xuất Xứ");
        dtm.addColumn("Nhà Cung Cấp");
        dtm.addColumn("Đơn Giá");
        dtm.addColumn("Số Lượng Còn");

        for (SanPham sp : spList) {
            Vector vt = new Vector();
            vt.add(sp.getMaSanPham());
            vt.add(sp.getTenSanPham());
            vt.add(sp.getMaLoaiSanPham());
            vt.add(sp.getMaHangSanXuat());
            vt.add(sp.getXuatXu());
            vt.add(sp.getNhaCC());
            vt.add(formatter.format(sp.getDonGia()));
            vt.add(sp.getSoLuong());

            dtm.addRow(vt);
        }
        tblSanpham.setModel(dtm);
    }//GEN-LAST:event_btsua1ActionPerformed

    private void cbNhomkhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNhomkhActionPerformed
        // TODO add your handling code here:
        JComboBox<String> jcb = (JComboBox<String>) evt.getSource();
        searchStr = jcb.getItemAt(jcb.getSelectedIndex());
    }//GEN-LAST:event_cbNhomkhActionPerformed

    private void btthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthoatActionPerformed
        // TODO add your handling code here:
        NhanVienDAO nvDAO = new NhanVienDAO();
        NhanVien nvOBJ = new NhanVien();
        nvOBJ = nvDAO.Find(lbmanv.getText());
        String nhomnv = nvOBJ.getNhomNhanVien();
        if (!nhomnv.equalsIgnoreCase("admin")) {
            frmMain main = new frmMain(false, nvOBJ.getTenNhanVien(), nvOBJ.getMaNhanVien());
            main.setVisible(true);
            this.dispose();
        } else if (nhomnv.equalsIgnoreCase("admin")) {
            frmMain main = new frmMain(true, nvOBJ.getTenNhanVien(), nvOBJ.getMaNhanVien());
            main.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btthoatActionPerformed

    private void cbNhaCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNhaCCActionPerformed
        // TODO add your handling code here:
        JComboBox<NhaCungCap> jcb = (JComboBox<NhaCungCap>) evt.getSource();
        NhaCungCap nccOBJ = jcb.getItemAt(jcb.getSelectedIndex());
        nccStr = nccOBJ.getMaNCC();
    }//GEN-LAST:event_cbNhaCCActionPerformed

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        jLabel2.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel2MouseEntered

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
            java.util.logging.Logger.getLogger(frmSanpham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSanpham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSanpham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSanpham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSanpham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btluu;
    private javax.swing.JButton btsua;
    private javax.swing.JButton btsua1;
    private javax.swing.JButton btthoat;
    private javax.swing.JButton btxoa;
    private javax.swing.JComboBox cbHangsp;
    private javax.swing.JComboBox cbLoaisp;
    private javax.swing.JComboBox cbNhaCC;
    private javax.swing.JComboBox<String> cbNhomkh;
    private javax.swing.JComboBox cbXuatxu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lbDongia;
    private javax.swing.JLabel lbDongia1;
    private javax.swing.JLabel lbHangsp;
    private javax.swing.JLabel lbLoaisp;
    private javax.swing.JLabel lbMasp;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbTensp;
    private javax.swing.JLabel lbXuatxu;
    private javax.swing.JLabel lbXuatxu1;
    private javax.swing.JLabel lbmanv;
    private javax.swing.JLabel lbsearch;
    private javax.swing.JLabel lbsearch1;
    private javax.swing.JTable tblSanpham;
    private javax.swing.JTextField txtDongia;
    private javax.swing.JTextField txtMasp;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTensp;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
