import java.util.*;

public class smallarray {
    public static void main(String args[]){
        int n,small,i;
        int a[]=new int[20];
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE NO OF ELEMENTS : ");    
        n=obj.nextInt();
        System.out.println("ENTER ELEMENTS OF THE ARRAY : ");    
        for(i=0;i<n;++i)
            a[i]=obj.nextInt();
        small=a[0];
        for(i=0;i<n;++i){
            if(a[i]<small){
                small=a[i];
            }
        }
        System.out.println("SMALLEST NUMBER : "+small);
    }   
}
