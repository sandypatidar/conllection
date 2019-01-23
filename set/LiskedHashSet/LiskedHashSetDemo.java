import java.util.*;
public class LiskedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("a");
        lhs.add("b");
        lhs.add("c");
        lhs.add("d");
        lhs.add("z");
        lhs.add(null);
        lhs.add(10);
        System.out.println(lhs);
    }
    
}