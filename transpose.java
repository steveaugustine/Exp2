import java.util.*;
public class transpose {
    public static void main(String args[]){
        int r,c,i,j;
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE NO OF ROWS AND COLUMNS OF MATRIX : ");
        r=obj.nextInt();
        c=obj.nextInt();
        int a[][]=new int[r][c];
        System.out.println("ENTER THE ELEMENTS OF MATRIX : ");
        for(i=0;i<r;++i){
            for(j=0;j<c;++j){
                a[i][j]=obj.nextInt();
            }
        }
        int b[][]=new int[c][r];
        for(i=0;i<c;++i){
            for(j=0;j<r;++j){
                b[i][j]=a[j][i];
            }
        }
        System.out.println("TRANSPOSE OF THE MATRIX : ");
        for(i=0;i<c;++i){
            for(j=0;j<r;++j){
                System.out.println(b[i][j]); 
            }
        }
    }
}
