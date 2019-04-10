/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.KhachHangDAO;
import DAO.NhanVienDAO;
import DAO.NhomKhachHangDAO;
import OBJ.KhachHang;
import OBJ.NhanVien;
import OBJ.NhomKhachHang;
import java.awt.Cursor;
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
public class frmKhachhang extends javax.swing.JFrame {

    /**
     * Creates new form frmKhachhang
     */
    public frmKhachhang() {
        initComponents();
        showData();
        loadCbokh();
        NhomKhachHang nkhSelect = (NhomKhachHang) cbNhomkh.getItemAt(0);
        manhomKHStr = nkhSelect.getMaNhomKhachHang();
        searchStr = "Mã Khách Hàng";

    }
    public frmKhachhang(String ten, String ma) {
        initComponents();
        showData();
        loadCbokh();
        lbName.setText(ten);
        lbmanv.setText(ma);
        NhomKhachHang nkhSelect = (NhomKhachHang) cbNhomkh.getItemAt(0);
        manhomKHStr = nkhSelect.getMaNhomKhachHang();
        searchStr = "Mã Khách Hàng";

    }

    DefaultTableModel dtm = new DefaultTableModel();
    DefaultComboBoxModel<NhomKhachHang> dcbm = new DefaultComboBoxModel<>();

    List<KhachHang> khList = new ArrayList<>();
    List<NhomKhachHang> nkhList = new ArrayList<>();
    KhachHangDAO khDAO = new KhachHangDAO();
    NhomKhachHangDAO nkhDAO = new NhomKhachHangDAO();
    String sexStr = "Nam";
    String manhomKHStr;
    String searchStr;
    KhachHang khOBJ = new KhachHang();

    public void showData() {
        khList = khDAO.getAll();
        dtm = new DefaultTableModel();
        dtm.addColumn("Mã Khách Hàng");
        dtm.addColumn("Nhóm Khách Hàng");
        dtm.addColumn("Tên Khách Hàng");
        dtm.addColumn("Số Điện Thoại");
        dtm.addColumn("Địa Chỉ");
        dtm.addColumn("Email");
        dtm.addColumn("Ngày Sinh");
        dtm.addColumn("Giới Tính");
        for (KhachHang khOBJ : khList) {
            Vector vt = new Vector();
            vt.add(vt);
        vt.add(khOBJ.getMaNhomKhachHang());
            vt.add(khOBJ.getTenKhachHang());
            vt.add(khOBJ.getSoDienThoai());
            vt.add(khOBJ.getDiaChi());
            vt.add(khOBJ.getEmail());
            vt.add(khOBJ.getNgaySinh());
            vt.add(khOBJ.getGioiTinh());
            dtm.addRow(vt);
        }
        tblKhachhang.setModel(dtm);
    }

    public void loadCbokh() {
        dcbm = new DefaultComboBoxModel<NhomKhachHang>();
        nkhList = nkhDAO.getAll();
        for (NhomKhachHang nkhOBJ : nkhList) {
            dcbm.addElement(nkhOBJ);
        }
        cbNhomkh.setModel(dcbm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupSex = new javax.swing.ButtonGroup();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblKhachhang = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbmanv = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbMakh = new javax.swing.JLabel();
        txtDiachi = new javax.swing.JTextField();
        lbSDT = new javax.swing.JLabel();
        lbDiachi = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        txtHoten = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        lbHoten = new javax.swing.JLabel();
        txtMakh = new javax.swing.JTextField();
        lbGioitinh = new javax.swing.JLabel();
        cbosex = new javax.swing.JComboBox<>();
        lbNhomkh = new javax.swing.JLabel();
        cbNhomkh = new javax.swing.JComboBox();
        lbNgaysinh1 = new javax.swing.JLabel();
        jDate = new com.toedter.calendar.JDateChooser();
        lb = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btluu = new javax.swing.JButton();
        btsua = new javax.swing.JButton();
        btxoa = new javax.swing.JButton();
        btthoat = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        lb1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cbSearch = new javax.swing.JComboBox<>();
        lbsearch = new javax.swing.JLabel();
        lbsearch1 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblKhachhang.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tblKhachhang.setModel(new javax.swing.table.DefaultTableModel(
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
        tblKhachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhachhangMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblKhachhang);

        jPanel3.setBackground(new java.awt.Color(0, 204, 0));
        jPanel3.setForeground(new java.awt.Color(51, 204, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Office-Girl-icon (1).png"))); // NOI18N
        jLabel1.setText("KHÁCH HÀNG");

        lbmanv.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbmanv.setForeground(new java.awt.Color(0, 0, 204));

        lbName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbName.setForeground(new java.awt.Color(0, 0, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(jLabel1)
                .addContainerGap(246, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbmanv, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(lbmanv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 0), 2));

        lbMakh.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbMakh.setText("Mã KH:");

        txtDiachi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lbSDT.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbSDT.setText("Số ĐT:");

        lbDiachi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbDiachi.setText("Địa chỉ:");

        txtSDT.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtHoten.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lbEmail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbEmail.setText("Email:");

        lbHoten.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbHoten.setText("Họ và tên:");

        txtMakh.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtMakh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMakhActionPerformed(evt);
            }
        });

        lbGioitinh.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbGioitinh.setText("Giới tính:");

        cbosex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        cbosex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbosexActionPerformed(evt);
            }
        });

        lbNhomkh.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbNhomkh.setText("Nhóm KH:");

        cbNhomkh.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbNhomkh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        cbNhomkh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNhomkhActionPerformed(evt);
            }
        });

        lbNgaysinh1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbNgaysinh1.setText("Ngày:");

        jDate.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbHoten, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHoten))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbMakh, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMakh, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbNhomkh, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbNhomkh, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiachi))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSDT))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbGioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbosex, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbNgaysinh1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMakh, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMakh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNhomkh, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNhomkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHoten, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbGioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbosex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbNgaysinh1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lb.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb.setForeground(new java.awt.Color(255, 51, 102));
        lb.setText("Thông Tin Khách Hàng:");

        jPanel4.setBackground(new java.awt.Color(51, 204, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(100, 5));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(btluu, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btsua, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(btxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btthoat, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btluu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btsua, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btthoat, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(51, 204, 0));
        jPanel6.setPreferredSize(new java.awt.Dimension(100, 5));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        lb1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 51, 102));
        lb1.setText("Tìm kiếm:");

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 204, 0), 2, true));

        cbSearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã Khách Hàng", "Tên Khách Hàng" }));
        cbSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSearchActionPerformed(evt);
            }
        });

        lbsearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbsearch.setText("Tìm kiếm theo:");

        lbsearch1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbsearch1.setText("Thông tin tìm kiếm:");

        txtsearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        search.setBackground(new java.awt.Color(102, 255, 102));
        search.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-icon.png"))); // NOI18N
        search.setText("Tìm kiếm");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(cbSearch, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(search)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb1)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void cbNhomkhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNhomkhActionPerformed
        // TODO add your handling code here:
        JComboBox<NhomKhachHang> jcb = (JComboBox<NhomKhachHang>) evt.getSource();
        NhomKhachHang nkhOBJ = jcb.getItemAt(jcb.getSelectedIndex());
        manhomKHStr = nkhOBJ.getMaNhomKhachHang();


    }//GEN-LAST:event_cbNhomkhActionPerformed

    private void cbosexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbosexActionPerformed
        // TODO add your handling code here:
        JComboBox<String> jcb = (JComboBox<String>) evt.getSource();
        sexStr = jcb.getItemAt(jcb.getSelectedIndex());
    }//GEN-LAST:event_cbosexActionPerformed

    private void btluuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btluuActionPerformed
        // TODO add your handling code here:

        khOBJ.setMaKhachHang(txtMakh.getText());
        khOBJ.setTenKhachHang(txtHoten.getText());
        khOBJ.setMaNhomKhachHang(manhomKHStr);
        khOBJ.setSoDienThoai(txtSDT.getText());
        khOBJ.setDiaChi(txtDiachi.getText());
        khOBJ.setEmail(txtEmail.getText());
        khOBJ.setNgaySinh(jDate.getDate());
        khOBJ.setGioiTinh(sexStr);

        if (khOBJ.getMaKhachHang().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Mã không được bỏ trống");
        } else {
            if (khDAO.checkExist(khOBJ.getMaKhachHang())) {
                JOptionPane.showMessageDialog(this, "Mã đã tồn tại. Mời nhập lại");
            } else {
                if (khDAO.insertData(khOBJ)) {
                    showData();
                    JOptionPane.showMessageDialog(this, "Thêm dữ liệu thành công!");
                    reset();
                } else {
                    JOptionPane.showMessageDialog(this, "Thêm mới thất bại!");
                }
            }
        }


    }//GEN-LAST:event_btluuActionPerformed

    public void reset() {
        txtMakh.setEnabled(true);
        txtMakh.setText("");
        txtHoten.setText("");
        txtSDT.setText("");
        txtDiachi.setText("");
        txtEmail.setText("");

    }
    private void tblKhachhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachhangMouseClicked
        // TODO add your handling code here:
        txtMakh.setEnabled(false);
        int row = tblKhachhang.getSelectedRow();
        String maKH = tblKhachhang.getValueAt(row, 0).toString();
        khOBJ = khDAO.Find(maKH);
        txtMakh.setText(khOBJ.getMaKhachHang());
        txtHoten.setText(khOBJ.getTenKhachHang());
        txtSDT.setText(khOBJ.getSoDienThoai());
        txtDiachi.setText(khOBJ.getDiaChi());
        txtEmail.setText(khOBJ.getEmail());
        jDate.setDate(khOBJ.getNgaySinh());
        cbosex.setSelectedItem(tblKhachhang.getValueAt(row, 7).toString());
        NhomKhachHang nkh = new NhomKhachHang("", tblKhachhang.getValueAt(row, 1).toString());
        cbNhomkh.setSelectedItem(nkh);
    }//GEN-LAST:event_tblKhachhangMouseClicked

    private void btsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsuaActionPerformed
        // TODO add your handling code here   

        khOBJ.setMaKhachHang(txtMakh.getText());
        khOBJ.setTenKhachHang(txtHoten.getText());
        khOBJ.setMaNhomKhachHang(manhomKHStr);
        khOBJ.setSoDienThoai(txtSDT.getText());
        khOBJ.setDiaChi(txtDiachi.getText());
        khOBJ.setEmail(txtEmail.getText());
        khOBJ.setNgaySinh(jDate.getDate());
        khOBJ.setGioiTinh(sexStr);
        boolean bl = khDAO.updateData(khOBJ);
        if (bl) {
            showData();
            reset();
            JOptionPane.showMessageDialog(this, "Sửa dữ liệu thành công!");

        } else {
            JOptionPane.showMessageDialog(this, "Sửa dữ liệu thất bại!");
        }
    }//GEN-LAST:event_btsuaActionPerformed

    private void btxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxoaActionPerformed
        Integer confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn xóa không?", "Xóa", 2);
        if (confirm == JOptionPane.YES_OPTION) {
            boolean bl = khDAO.DeleteData(khOBJ);
            if (bl) {
                showData();
                JOptionPane.showMessageDialog(this, "Xóa dữ liệu thành công!");
                reset();
            }
        }

    }//GEN-LAST:event_btxoaActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        reset();
        showData();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void txtMakhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMakhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMakhActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        dtm = new DefaultTableModel();
        if (searchStr.equalsIgnoreCase("Mã Khách Hàng")) {
            khList = khDAO.searchData("MA_KHACH_HANG", txtsearch.getText());
        }
        if (searchStr.equalsIgnoreCase("Tên Khách Hàng")) {
            khList = khDAO.searchData("TEN_KHACH_HANG", txtsearch.getText());
        }

        dtm.addColumn("Mã Khách Hàng");
        dtm.addColumn("Nhóm Khách Hàng");
        dtm.addColumn("Tên Khách Hàng");
        dtm.addColumn("Số Điện Thoại");
        dtm.addColumn("Địa Chỉ");
        dtm.addColumn("Email");
        dtm.addColumn("Ngày Sinh");
        dtm.addColumn("Giới Tính");
        for (KhachHang khOBJ : khList) {
            Vector vt = new Vector();
            vt.add(khOBJ.getMaKhachHang());
            vt.add(khOBJ.getMaNhomKhachHang());
            vt.add(khOBJ.getTenKhachHang());
            vt.add(khOBJ.getSoDienThoai());
            vt.add(khOBJ.getDiaChi());
            vt.add(khOBJ.getEmail());
            vt.add(khOBJ.getNgaySinh());
            vt.add(khOBJ.getGioiTinh());
            dtm.addRow(vt);
        }
        tblKhachhang.setModel(dtm);
    }//GEN-LAST:event_searchActionPerformed

    private void cbSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSearchActionPerformed
        // TODO add your handling code here:
        JComboBox<String> jcb = (JComboBox<String>) evt.getSource();
        searchStr = jcb.getItemAt(jcb.getSelectedIndex());

    }//GEN-LAST:event_cbSearchActionPerformed

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
            java.util.logging.Logger.getLogger(frmKhachhang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmKhachhang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmKhachhang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmKhachhang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmKhachhang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btluu;
    private javax.swing.JButton btsua;
    private javax.swing.JButton btthoat;
    private javax.swing.JButton btxoa;
    private javax.swing.JComboBox cbNhomkh;
    private javax.swing.JComboBox<String> cbSearch;
    private javax.swing.JComboBox<String> cbosex;
    private javax.swing.ButtonGroup groupSex;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lbDiachi;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbGioitinh;
    private javax.swing.JLabel lbHoten;
    private javax.swing.JLabel lbMakh;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbNgaysinh1;
    private javax.swing.JLabel lbNhomkh;
    private javax.swing.JLabel lbSDT;
    private javax.swing.JLabel lbmanv;
    private javax.swing.JLabel lbsearch;
    private javax.swing.JLabel lbsearch1;
    private javax.swing.JButton search;
    private javax.swing.JTable tblKhachhang;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoten;
    private javax.swing.JTextField txtMakh;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
