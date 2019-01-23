import java.util.*;
public class TreeSetDEmo {

    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add("a");
        t.add("A");
        t.add("b");
        t.add("c");
        t.add("d");
        t.add("z");
        System.out.println(t);
        // System.out.println("A".compareTo("Z"));
        // System.out.println("Z".compareTo("A"));
        // System.out.println("A".compareTo("A"));
        // System.out.println("A".compareTo(null));
    }
}