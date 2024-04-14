package model;


import Util.Configs;

public class MainClass {

    public static void main(String[] args) {
        NhanVienFullTime sep = new NhanVienFullTime("Nguyen Van A");
        sep.setLoaiChucVu(Configs.NHAN_VIEN_SEP);
        NhanVienFullTime linh1 = new NhanVienFullTime("Tran Thi B",1);
        linh1.setLoaiChucVu(Configs.NHAN_VIEN_LINH);
        NhanVienFullTime linh2 = new NhanVienFullTime("Phan Trong C",4);
        linh2.setLoaiChucVu(Configs.NHAN_VIEN_LINH);
        NhanvienPartTime ThoiVu = new NhanvienPartTime("Nguyen Thi D", 120);

        sep.tinhLuong();
        linh1.tinhLuong();
        linh2.tinhLuong();
        ThoiVu.tinhLuong();
        
        sep.xuatthongtin();
        linh1.xuatthongtin();
        linh2.xuatthongtin();
        ThoiVu.xuatthongtin();

    }
}