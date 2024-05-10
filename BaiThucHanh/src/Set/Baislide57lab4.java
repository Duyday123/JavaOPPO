package Set;

import java.util.HashSet;
import java.util.Scanner;

public class Baislide57lab4 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSetStrings = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        hashSetStrings.add("Wilson");
        hashSetStrings.add("Nike");
        hashSetStrings.add("Volvo");
        hashSetStrings.add("Kia");
        hashSetStrings.add("Lenovo");
        hashSetStrings.add("Lenovo");
        System.out.println("cac phan tu co trong hashSetString la : ");
        System.out.println(hashSetStrings);
        System.out.println("nhap phan tu can xoa : ");
        name = sc.nextLine();
        if (hashSetStrings.contains(name)) {
            hashSetStrings.remove(name);
            System.out.println("xoa thanh cong");
            System.out.println("cac phan tu con lai trong hashSetString : ");
            System.out.println(hashSetStrings);
        } else {
            System.out.println("Xoa khong thanh cong");
            sc.close();
        }
    }
}
