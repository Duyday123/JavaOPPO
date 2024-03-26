package Person;

import java.util.Scanner;

public class Person {
    Scanner sc = new Scanner(System.in);
    public String Fullname;
    public int Age;
    public  String Address;

    public Person() {
        Fullname = "";
        Age =  0;
        Address = "";
    }
    public void EnterData() {
        System.out.print(" Nhap ten = " );
        Fullname = sc.nextLine();
        System.out.print("Nhap tuoi = ");
        Age = sc.nextInt();
        sc.nextLine();
        System.out.print(" Nhap dia chi =  ");
        Address = sc.nextLine();
        
    }
    public void Display() {
        System.out.println(Fullname +"-"+ Age +"-"+ Address);
    }
}