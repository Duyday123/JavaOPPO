package Bai3lab4;
import java.util.LinkedList;
import java.util.Scanner;
public class MainStudent {   
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            LinkedList<Student> studentList = new LinkedList<>();
            System.out.println("Nhap thong tin sinh viên (nhap ten rong đe ket thuc):");
            while (true) {
                System.out.print("Ten sinh vien: ");
                String name = sc.nextLine();
                if (name.isEmpty()) {
                    break;
                }
                System.out.print("Diem sinh vien: ");
                double score = sc.nextDouble();
                sc.nextLine();
                studentList.add(new Student(name, score));
            }
            System.out.println("Sinh vien phai thi lai:");
            int retakeCount = 0;
            for (Student student : studentList) {
                if (student.score <= 5) {
                    System.out.println("Ten: " + student.name + ", Diem: " + student.score);
                    retakeCount++;
                }
            }
            if (retakeCount == 0) {
                System.out.println("Khong co sinh vien nao phai thi lai.");
            }
            System.out.println("Sinh vien co diem cao nhat:");
            double maxScore = Double.MIN_VALUE;
            for (Student student : studentList) {
                if (student.score > maxScore) {
                    maxScore = student.score;
                }
            }
            for (Student student : studentList) {
                if (student.score == maxScore) {
                    System.out.println("Ten: " + student.name + ", Diem: " + student.score);
                }
            }
            System.out.print("Nhap ten sinh vien can tim kiem: ");
            String searchName = sc.nextLine();
            boolean found = false;
            System.out.println("Thong tin sinh vien:");
            for (Student student : studentList) {
                if (student.name.equalsIgnoreCase(searchName)) {
                    System.out.println("Ten: " + student.name + ", Diem: " + student.score);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Khong tim thay sinh vien co ten '" + searchName + "'.");
            sc.close();
            }
        }
    }