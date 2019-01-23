import java.util.*;
public class  Example2 {
public static void main (String [] args) {
String str = "jay shree ram sita hanuman";

int x=0,y=-1;
String ans = "";
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)==' '|| i==(str.length()-1)){
//System.out.println(str.substring(0,2));
if(i==(str.length()-1)){
y++;
}
 String temp = str.substring(x,y+1);
 //System.out.println(temp);
 ans = ans+" "+revers(temp);
y=y+1;
 x= y+1;
} else {
y++;
}

}

System.out.print(ans);

}



public static String revers(String s)
{
int len = s.length();
String rstr = ""; 
for(int i =len-1;i>=0;i--)
{
	rstr = rstr+Character.toString((s.charAt(i)));

 }
return rstr;
}




  
}
