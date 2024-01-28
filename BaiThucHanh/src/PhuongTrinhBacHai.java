import java.util.Scanner;
public class PhuongTrinhBacHai {
    
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double a, b, c, x1, x2, delta;
    System.out.println(" Nhap a: ");
    a= sc.nextDouble();
    System.out.println(" Nhap b: ");
    b= sc.nextDouble();
    System.out.println(" Nhap c: ");
    c= sc.nextDouble();
    sc.close();   
    delta = b*b -4*a*c;
    if(delta<0){
        System.out.println("phuong trinh vo nghiem");
    }else if(delta == 0){
        x1 = x2 = -b/(2*a);
        System.out.println("phuong trinh co nghiem kep x =  " +x1);
    } else {
        x1 = -b + Math.sqrt(delta) / (2*a);
        x2 = -b - Math.sqrt(delta) / (2*a);
    System.out.println("phuong trinh co hai nghiem phan biet ");
    System.out.println("x1 = " +x1);
    System.out.println("x2 = " +x2);
    }
}
}
