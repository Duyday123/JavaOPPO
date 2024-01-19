import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        // Khai báo biến
        double num1, num2;

        // Sử dụng Scanner để nhập số từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập số thứ nhất
        System.out.print("Nhap so thu nhat : ");
        num1 = scanner.nextDouble();

        // Nhập số thứ hai
        System.out.print("Nhap so thu hai: ");
        num2 = scanner.nextDouble();

        // Tính tổng, hiệu, tích, thương, chia lấy dư
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        double remainder = num1 % num2;

        // In kết quả
        System.out.println("Tong: " + sum);
        System.out.println("Hieu: " + difference);
        System.out.println("Tich: " + product);
        System.out.println("Thuong: " + quotient);
        System.out.println("Chia lay du: " + remainder);

        // So sánh hai số
        if (num1 > num2) {
            System.out.println(num1 + " lon hon " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " nho ho2n " + num2);
        } else {
            System.out.println("Hai so bang nhau");
        }

        // Đóng Scanner
        scanner.close();
    }
}