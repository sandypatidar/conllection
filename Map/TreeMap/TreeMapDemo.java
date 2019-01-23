/*default natural sorting order */
import java.util.*;

public class TreeMapDemo {

    public static void main(String[] args) {
        TreeMap m = new TreeMap();
        m.put(100, "xyz");
        m.put(104, "xyz");
        m.put(103, "abc");
        m.put(101, 106);
        System.out.println(m);
    }
}