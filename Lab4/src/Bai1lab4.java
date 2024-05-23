import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai1lab4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri phan tu thu: " + (i + 1) + ": ");
            int value = sc.nextInt();
            arrayList.add(value);
        }

        System.out.println("Gia tri lon nhat cua mang la: " + maxValues(arrayList));
        removeValues(arrayList, sc);
        System.out.println("Danh sach phan tu sau khi xoa: ");
        showList(arrayList);
        
        // Sắp xếp và hiển thị danh sách phần tử
        System.out.println("Cac phan tu sau khi sap xep: ");
        showList(sortList(arrayList));
    }

    public static int maxValues(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Danh sach rong.");
        }
        int max = Collections.max(list);
        return max;
    }
    public static void removeValues(ArrayList<Integer> list, Scanner sc) {
        System.out.print("Nhap gia tri de xoa: ");
        int valueToRemove = sc.nextInt();
        list.removeIf(number -> number == valueToRemove);
    }
    public static void showList(ArrayList<Integer> list) {
        for (int number : list) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    public static ArrayList<Integer> sortList(ArrayList<Integer> list) {
        ArrayList<Integer> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        return sortedList;
    }
}

