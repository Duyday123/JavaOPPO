package List;
import java.util.ArrayList;
public class Baislide18lab4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListIntegers = new ArrayList<>();

        arrayListIntegers.add(0);
        arrayListIntegers.add(7);
        arrayListIntegers.add(1);
        arrayListIntegers.add(9);

        System.out.println("cac phan tu co trong arrayListInteger la : ");
        for(int number : arrayListIntegers){
            System.out.println(number +  "\t");
        }
    }
}
