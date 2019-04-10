/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OBJ;

import java.util.Objects;

/**
 *
 * @author Admin
 */
public class LoaiSanPham {
    private Long id;
    private String maLoaiSanPham;
    private String tenLoaiSanPham;
    private String moTaSanPham;

    public LoaiSanPham(String tenLoaiSanPham) {
        this.tenLoaiSanPham = tenLoaiSanPham;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaLoaiSanPham() {
        return maLoaiSanPham;
    }

    public void setMaLoaiSanPham(String maLoaiSanPham) {
        this.maLoaiSanPham = maLoaiSanPham;
    }

    public String getTenLoaiSanPham() {
        return tenLoaiSanPham;
    }

    public void setTenLoaiSanPham(String tenLoaiSanPham) {
        this.tenLoaiSanPham = tenLoaiSanPham;
    }

    public LoaiSanPham() {
    }

    public LoaiSanPham(String maLoaiSanPham, String tenLoaiSanPham, String moTaSanPham) {
        this.maLoaiSanPham = maLoaiSanPham;
        this.tenLoaiSanPham = tenLoaiSanPham;
        this.moTaSanPham = moTaSanPham;
    }

    public String getMoTaSanPham() {
        return moTaSanPham;
    }

    public void setMoTaSanPham(String moTaSanPham) {
        this.moTaSanPham = moTaSanPham;
    }

   

    @Override
    public String toString() {
        return tenLoaiSanPham; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object o) {
        if (o==null) {
            return false;
        }
        final LoaiSanPham other = (LoaiSanPham) o;
        if (!Objects.equals(this.tenLoaiSanPham, other.tenLoaiSanPham)) {
            return false;
        }
        return true;
    }
    
}
