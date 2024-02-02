import java.util.Scanner;
/**
 * Bai10
 */
public class Bai10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoikytu ;
        char kytu ;
        int Dem = 0;
        do {
            System.out.print("Nhap chuoi ki tu : ");
            chuoikytu = sc.nextLine();
        } while( chuoikytu.length() > 80 );

        System.out.print("Nhap ki tu ma ban can do tim : ");
        kytu = sc.next().charAt(0);
        for(int i = 0 ; i < chuoikytu.length() ; i++) {
            if(chuoikytu.charAt(i) == kytu ) {
                ++Dem;
            }
        }
        System.out.println("So lan xuat hien chu cai "+kytu+" la : "+Dem);
    sc.close();
    }
}
