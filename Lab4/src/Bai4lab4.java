import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Bai4lab4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> fruitsHashSet = new HashSet<>();
        while (true) {
            System.out.print("Nhap ten loai trai cay (nhap 'done' de ket thuc): ");
            String fruit = sc.nextLine();
            if (fruit.equals("done")) {
                break;
            }
            fruitsHashSet.add(fruit);
        }
        System.out.println("So phan tu trong HashSet: " + fruitsHashSet.size());
        System.out.print("Nhap ten loai trai cay can kiem tra va xoa: ");
        String fruitToCheck = sc.nextLine();
        if (fruitsHashSet.contains(fruitToCheck)) {
            System.out.println("Tim thay loai trai cay '" + fruitToCheck + "' trong HashSet.");
            fruitsHashSet.remove(fruitToCheck);
            System.out.println("Loai trai cay '" + fruitToCheck + "' da duoc xoa.");
        } else {
            System.out.println("Khong tim thay loai trai cay '" + fruitToCheck + "' trong HashSet.");
        }
        System.out.println("Cac phan tu con lai trong HashSet sau khi xoa: " + fruitsHashSet);
        LinkedList<String> fruitsList = new LinkedList<>();
        fruitsList.add("Dau");
        fruitsList.add("Xoai");
        fruitsList.add("Cam");
        fruitsHashSet.addAll(fruitsList);
        System.out.println("Cac phan tu trong HashSet sau khi them tu List:");
        Iterator<String> iterator = fruitsHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            sc.close();
        }
    }
}