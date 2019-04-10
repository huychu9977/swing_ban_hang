/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OBJ;

import java.sql.Date;
import java.util.List;
import net.sourceforge.jtds.jdbc.DateTime;

/**
 *
 * @author Admin
 */
public class HoaDon {

    private Long id;
    private String maHD;
    private KhachHang khachHang;
    private Integer trangThai; //1.vừa tạo 2.đang xử lý 3.đã thanh toán
    private NhanVien nguoiTao;
    private Date ngayTao;
    private ChiNhanh chiNhanh;
    private Integer hinhThuc; // 1.bán offline 2.bán online
    private Float tongTien;
    private List<ChiTietHoaDon> listChiTietHD;

    public HoaDon() {
    }

    public Float getTongTien() {
        return tongTien;
    }

    public void setTongTien(Float tongTien) {
        this.tongTien = tongTien;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ChiTietHoaDon> getListChiTietHD() {
        return listChiTietHD;
    }

    public void setListChiTietHD(List<ChiTietHoaDon> listChiTietHD) {
        this.listChiTietHD = listChiTietHD;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    public NhanVien getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(NhanVien nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public ChiNhanh getChiNhanh() {
        return chiNhanh;
    }

    public void setChiNhanh(ChiNhanh chiNhanh) {
        this.chiNhanh = chiNhanh;
    }

    public Integer getHinhThuc() {
        return hinhThuc;
    }

    public void setHinhThuc(Integer hinhThuc) {
        this.hinhThuc = hinhThuc;
    }

}
