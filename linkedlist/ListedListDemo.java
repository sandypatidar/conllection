import java.util.*;
class ListedListDemo
{
public static void main(String []args);
    {
        LinkedList l = new LinkedList();
        l.add("sandeep");
        l.add(30);
        l.add(null);
        l.add("patidar");
        l.set(0,"Sandy");
        l.add(0,"patidar");
        l.removeLast();
        l.addFirst("hello");
        System.out.println(l);
    }
}