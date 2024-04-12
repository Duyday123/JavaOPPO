package GetterSetter;

public class mainsinhvien {
    public static void main(String[] args) {
        Sinhvien sv1 = new Sinhvien();
        Sinhvien sv2 = new Sinhvien();

        sv1.setTen("");
        sv1.setTuoi(23);

        sv2.setTen("Peter");
        sv2.setTuoi(17);

        System.out.println(" Sinh Vien 1 co ten : " + sv1.getTen() + ", Tuoi : " + sv1.getTuoi());
        System.out.println(" Sinh Vien 2 co ten : " + sv2.getTen() + ", Tuoi : " + sv2.getTuoi());
    }
}
