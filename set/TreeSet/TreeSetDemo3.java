import java.util.*;

/**
 * TreeSetDemo3
 */
public class TreeSetDemo3 {

    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparator());
        t.add("Roja");
        t.add("Shobharani");
        t.add("Gangabhawani");
        t.add("Ramulamma");
        System.out.println(t);
    }
}
class MyComparator implements Comparator {
    public int compare(Object obj1, Object obj2) {
        String s1 = obj1.toString();
        String s2 = (String)obj2;
        // return s2.compareTo(s1);
        return -s1.compareTo(s2);
    }
}