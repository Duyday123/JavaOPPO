import java.util.Scanner;

public class Baislide20lab3 {
    public static void main(String[] args) {
        HinhTron ht = new HinhTron();
        ht.NhapBanKinh();
        ht.TinhChuVi();
        ht.TinhDienTich();
        ht.Inchuvi();
        ht.Indientich();
    } 
}
class HinhTron {
    float PI = 3.14f;
    float r;
    float cv;
    float dt;

    void NhapBanKinh() {
        System.err.print("Nhap ban kinh cua hinh tron : ");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextFloat();
       
    }

    void TinhChuVi() {
        cv = 2 * PI * r;
    }

    void TinhDienTich() {
        dt = PI * r * r;
    }

    void Inchuvi() {
        System.err.println("Chu vi hinh tron : " + cv);
    }

    void Indientich() {
        System.err.println("Dien tich hinh tron : " + dt);
    }
}


