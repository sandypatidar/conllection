import java.util.*;
public class HashSetDemo {
    public static void main(String[] args){
        HashSet h = new HashSet();
        h.add(null); 
        h.add(10);
        h.add("a");
        h.add("b");
        h.add("c");
        h.add("e");
        h.add("d");
        System.out.println(h.add("a"));
        System.out.println(h);
    }
}