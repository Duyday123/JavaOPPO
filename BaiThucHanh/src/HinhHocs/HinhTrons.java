package HinhHocs;

import java.util.Scanner;

public class HinhTrons extends HinhHoc {
    public float banKinh;
    Scanner sc = new Scanner(System.in);
    public HinhTrons()
    {
        ten = "Hinh Tron";
    }
    public void nhapBanKinh()
    {
        System.out.print("Nhap ban kinh: ");
        banKinh = sc.nextFloat();
    }
    public void tinhChuVi()
    {
        chuVi = 2 * banKinh * PI;
    }
    public void tinhDienTich()
    {
        dienTich = banKinh * banKinh * PI;
    }
}