import java.util.Scanner;
public class PhuongTrinhBacNhat{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a, b, x;
        System.out.println(" Nhap a: ");
        a= sc.nextDouble();
        System.out.println(" Nhap b: ");
        b= sc.nextDouble();
        sc.close();
        if(a == 0){
            if(b == 0){
                System.out.println(" PT co vo so nghiem");
            } else{
                System.out.println(" PT vo nghiem");
            }
        } else{
            x= -b/a;
            System.out.println("x= "+x);
        }
    }
}