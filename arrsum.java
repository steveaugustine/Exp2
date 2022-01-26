import java.util.Scanner;

public class arrsum {
    public static void main(String args[]){
        int n,i,sum=0;
        int a[]=new int[20];
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE NO OF ELEMENTS : ");
        n=obj.nextInt();
        System.out.println("ENTER THE ELEMENTS : ");
        for(i=0;i<n;++i)
            a[i]=obj.nextInt();
        System.out.println("SUM OF THE ELEMENTS OF THE ARRAY : ");    
        for(i=0;i<n;++i)
            sum=sum+a[i];
        System.out.println(sum);        
    }
}
