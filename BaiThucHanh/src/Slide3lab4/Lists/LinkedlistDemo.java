package Slide3lab4.Lists;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import Slide3lab4.Student;
public class LinkedlistDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Student> studentsSet = new LinkedList<>();

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Them thong tin");
            System.out.println("2. Sua thong tin");
            System.out.println("3. Xoa thong tin");
            System.out.println("4. Hien thi thong tin");
            System.out.println("0. Thoat");

            System.out.print("Nhap lua chon cua ban: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addStudent(studentsSet, scanner);
                    break;
                case 2:
                    updateStudent(studentsSet, scanner);
                    break;
                case 3:
                    deleteStudent(studentsSet, scanner);
                    break;
                case 4:
                    displayStudents(studentsSet);
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void addStudent(LinkedList<Student> studentsSet, Scanner scanner) {
        Student student = new Student();
        student.inputInfo(scanner);
        studentsSet.add(student);
        System.out.println("Them hoc sinh thanh cong.");
    }

    private static void updateStudent(LinkedList<Student> studentsSet, Scanner scanner) {
        System.out.print("Nhap ten hoc sinh can sua: ");
        String fullnameToUpdate = scanner.nextLine();
        
        for (Student student : studentsSet) {
            if (student.getFullname().equals(fullnameToUpdate)) {
                System.out.print("Nhap tuoi moi: ");
                int newAge = scanner.nextInt();
                scanner.nextLine();
                student.modifyInfo( newAge);
                System.out.println("Cap nhat thong tin thanh cong.");
                return;
            }
        }
        System.out.println("Khong tim thay hoc sinh co ten '" + fullnameToUpdate + "'.");
    }

    private static void deleteStudent(LinkedList<Student> studentsSet, Scanner scanner) {
        System.out.print("Nhap ten hoc sinh can xoa: ");
        String fullnameToDelete = scanner.nextLine();
    
        Iterator<Student> iterator = studentsSet.iterator();
        boolean removed = false;
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getFullname().equals(fullnameToDelete)) {
                iterator.remove(); 
                removed = true;
                System.out.println("Xoa hoc sinh thanh cong");
                break;
            }
        }
        if (!removed) {
            System.out.println("Khong tim thay hoc sinh co ten: " + fullnameToDelete);
        }
    }

    private static void displayStudents(LinkedList<Student> studentsSet){
    System.out.println("Danh sach hoc sinh: ");
    for (Student students : studentsSet) {
        students.displayInfo();
        }
    }
}