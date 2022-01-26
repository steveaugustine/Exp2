import java.util.Scanner;

public class seclarge {
    public static void main(String args[]){
        int a[]=new int[20];
        int n,i,l1,l2;
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE NO OF ELEMENTS : ");
        n=obj.nextInt();
        System.out.println("ENTER THE ARRAY ELEMENTS : ");
        for(i=0;i<n;++i)
            a[i]=obj.nextInt();
        l1=l2=a[0];

        for(i=0;i<n;++i){
            if(l1<a[i]){
                l2=l1;
                l1=a[i]; 
            }
            else if(a[i]>l2)
                l2=a[i];
        }        
        System.out.println("SECOND LARGEST ELEMENT : "+l2);            

    }
}
