public class Array {
    public static void main(String []args){
        int t1[] ={1,2,3,4};
        int t2[] ={1,2,3};
        int d1[] = {6,3,2};
        int d2[] = {8,3};
        int x=0,y=0;
        
        for(int i=0;i<t2.length;i++){
            for(int j=0;j<t1.length;j++){
                if(t2[i]==t1[j]){
                    x++;
                   break;
                }
            }
        }  
        System.out.println("x="+x);
        for(int i=0;i<d2.length;i++){
            for(int j=0;j<d1.length;j++){
                if(d2[i]==d1[j]){
                    y++;
                   break;
                }
            }
        }
         System.out.println("y="+y);
       
        
        if(x==t2.length && y==d2.length ){
            System.out.println(true);
        } else{
        System.out.println(false); }
    }
}

//codeshaff
