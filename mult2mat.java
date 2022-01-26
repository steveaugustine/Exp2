import java.util.*;
public class mult2mat {
    public static void main(String args[]){
        int r1,c1,r2,c2,i,j;
        int a[][]=new int[10][10];
        int b[][]=new int[10][10];
        int prd[][]=new int[20][20];
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE NO OF ROWS AND COLUMNS OF MATRIX1 : ");
        r1=obj.nextInt();
        c1=obj.nextInt();
        System.out.println("ENTER THE NO OF ROWS AND COLUMNS OF MATRIX2 : ");
        r2=obj.nextInt();
        c2=obj.nextInt();
        if(c1==r2){
            System.out.println("ENTER THE ELEMENTS OF MATRIX1 : ");
            for(i=0;i<r1;++i){
                for(j=0;j<c1;++j){
                    a[i][j]=obj.nextInt();
                }
            }
            System.out.println("ENTER THE ELEMENTS OF MATRIX2 : ");
            for(i=0;i<r2;++i){
                for(j=0;j<c2;++j){
                    b[i][j]=obj.nextInt();
                }
            }
            for(i=0;i<r1;++i){
                for(j=0;j<c2;++j){
                    prd[i][j]+=a[i][j]*b[i][j];
                }
            }
            System.out.println("PRODUCT MATRICES : ");
            for(i=0;i<r1;++i){
                for(j=0;j<c2;++j){
                    System.out.println(prd[i][j]);
                }
            }
        } 
        else  
        System.out.println("!!! CANNOT PERFORM MULTIPLICATION !!!"); 
    }

}
