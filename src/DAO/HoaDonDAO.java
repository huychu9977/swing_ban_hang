/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import OBJ.ChiNhanh;
import OBJ.HoaDon;
import OBJ.KhachHang;
import OBJ.NhanVien;
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
public class HoaDonDAO {

    public boolean insertData(HoaDon hdOBJ) {
        Connection conn = null;
        try {

            conn = SQLServerConnection.getSQLServerConnection();
            PreparedStatement stm = conn.prepareStatement("INSERT INTO dbo.[order] (code, customer_id, status, created_date, created_by, sale_type, site_id) "
                    + "VALUES (?,?,?,?,?,?,?)");
            stm.setString(1, hdOBJ.getMaHD());
            stm.setLong(2, hdOBJ.getKhachHang().getId());
            stm.setInt(3, hdOBJ.getTrangThai());
            stm.setDate(4, hdOBJ.getNgayTao());
            stm.setLong(5, hdOBJ.getNguoiTao().getId());
            stm.setInt(6, hdOBJ.getHinhThuc());
            stm.setLong(7, hdOBJ.getChiNhanh().getId());
            stm.execute();
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public ArrayList<HoaDon> searchData(String input) {
        ArrayList<HoaDon> list = new ArrayList<>();
        try {

            Connection conn = SQLServerConnection.getSQLServerConnection();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT o.code, o.created_date, o.sale_type, o.status, SUM(od.price*od.quantity) as total_price, "
              + "s.name as chinhanh, c.name as cname, u.name as uname FROM dbo.[order] o \n" +
                "left join dbo.[customer] c on o.customer_id = c.id \n" +
                "left join dbo.[user] u on o.created_by = u.id \n" +
                "left join dbo.[site] s on o.site_id = s.id \n" +
                "left join dbo.order_detail od on od.order_code = o.code \n" +
                "where o.code LIKE '%"+input+"%' and o.sale_type = 1\n" +
                "group by o.code, o.created_date, o.sale_type, o.status, s.name , c.name , u.name ");

            while (rs.next()) {
                HoaDon hdOBJ = new HoaDon();
                hdOBJ.setMaHD(rs.getString("code"));
                hdOBJ.setNgayTao(rs.getDate("created_date"));
                KhachHang kh = new KhachHang();
                kh.setTenKhachHang(rs.getString("cname"));
                hdOBJ.setKhachHang(kh);
                NhanVien nv = new NhanVien();
                nv.setTenNhanVien(rs.getString("uname"));
                hdOBJ.setNguoiTao(nv);
                hdOBJ.setHinhThuc(rs.getInt("sale_type"));
                hdOBJ.setTrangThai(rs.getInt("status"));
                hdOBJ.setTongTien(rs.getFloat("total_price"));
                hdOBJ.setChiNhanh(new ChiNhanh(rs.getString("chinhanh")));
                list.add(hdOBJ);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<HoaDon> thongke(String ngay1, String ngay2, String manv) {
        List<HoaDon> hdList = new ArrayList<>();
        try {

            Connection conn = MySQLConnection.getConnection();
            PreparedStatement stm = conn.prepareStatement("SELECT * FROM tbl_hoa_don WHERE NGAY_BAN  >= ? AND NGAY_BAN <= ? AND MA_NHAN_VIEN = ?");
            stm.setString(1, ngay1);
            stm.setString(2, ngay2);
            stm.setString(3, manv);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                HoaDon hdOBJ = new HoaDon();
//                hdOBJ.setMaHD(rs.getString("MA_HOA_DON"));
//                hdOBJ.setMaKH(rs.getString("MA_KHACH_HANG"));
//                hdOBJ.setMaNV(rs.getString("MA_NHAN_VIEN"));
//                hdOBJ.setTongTien(rs.getInt("TONG_TIEN"));
//                hdOBJ.setNgayBan(rs.getString("NGAY_BAN"));
                hdList.add(hdOBJ);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hdList;
    }
}
