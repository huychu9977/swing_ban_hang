/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Demo {

    public static void main(String[] args) {
        try {
            //Lấy kết nối
            Connection conn = MySQLConnection.getConnection();
            //tạo đối tượng statement để chuẩn bị thực hiện tạo câu truy vấn
            Statement statement = conn.createStatement();
            //thực hiện truy vấn
            ResultSet rs = statement.executeQuery("SELECT * FROM tbl_nhom_khach_hang");

            while (rs.next()) {
                System.out.println("Tên nhóm khách hàng: " + rs.getString("TEN_NHOM_KHACH_HANG"));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
