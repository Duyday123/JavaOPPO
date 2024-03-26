package Person;

import java.util.Scanner;

public class Employee extends Person {
    Scanner sc = new Scanner(System.in);
    public String position;
    public double Luong = 10000;
    public String EmployeeID;

    public Employee(){
        EmployeeID = "";
        position = "";
    }
    public void xuatvitri(){
        System.out.println("====" + position + "====");
    }
    public void DisplayPosition(){
        System.out.println("Vi tri: " + position);
    }
    public void EnterData(){
        super.EnterData();
        System.out.print("ID nhan vien: ");
        EmployeeID = sc.nextLine();
    }
    public void Display(){
        super.Display();
        System.out.println("ID nhan vien: " + EmployeeID);
        System.out.println("Luong: " + Luong + "VND");
    }
}


    
