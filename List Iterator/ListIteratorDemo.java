import java.util.*;
public class ListIteratorDemo {
   public static void main(String[] args) {
       LinkedList l = new LinkedList();
       l.add("balakrishna");
       l.add("radhakrishana");
       l.add("sitaram");
       l.add("jaydurgamaa");
       System.out.println(l);
       ListIterator ltr = l.listIterator();
       System.out.println(ltr.getClass().getName());
       while (ltr.hasNext()) {
           String s = (String)ltr.next();
           if(s.equals("sitaram")) {
               ltr.remove();
           } else if(s.equals("jaydurgamaa")) {
                ltr.add("maa durga ji");
        } else if(s.equals("radhakrishana")){
            ltr.set("radha krishna");
        }
       } 
       System.out.println(l);
   }
}