/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import OBJ.KhachHang;
import UTILS.MySQLConnection;
import UTILS.SQLServerConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class KhachHangDAO {

    public List<KhachHang> getAll() {

        List<KhachHang> khList = new ArrayList<>();

//        try {
//            Connection conn = MySQLConnection.getConnection();
//            Statement stm = conn.createStatement();
//            ResultSet rs = stm.executeQuery("SELECT * FROM tbl_khach_hang kh INNER JOIN tbl_nhom_khach_hang nkh"
//                    + " ON kh.MA_NHOM_KHACH_HANG = nkh.MA_NHOM_KHACH_HANG");
//
//            while (rs.next()) {
//
//                KhachHang kh = new KhachHang();
//                kh.setMaKhachHang(rs.getString("MA_KHACH_HANG"));
//                kh.setTenKhachHang(rs.getString("TEN_KHACH_HANG"));
//                kh.setMaNhomKhachHang(rs.getString("TEN_NHOM_KHACH_HANG"));
//                kh.setSoDienThoai(rs.getString("SO_DIEN_THOAI"));
//                kh.setDiaChi(rs.getString("DIA_CHI"));
//                kh.setEmail(rs.getString("EMAIL"));
//                kh.setNgaySinh(rs.getDate("NGAY_SINH"));
//                kh.setGioiTinh(rs.getString("GIOI_TINH"));
//
//                khList.add(kh);
//
//            }
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
        return khList;
    }

    public List<KhachHang> searchData(String input) {

        List<KhachHang> khList = new ArrayList<>();

        try {
            Connection conn = SQLServerConnection.getSQLServerConnection();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM dbo.customer "
                    + "WHERE code LIKE '%" + input + "%' or name like '%" + input + "%'");

            while (rs.next()) {

                KhachHang kh = new KhachHang();
                kh.setMaKhachHang(rs.getString("code"));
                kh.setTenKhachHang(rs.getString("name"));
                kh.setSoDienThoai(rs.getString("phone"));
                kh.setDiaChi(rs.getString("address"));
                kh.setEmail(rs.getString("email"));
                kh.setTaiKhoan(rs.getString("username"));

                khList.add(kh);

            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return khList;
    }

    public KhachHang Find(String maKH) {
        KhachHang khOBJ = new KhachHang();

        try {
            Connection conn = SQLServerConnection.getSQLServerConnection();

            PreparedStatement stm = conn.prepareStatement("SELECT * FROM dbo.customer where code = ?");

            stm.setString(1, maKH);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                khOBJ.setId(rs.getLong("id"));
                khOBJ.setMaKhachHang(rs.getString("code"));
                khOBJ.setTenKhachHang(rs.getString("name"));
                khOBJ.setSoDienThoai(rs.getString("phone"));
                khOBJ.setDiaChi(rs.getString("address"));
                khOBJ.setEmail(rs.getString("email"));
                khOBJ.setTaiKhoan(rs.getString("username"));
                return khOBJ;

            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return khOBJ;
    }

    public static java.sql.Date convertDate(Date date) {
        if (date != null) {
            return new java.sql.Date(date.getTime());
        }
        return null;
    }

    public boolean insertData(KhachHang khOBJ) {

//        try {
//            Connection conn = MySQLConnection.getConnection();
//            PreparedStatement stm = conn.prepareStatement("INSERT INTO tbl_khach_hang VALUES (?,?,?,?,?,?,?,?)");
//            stm.setString(1, khOBJ.getMaKhachHang());
//
//            stm.setString(2, khOBJ.getMaNhomKhachHang());
//            stm.setString(3, khOBJ.getTenKhachHang());
//            stm.setString(4, khOBJ.getSoDienThoai());
//            stm.setString(5, khOBJ.getDiaChi());
//            stm.setString(6, khOBJ.getEmail());
//            stm.setDate(7, convertDate(khOBJ.getNgaySinh()));
//            stm.setString(8, khOBJ.getGioiTinh());
//            stm.execute();
//            return true;
//
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
        return false;
    }

    public boolean updateData(KhachHang khOBJ) {

//        try {
//            Connection conn = MySQLConnection.getConnection();
//            PreparedStatement stm = conn.prepareStatement("UPDATE tbl_khach_hang SET MA_NHOM_KHACH_HANG = ?, TEN_KHACH_HANG = ?, SO_DIEN_THOAI = ?, DIA_CHI = ?, EMAIL=?, NGAY_SINH = ?, GIOI_TINH = ? WHERE MA_KHACH_HANG = ?");
//
//            stm.setString(1, khOBJ.getMaNhomKhachHang());
//            stm.setString(2, khOBJ.getTenKhachHang());
//            stm.setString(3, khOBJ.getSoDienThoai());
//            stm.setString(4, khOBJ.getDiaChi());
//            stm.setString(5, khOBJ.getEmail());
//            stm.setDate(6, convertDate(khOBJ.getNgaySinh()));
//            stm.setString(7, khOBJ.getGioiTinh());
//            stm.setString(8, khOBJ.getMaKhachHang());
//
//            stm.execute();
//            return true;
//
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
        return false;
    }

    public boolean DeleteData(KhachHang khOBJ) {

        try {
            Connection conn = MySQLConnection.getConnection();
            PreparedStatement stm = conn.prepareStatement("DELETE FROM tbl_khach_hang WHERE MA_KHACH_HANG = ?");
            stm.setString(1, khOBJ.getMaKhachHang());

            stm.execute();
            return true;

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean checkExist(String maKH) {
        try {
            Connection conn = MySQLConnection.getConnection();

            PreparedStatement stm = conn.prepareStatement("SELECT * FROM tbl_khach_hang WHERE MA_KHACH_HANG = ?");
            stm.setString(1, maKH);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                return true;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
