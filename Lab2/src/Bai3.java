import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" nhap ten cua ban : ");
        String ten = sc.nextLine();
        System.out.print(" nhap nam sinh cua ban : ");
        int namsinh = sc.nextInt();
        int tuoi = 2024 - namsinh;
        if(tuoi<16){
        System.out.print("ban " + ten + " o do tuoi vi thanh nien");
        }else if (tuoi>=16 && tuoi<18) {
        System.out.print("ban " + ten + " o do tuoi truong thanh");    
        }else System.out.print("ban " + ten + " da gia");
        sc.close();
    }
}