/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import OBJ.ChiTietHoaDon;
import OBJ.SanPham;
import UTILS.MySQLConnection;
import UTILS.SQLServerConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class ChiTietHdDAO {

    public boolean insertData(ChiTietHoaDon cthdOBJ) {
        Connection conn = null;
        try {

            conn = SQLServerConnection.getSQLServerConnection();
            PreparedStatement stm = conn.prepareStatement("INSERT INTO dbo.[order_detail] (order_code, book_id, quantity, price) "
                    + "VALUES (?,?,?,?)");
            stm.setString(1, cthdOBJ.getHoaDon().getMaHD());
            stm.setLong(2, cthdOBJ.getSanPham().getId());
            stm.setLong(3, cthdOBJ.getSoLuong());
            stm.setFloat(4, cthdOBJ.getDonGia());
            stm.execute();
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public ArrayList<ChiTietHoaDon> searchData(String input) {
        ArrayList<ChiTietHoaDon> cthdList = new ArrayList<>();
        try {
            Connection conn = SQLServerConnection.getSQLServerConnection();
            PreparedStatement stm = conn.prepareStatement("select od.*, b.code as bcode, b.name as bname "
                    + "from dbo.[order_detail] od "
                    + "inner join dbo.[book] b on od.book_id = b.id "
                    + "where od.order_code = ?");
            stm.setString(1, input);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                ChiTietHoaDon cthdOBJ = new ChiTietHoaDon();
                SanPham sp = new SanPham();
                sp.setMaSanPham(rs.getString("bcode"));
                sp.setTenSanPham(rs.getString("bname"));
                cthdOBJ.setSanPham(sp);
                cthdOBJ.setDonGia(rs.getFloat("price"));
                cthdOBJ.setSoLuong(rs.getLong("quantity"));

                cthdList.add(cthdOBJ);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ChiTietHdDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cthdList;
    }
}
