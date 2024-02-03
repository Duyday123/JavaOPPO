import java.util.Scanner;
public class Bai12 {
public static void main(String[] args) {
    int m,n;
    Scanner sc = new Scanner(System.in);
    System.out.print("nhap so cot : ");
    m = sc.nextInt();
    System.out.print("nhap so hang : ");
    n = sc.nextInt();
    int A[][] = new int[m][n];
    System.out.println("nhap cac phan tu cua ma tran :");
    
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
          System.out.print("Nhap phan tu thu  ["+i+","+j+"]:");
        A[i][j] = sc.nextInt();
        }
    }
    int max = A[0][0];
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if( max < A[i][j]){
                max = A[i][j];
            }
}
    sc.close();
}System.out.println("phan tu lon nhat trong ma tran la : " +max);
}
}