import java.util.Scanner;
public class Student {

    public static void main(String[] args) {
        Sinhvien sv = new Sinhvien();
        sv.Nhapthhongtin();
        sv.Xuatthongtin();
        sv.Diemtongket();

    }
}
class Sinhvien {
    String Ten;
    int Tuoi;
    Float DiemC, DiemB, DiemA ;
    Float Diemtk;
    void Nhapthhongtin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten sinh vien :" );
        Ten = sc.nextLine();
        System.out.print("Nhap tuoi sinh vien : " );
        Tuoi = sc.nextInt();
        System.out.print("Nhap diem C :  ");
        DiemC = sc.nextFloat();
        System.out.print("Nhap diem B : ");
        DiemB = sc.nextFloat();
        System.out.print("Nhap diem A : ");
        DiemA = sc.nextFloat();
        sc.close();
    }
    void Xuatthongtin() {
        System.out.println(" Ten sinh vien " +Ten);
        System.out.println("Tuoi sinh vien " +  Tuoi);
        System.out.println("Diem A cua sinh vien " +DiemA);
        System.out.println("Diem B cua sinh vien " +DiemB);
        System.out.println("Diem C cua sinh vien " +DiemC);

    }
    void Diemtongket() {
      Diemtk = ( DiemA + DiemB + DiemC)/3;
      System.out.println(" Diem tong ket la : " +Diemtk);

    }
}
