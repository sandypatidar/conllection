/*----------- defalt throe our catch -----------*/
public class DefailtThrow {
    public static void main(String []args) 
    {
        try{
        String s1 = "sandeep";
        System.out.println("in try code "+s1);
        System.out.println(3/0);
        } 
        catch(ArithmeticException e) {
            System.out.println("Exception: "+e.getMessage());
        }
        finally {
        System.out.println("ni chalungi");
        }
        System.out.println("last line");
    }
}