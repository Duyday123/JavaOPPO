import java.util.LinkedList;
import java.util.Scanner;

public class Bai2lab4 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedListInt = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua day: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Nhap so nguyen duong thu " + i + ": ");
            int number = sc.nextInt();
            linkedListInt.add(number);
        }
        int Sum = 0;
        int Dem = 0;
        for(int i : linkedListInt){
            if (i % 2 == 0) {
                Sum = Sum + i;
                Dem ++;
            }
        }
        float Average = Sum/Dem;
        System.out.println("Trung binh Cong cua cac so chan trong List " + linkedListInt + " la: " + Average);
        sc.close();
    }
}
