/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import OBJ.ChiNhanh;
import OBJ.NhanVien;
import UTILS.MD5;
import UTILS.MySQLConnection;
import UTILS.SQLServerConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class NhanVienDAO {

    public List<NhanVien> getAll() {
        List<NhanVien> nvList = new ArrayList<>();
//        try {
//
//            Connection conn = MySQLConnection.getConnection();
//
//            Statement stm = conn.createStatement();
//
//            ResultSet rs = stm.executeQuery("SELECT * FROM tbl_nhan_vien limit 0,5");
//
//            while (rs.next()) {
//                NhanVien nv = new NhanVien();
//                nv.setMaNhanVien(rs.getString("MA_NHAN_VIEN"));
//                nv.setTenNhanVien(rs.getString("TEN_NHAN_VIEN"));
//                nv.setNhomNhanVien(rs.getString("NHOM_NHAN_VIEN"));
//                nv.setGioiTinh(rs.getString("GIOI_TINH"));
//                nv.setSoDienThoai(rs.getString("SO_DIEN_THOAI"));
//                nv.setEmail(rs.getString("EMAIL"));
//                nv.setMatKhau(rs.getString("MAT_KHAU"));
//                nvList.add(nv);
//            }
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
        return nvList;
    }

    public List<NhanVien> searchData(String colum, String input) {
        List<NhanVien> nvList = new ArrayList<>();
//        try {
//
//            Connection conn = MySQLConnection.getConnection();
//
//            Statement stm = conn.createStatement();
//
//            ResultSet rs = stm.executeQuery("SELECT * FROM tbl_nhan_vien "
//                    + "where " + colum + " LIKE '%" + input + "%'");
//
//            while (rs.next()) {
//                NhanVien nvOBJ = new NhanVien();
//                nvOBJ.setMaNhanVien(rs.getString("MA_NHAN_VIEN"));
//                nvOBJ.setTenNhanVien(rs.getString("TEN_NHAN_VIEN"));
//                nvOBJ.setNhomNhanVien(rs.getString("NHOM_NHAN_VIEN"));
//                nvOBJ.setGioiTinh(rs.getString("GIOI_TINH"));
//                nvOBJ.setSoDienThoai(rs.getString("SO_DIEN_THOAI"));
//                nvOBJ.setEmail(rs.getString("EMAIL"));
//                nvOBJ.setMatKhau(rs.getString("MAT_KHAU"));
//
//                nvList.add(nvOBJ);
//            }
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
        return nvList;
    }

    public boolean insertData(NhanVien nvObj) {
         Connection conn = null;
//        try {
//            conn = MySQLConnection.getConnection();
//
//            PreparedStatement statement = conn.prepareStatement("INSERT INTO tbl_nhan_vien VALUES (?,?,?,?,?,?,MD5(?))");
//            statement.setString(1, nvObj.getMaNhanVien());
//            statement.setString(2, nvObj.getTenNhanVien());
//            statement.setString(3, nvObj.getNhomNhanVien());
//            statement.setString(4, nvObj.getGioiTinh());
//            statement.setString(5, nvObj.getSoDienThoai());
//            statement.setString(6, nvObj.getEmail());
//            statement.setString(7, nvObj.getMatKhau());
//            statement.execute();
//            return true;
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
        return false;
    }

    public boolean updateData(NhanVien nvObj) {
//        try {
//            Connection conn = null;
//
//            conn = MySQLConnection.getConnection();
//
//            PreparedStatement statement = conn.prepareStatement("UPDATE tbl_nhan_vien SET TEN_NHAN_VIEN = ?, NHOM_NHAN_VIEN = ?, GIOI_TINH = ?, SO_DIEN_THOAI = ?, EMAIL = ? WHERE MA_NHAN_VIEN = ?");
//            statement.setString(1, nvObj.getTenNhanVien());
//            statement.setString(2, nvObj.getNhomNhanVien());
//            statement.setString(3, nvObj.getGioiTinh());
//            statement.setString(4, nvObj.getSoDienThoai());
//            statement.setString(5, nvObj.getEmail());
//            statement.setString(6, nvObj.getMaNhanVien());
//            statement.execute();
//            return true;
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
        return false;
    }

    public boolean DeleteData(NhanVien nvObj) {
        try {
            Connection conn = null;

            conn = MySQLConnection.getConnection();

            PreparedStatement statement = conn.prepareStatement("DELETE FROM  tbl_nhan_vien WHERE MA_NHAN_VIEN = ?");
            statement.setString(1, nvObj.getMaNhanVien());
            statement.execute();
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean checkExist(String MaNV) {
        try {
            Connection conn = MySQLConnection.getConnection();

            PreparedStatement statement = conn.prepareStatement("SELECT * FROM tbl_nhan_vien WHERE MA_NHAN_VIEN = ?");

            statement.setString(1, MaNV);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                return true;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public NhanVien findOne(String username) {
        NhanVien nv = new NhanVien();
        try {

            Connection conn = SQLServerConnection.getSQLServerConnection();

            PreparedStatement stm = conn.prepareStatement("SELECT * FROM dbo.[user] where username = ?");
            stm.setString(1, username);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                nv.setId(rs.getLong("id"));
                nv.setMaNhanVien(rs.getString("code"));
                nv.setTenNhanVien(rs.getString("name"));
                nv.setSoDienThoai(rs.getString("phone"));
                nv.setTaiKhoan(rs.getString("username"));
                nv.setEmail(rs.getString("email"));
                nv.setChiNhanh(new ChiNhanh(rs.getLong("site_id")));
                return nv;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nv;
    }

    public NhanVien login(String manv, String pass) {
        try {
            Connection conn = SQLServerConnection.getSQLServerConnection();

            PreparedStatement stm = conn.prepareStatement("SELECT u.* FROM dbo.[user] u "
                    + " inner join dbo.role r on r.id = u.role_id "
                    + " inner join dbo.site s on s.id = u.site_id"
                    + " WHERE u.username = ? AND u.password = ?"
                    + " and r.code = 'ROLE_EMPLOYEE'");

            stm.setString(1, manv);
            stm.setString(2, MD5.hash(pass));
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setTenNhanVien(rs.getString("name"));
                nv.setMaNhanVien(rs.getString("code"));
                return nv;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public boolean ChangePass(String tk, String mk) {
        try {
            Connection conn = null;
            conn = SQLServerConnection.getSQLServerConnection();

            PreparedStatement statement = conn.prepareStatement("UPDATE dbo.[user] SET password = ? WHERE username = ?");
            statement.setString(1, mk);
            statement.setString(2, tk);

            statement.execute();
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
