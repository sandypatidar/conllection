import java.util.*;
public class Example{
public static void main(String []args) {
	int a[] = {20,5,50,10,25};
	int i;
	for(i=0;i<a.length;i++) 
		System.out.print(a[i]+" ");
	
	 Arrays.sort(a,2,4);
	System.out.println("");  
	
	for(i=0;i<a.length;i++) 
		System.out.print(a[i]+" ");
   }
}