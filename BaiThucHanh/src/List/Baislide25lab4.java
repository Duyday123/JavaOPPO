package List;
import java.util.ArrayList;
import java.util.Scanner;
public class Baislide25lab4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrListIntegers = new ArrayList<>(); 
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("nhap so phan tu cua ArrayList : ");
        int n  = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            System.out.println("nhap so phan tu thu " + i + ": ");
            number = sc.nextInt();
            arrListIntegers.add(number);
        }
        int max = arrListIntegers.get(0);

        for(int i = 1; i< arrListIntegers.size(); i++){
        if (arrListIntegers.get(i).compareTo(max) > 0) {
            max = arrListIntegers.get(i);
            
        }
    }
    sc.close();
    System.out.println("phan tu lon nhat trong arrListInteger = " + max);
    }
    
}
