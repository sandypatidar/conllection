
/*customized natural sorting order */
import java.util.*;

public class TreeMapDemo2 {

    public static void main(String[] args) {
        TreeMap m = new TreeMap(new MyComparator());
        m.put("xxx",10);
        m.put("AAA",20);
        m.put("zzz",400);
        m.put("LLL",30);
        System.out.println(m);
    }
}
class MyComparator implements Comparator {
    public int compare(Object obj1 , Object obj2) {
        String s1 = obj1.toString();
        String s2 = obj2.toString();
        return s2.compareTo(s1);
    }
}