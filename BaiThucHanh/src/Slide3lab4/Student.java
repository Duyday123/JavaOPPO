package Slide3lab4;


import java.util.Scanner;

public class Student {
    private String fullname;
    private int age;
    private int point;

    public Student(String fullname, int age) {
        this.fullname = fullname;
        this.age = age;
    }
    public Student(String fullname, int age, int point) {
        this.fullname = fullname;
        this.age = age;
        this.point = point;
    }

    public Student() {}

    public void inputInfo(Scanner scanner) {
        System.out.print("Nhap ten hoc sinh: ");
        this.fullname = scanner.nextLine();
        if(fullname.isEmpty()){
            System.out.println("Loi nhap du lieu");
            System.exit(0);
        }
        System.out.print("Nhap tuoi hoc sinh: ");
        this.age = scanner.nextInt();
        scanner.nextLine();
        
    }
    public void inputPoint(Scanner scanner) {
        System.out.print("Nhap diem cua hoc sinh: ");
        do{
            this.point = scanner.nextInt();
            if(point > 10 || point < 0){
                System.out.println("Diem so nam trong khoang tu 0-10: ");
            }
        }while(point > 10 || point < 0);
        scanner.nextLine();
    }

    public void displayInfo() {
        System.out.println("Ten hoc sinh: " + fullname);
        System.out.println("Tuoi hoc sinh: " + age);
    }
    public void display(){
        System.out.println("Diem so cua hoc sinh: "+ point);
    }
    public String getFullname() {
        return fullname;
    }
    public int getPoint(){
        return point;
    }
    public void modifyInfo( int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

}