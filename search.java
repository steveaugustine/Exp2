import java.util.*;
public class search {
    public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		String word;
		int flag=0,i;
		System.out.println("ENTER A WORD :");
		word=obj.nextLine();
		int n=word.length();
		char s;
		System.out.println("ENTER THE CHARACTER TO BE SEARCHED FOR :");
		s=obj.next().charAt(0);
		
		for(i=0;i<n;i++)
		{
			if(word.charAt(i)==s)
			{
				flag=1;
				break;
			}
		}
		
		if(flag==0)
		{
			System.out.println("NOT FOUND");
		}
		else
		{
			System.out.println(s+" FOUND AT "+(i+1));
		}
		
	}
}
