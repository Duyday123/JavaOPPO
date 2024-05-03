package List;
import java.util.ArrayList;
public class Baislide17lab4 {
    public static void main(String[] args) {
        ArrayList<String> arrayListStrings = new ArrayList<>();
    
    arrayListStrings.add("-JAVA");
    arrayListStrings.add("-PHP");
    arrayListStrings.add("-C#");
    arrayListStrings.add("-C++");
        
    
    System.out.println(" cac phan tu co trong arrayList la : ");
    for ( int i = 0; i < arrayListStrings.size(); i++) {
        System.out.println(arrayListStrings.get(i) + "\t");
    }
    }
}
