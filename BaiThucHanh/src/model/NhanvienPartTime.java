package model;

import Util.Configs;
public class NhanvienPartTime extends NhanVien {
    private int GioLamViec;

    public NhanvienPartTime(String Ten, int GioLamViec) {
        this.Ten =Ten;
        this.GioLamViec = GioLamViec;
    }
    public String loaiNhanVien() {
        return "Nhan Vien Thoi Vu";

    }
    public void tinhLuong() {
       Luong = Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * GioLamViec;
    }
}
