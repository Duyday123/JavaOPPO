import java.util.Scanner;
public class Baislide74 {

    public static void main(String[] args) {
        int n;
        int Tong = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so phan tu cua mang : ");
        n = sc.nextInt();
        int A[] = new int [n];
        System.out.println(" nhap cac phan tu cho mang : ");
        for(int i = 0 ; i < n; i++){
        System.out.print("nhap phan tu thu " +i + ": " );
        A[i] = sc.nextInt();
        } 
    
        for (int i = 0; i<n; i++){
            if(A[i] %2 == 0)
             Tong += A[i];
        }
        System.out.println(" tong cua mang la : " +Tong);
        sc.close();  
    }
}