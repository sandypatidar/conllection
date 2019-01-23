import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int b[] = {1,2,3,4};
        int x,y;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    x++;
                }
            }
        }

        if(x==b.length){
            System.out.println(true);
        } else{
            System.out.println(false);
        }

    }
}