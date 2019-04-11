/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import OBJ.LoaiSanPham;
import OBJ.NhaXuatBan;
import OBJ.SanPham;
import OBJ.TacGia;
import UTILS.CONSTANT;
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
public class SanPhamDAO {

    public List<SanPham> getAll() {
        List<SanPham> spList = new ArrayList<>();

//        try {
//
//            Connection conn = MySQLConnection.getConnection();
//
//            Statement stm = conn.createStatement();
//
//            ResultSet rs = stm.executeQuery("SELECT * FROM tbl_san_pham sp\n"
//                    + "INNER JOIN tbl_loai_san_pham lsp ON sp.MA_LOAI_SAN_PHAM = lsp.MA_LOAI_SAN_PHAM\n"
//                    + "INNER JOIN tbl_hang_san_xuat hsx ON sp.HANG_SAN_XUAT =hsx.MA_HANG_SAN_XUAT\n"
//                    + "INNER JOIN tbl_xuat_xu xx ON sp.XUAT_XU = xx.MA_NUOC\n"
//                    + "INNER JOIN tbl_nha_cc ncc ON sp.NHA_CUNG_CAP = ncc.MA_NCC");
//
//            while (rs.next()) {
//                SanPham sp = new SanPham();
//
//                sp.setMaSanPham(rs.getString("MA_SAN_PHAM"));
//                sp.setTenSanPham(rs.getString("TEN_SAN_PHAM"));
//                sp.setMaLoaiSanPham(rs.getString("TEN_LOAI_SAN_PHAM"));
//                sp.setMaHangSanXuat(rs.getString("TEN_HANG_SAN_XUAT"));
//                sp.setXuatXu(rs.getString("TEN_NUOC"));
//                sp.setNhaCC(rs.getString("TEN_NCC"));
//                sp.setDonGia(rs.getInt("DON_GIA"));
//                sp.setSoLuong(rs.getInt("SO_LUONG_CON"));
//
//                spList.add(sp);
//
//            }
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
        return spList;
    }

    public List<SanPham> searchData(String input) {
        List<SanPham> spList = new ArrayList<>();

        try {

            Connection conn = SQLServerConnection.getSQLServerConnection();

            Statement stm = conn.createStatement();

            ResultSet rs = stm.executeQuery("SELECT sp.code, sp.name, sp.price, t.name as loaiSP, a.name as tacGia, p.name as nhaXuatBan, sb.quantity FROM dbo.book sp\n"
                    + "                    INNER JOIN dbo.type t ON sp.type_id = t.id\n"
                    + "                    INNER JOIN dbo.author a ON sp.author_id = a.id\n"
                    + "                    INNER JOIN dbo.publisher p ON sp.publisher_id = p.id\n"
                    + "					INNER JOIN dbo.[site_book] sb ON sb.book_id = sp.id\n"
                    + "					INNER JOIN dbo.[site] s ON s.id = sb.site_id\n"
                    + "                    WHERE sb.quantity > 0 and ( sp.code LIKE '%" + input + "%' or sp.name LIKE '%" + input + "%' ) and s.code = '" + CONSTANT.site + "'");

            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setMaSanPham(rs.getString("code"));
                sp.setTenSanPham(rs.getString("name"));
                sp.setDonGia(rs.getFloat("price"));
                sp.setSoLuong(rs.getLong("quantity"));
                sp.setLoaiSanPham(new LoaiSanPham(rs.getString("loaiSP")));
                sp.setTacGia(new TacGia(rs.getString("tacGia")));
                sp.setNhaXuatBan(new NhaXuatBan(rs.getString("nhaXuatBan")));
                spList.add(sp);

            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return spList;
    }

    public boolean checkExist(String maSP) {
        try {
            Connection conn = MySQLConnection.getConnection();

            PreparedStatement stm = conn.prepareStatement("SELECT * FROM tbl_san_pham WHERE MA_SAN_PHAM = ?");
            stm.setString(1, maSP);

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean insertData(SanPham spOBJ) {
//        try {
//            Connection conn = null;
//            conn = MySQLConnection.getConnection();
//
//            PreparedStatement stm = conn.prepareStatement("INSERT INTO tbl_san_pham VALUES(?,?,?,?,?,?,?,?)");
//            stm.setString(1, spOBJ.getMaSanPham());
//            stm.setString(2, spOBJ.getTenSanPham());
//            stm.setString(3, spOBJ.getMaLoaiSanPham());
//            stm.setString(4, spOBJ.getMaHangSanXuat());
//            stm.setString(5, spOBJ.getXuatXu());
//            stm.setString(6, spOBJ.getNhaCC());
//            stm.setInt(7, spOBJ.getDonGia());
//            stm.setInt(8, spOBJ.getSoLuong());
//
//            stm.execute();
//            return true;
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
        return false;
    }

    public boolean updateData(SanPham spOBJ) {
        try {
            Connection conn = null;
            conn = SQLServerConnection.getSQLServerConnection();

            PreparedStatement stm = conn.prepareStatement("update [dbo].[site_book] set quantity = ? where book_id = (select b.id from dbo.book b where b.code = ?) "
                    + "and site_id = (select s.id from dbo.[site] s where s.code = ?)");

            stm.setLong(1, spOBJ.getSoLuong());
            stm.setString(3, CONSTANT.site);
            stm.setString(2, spOBJ.getMaSanPham());
            stm.execute();
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean deleteData(SanPham spOBJ) {
        try {
            Connection conn = null;
            conn = MySQLConnection.getConnection();

            PreparedStatement stm = conn.prepareStatement("DELETE from tbl_san_pham WHERE MA_SAN_PHAM = ?");
            stm.setString(1, spOBJ.getMaSanPham());
            stm.execute();
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public SanPham Find(String maSP) {
        SanPham spOBJ = new SanPham();
        try {

            Connection conn = SQLServerConnection.getSQLServerConnection();

            PreparedStatement stm = conn.prepareStatement("SELECT sp.id, sp.code, sp.name, sp.price, sb.quantity FROM dbo.book sp\n"
                    + "					INNER JOIN dbo.[site_book] sb ON sb.book_id = sp.id\n"
                    + "					INNER JOIN dbo.[site] s ON s.id = sb.site_id\n"
                    + "                    WHERE sp.code = ? and s.code = ?");
            stm.setString(1, maSP);
            stm.setString(2, CONSTANT.site);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                spOBJ.setId(rs.getLong("id"));
                spOBJ.setMaSanPham(rs.getString("code"));
                spOBJ.setTenSanPham(rs.getString("name"));
                spOBJ.setDonGia(rs.getFloat("price"));
                spOBJ.setSoLuong(rs.getLong("quantity"));
                return spOBJ;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return spOBJ;
    }
}
