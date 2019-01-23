import java.util.*;
import java.lang.*;
/**
 * TreeSetDemo1
 */
public class TreeSetDemo1 {

    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("B"));
        t.add(new StringBuffer("C"));
        t.add(new StringBuffer("D"));
        t.add(new StringBuffer("E"));
        t.add(new StringBuffer("L"));
        System.out.println(t);
    }
}