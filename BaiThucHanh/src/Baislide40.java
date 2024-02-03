import java.util.Scanner;
public class Baislide40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("moi ban nhap ngay :");
        
        int ngay = sc.nextInt();

        switch( ngay ){
            case 0:
            System.out.print("Chu Nhat");
            break;
            case 1:
            System.out.print("Thu hai");
            break;
            case 2:
            System.out.print("Thu ba");
            break;
            case 3:
            System.out.print("Thu Tu");
            break;
            case 4:
            System.out.print("Thu Nam");
            break;
            case 5:
            System.out.print("Thu Sau");
            break;
            case 6:
            System.out.print("Thu Bay");
            break;
            default:
        System.out.println("So ngay trong tuan sai");
        sc.close();
    }
        
    }
}

