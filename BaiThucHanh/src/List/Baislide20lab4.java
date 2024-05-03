package List;
import java.util.ArrayList;
import java.util.ListIterator;

class Baislide20lab4 {
    public static void main(String[] args) {
        ArrayList<Character> arrayListChar = new ArrayList<>();

        arrayListChar.add('a');
        arrayListChar.add('e');
        arrayListChar.add('b');
        arrayListChar.add('c');

        ListIterator<Character> listIterator = arrayListChar.listIterator();
        System.out.println("cac phan tu cua arrListChar : ");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next() + "\t");
            
        }
    }
}