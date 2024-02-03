import java.util.Scanner;
/**
 * Bai8
 */
public class Bai8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, number ;
        double sum = 0;
        System.out.print("nhap vao cac so nguyen ");
        
            n = sc.nextInt();
            for(int i =1; i <=n; i++){
                System.out.print("nhap so thu "  + i + ": ");
                number = sc.nextInt();
                sum += number;
            }
                double TBC = sum / n ;
            
            System.out.printf("Trung binh cong cua mang la %.3f", TBC );
            
        sc.close();
    }
}