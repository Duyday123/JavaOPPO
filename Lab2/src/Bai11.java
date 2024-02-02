import java.util.Scanner;
/**
 * Bai11
 */
public class Bai11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("nhap so phan tu cua mang : ");
        int n = sc.nextInt();
        int [] array = new int [n];
        
        for(int i = 0 ; i < array.length; i++){
        System.out.print("nhap phan tu thu " +(i+1) + ": " );
        array [i] = sc.nextInt();
        } 
    System.out.print("Mang truoc khi sap xep la ");
    for(int i = 0; i<array.length; i++){
        System.out.print(array[i] + " ");
    }   
    for(int i = 0;i<array.length;i++) {
        for(int j = i + 1 ; j < array.length;j++) {
            if(array[i] > array[j]) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
    }
}
System.out.println();
System.out.print("Mang sau khi sap xep tang dan la : ");
for(int i = 0;i < array.length;i++) {
    System.out.print(array[i] + " ");
} sc.close();
    }
}