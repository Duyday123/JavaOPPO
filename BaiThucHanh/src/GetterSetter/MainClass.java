package GetterSetter;

public class MainClass {

    public static void main(String[] args) {
        
        Hinhtron ht = new Hinhtron();
        ht.setbankinh(10);

        float chuVi =  ht.tinhChuVi();
        float dientich = ht.tinhDienTich();
        System.out.println("Chu vi hinh tron: " + chuVi + "; va Dien tich: " + dientich);
    }
}