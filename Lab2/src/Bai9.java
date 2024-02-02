import java.util.Scanner;
/**
 * Bai9
 */
public class Bai9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap chuoi ky tu : ");
        String chuoi = sc.nextLine();
        int So = 0, kytuthuong = 0, kytuhoa = 0;
        for(int i=0;i < chuoi.length();i++) {
            if(chuoi.charAt(i) >= 97 && chuoi.charAt(i) <= 122 ) {
                ++kytuthuong;
            } else if (chuoi.charAt(i) >= 65 && chuoi.charAt(i) <= 90) {
                ++kytuhoa;
            } else if (chuoi.charAt(i) >= 48 && chuoi.charAt(i) <= 57) {
                ++So;
            } else if (chuoi.charAt(i)>122) {
                
             System.out.println("Chuoi co ki tu khong xac dinh");}
            
        }
        System.out.println("So ki tu viet thuong trong chuoi la : "+kytuthuong);
        System.out.println("So ki tu viet hoa trong chuoi la : "+kytuhoa);
        System.out.println("So ki tu chu so trong chuoi la : "+So);
        sc.close();
    } 
}