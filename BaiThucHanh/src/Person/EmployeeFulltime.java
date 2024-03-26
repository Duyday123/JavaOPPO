package Person;

public class EmployeeFulltime extends Employee {
    public int DayOfWork;
    public int Year;
    public EmployeeFulltime(){
        position = "Full time";
        DayOfWork = 0;
        Year = 0;
    }
    public void EnterData(){
        super.EnterData();
        System.out.print("So Nam lam Viec: ");
        Year = sc.nextInt();
        System.out.print("So ngay lam viec: ");
        DayOfWork = sc.nextInt();
    }
    public void salary(){
        if (Year < 2)
            Luong = Luong * DayOfWork + 100000;
        else if (Year < 4) {
            Luong = Luong * DayOfWork + 200000;
        }
        else 
            Luong = Luong * DayOfWork + 300000;
    }
    public void Display (){
        super.Display();
        System.out.println("So nam lam viec o cong ty: " + Year);
       
    }
    
}