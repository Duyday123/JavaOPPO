package model;

import Util.Configs;
public class NhanVienFullTime extends NhanVien {
    private int NgayLamThem;
    private int LoaiChucVu;

    public NhanVienFullTime(String Ten) {
        this.Ten = Ten;

    }
    public NhanVienFullTime(String Ten, int NgayLamThem) {
        this.Ten =Ten;
        this.NgayLamThem = NgayLamThem;
    }
    public int getLoaiChucVu() {
        return LoaiChucVu;
    }
    public void setLoaiChucVu(int LoaiChucVu) {
        this.LoaiChucVu = LoaiChucVu;

    }
    @Override
    public String loaiNhanVien(){
        if(LoaiChucVu == Util.Configs.NHAN_VIEN_SEP){
            return "Nhan Vien Sep";
        } else if (LoaiChucVu == Util.Configs.NHAN_VIEN_LINH){
            return "Nhan Vien Linh";
        } else{
            return " ";
        }
    }
    public void tinhLuong(){
        long luongCoBan = 0;
        if (LoaiChucVu == Util.Configs.NHAN_VIEN_LINH) {
            luongCoBan = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH; 
        } else if (LoaiChucVu == Util.Configs.NHAN_VIEN_SEP) {
            luongCoBan = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP; 
        }
        long luongThemMoiNgay = Configs.LUONG_LAM_THEM_MOI_NGAY * NgayLamThem;

        Luong = luongCoBan + luongThemMoiNgay;
        System.out.println("Luong cua " + Ten + " la: " + Luong);
    }
}