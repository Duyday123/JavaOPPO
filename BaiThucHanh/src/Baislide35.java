import java.util.Scanner;
public class Baislide35 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Nhap so thu nhat : ");
    double num1 = sc.nextDouble();
    System.out.print("Nhap so thu hai : ");
    double num2 = sc.nextDouble();
    double SoNhoNhat =  Math.min(num1,num2);
    System.out.println("So nho nhat la " + SoNhoNhat);
    sc.close();
    }
}
