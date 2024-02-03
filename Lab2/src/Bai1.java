import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        double num1, num2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so thu nhat : ");
        num1 = scanner.nextDouble();

        System.out.print("Nhap so thu hai: ");
        num2 = scanner.nextDouble();

      
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        double remainder = num1 % num2;

      
        System.out.println("Tong: " + sum);

        System.out.println("Hieu: " + difference);

        System.out.println("Tich: " + product);

        System.out.println("Thuong: " + quotient);

        System.out.println("Chia Lay Du: " + remainder);

        if (num1 > num2) {
            System.out.println(num1 + " lon hon " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " nho ho2n " + num2);
        } else {
            System.out.println("Hai so bang nhau");
        }


        scanner.close();
    }
}