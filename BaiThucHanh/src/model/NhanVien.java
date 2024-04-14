package model;

public class NhanVien {
    protected String Ten;
    protected long Luong;

    public NhanVien() {

    }
    public NhanVien(String Ten) {
        this.Ten = Ten;

    }
    protected String loaiNhanVien() {
        return "";
    }
    public void xuatthongtin() {
        System.out.println("===== Nhan Vien : " + Ten + "=====");
        System.out.println("- Loai nhan vien : " +loaiNhanVien());
        System.out.println("- Luong : " +Luong);
    }
}
