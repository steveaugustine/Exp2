import java.util.*;
public class trace {
	public static void main(String args[])
	{
        int n,sum=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("ENTER THE SIZE :");
		n=obj.nextInt();
		int a[][]=new int[n][n];
		System.out.println("ENTER THE ELEMENTS :");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=obj.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i+j)%n==0)
				{
					sum+=a[i][j];
				}
			}
        }   
		System.out.println("TRACE :"+sum);
	}
}
