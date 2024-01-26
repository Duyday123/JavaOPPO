import java.util.Scanner;
public class Baislide47 {
  public static void main(String[] args) {
    int number, tong = 0;
    Scanner sc = new Scanner(System.in);      
    do {
     System.out.println("Nhap vao so nguyen bat ky: ");
       number = sc.nextInt();
       tong += number;
   } while (tong < 100); 
     System.out.println("tong cac so nguyen vua nhap  = " + tong );
    sc.close();
    } 
  }
