import java.util.Scanner;
/**
 * Bai6
 */
public class Bai6 {

    public static void main(String[] args) {
        int number, giaithua=1;
        Scanner sc = new Scanner(System.in);  
        System.out.print("nhap vao mot so nguyen duong :");
        number = sc.nextInt();
            for(int i =1; i<= number ; i++)
            giaithua = giaithua*i;
        System.out.print("giai thua cua so vua nhap la : " +giaithua );
        sc.close();
    }
}
