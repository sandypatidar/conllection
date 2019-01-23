import java.util.*;
/**
 * HashMapDemo2
 */
public class IdentityHashMapDemo2 {

    public static void main(String[] args) {
        HashMap m = new HashMap();
        Integer I1 = new Integer(10);
        Integer I2 = new Integer(10);
        m.put(I1, "pawan");
        m.put(I2, "kalyan");
        System.out.println(m);
    }
}