import java.util.Scanner;
public class Baislide90 {

    public static void main(String[] args) {
     String chuoi;
     char kytu;
     Scanner sc = new Scanner(System.in);
     System.out.println("nhap vao 1 chuoi :");
     chuoi = sc.nextLine();
     System.out.println( "nhap cac ky tu : " );
     for (int i = 0; i < chuoi.length() ; i++ ){
        kytu = chuoi.charAt(i);
        System.out.println(kytu);

     }sc.close();
    }
}