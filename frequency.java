import java.util.*;
public class frequency {
    public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		String word;
		int count=0,i;
		System.out.println("ENTER A WORD :");
		word=obj.nextLine();
		int n=word.length();
		char s;
		System.out.println("ENTER THE ITEM T BE COUNTED :");
		s=obj.next().charAt(0);
		for(i=0;i<n;i++)
		{
			if(word.charAt(i)==s)
			{
				count++;
			}
		}
		
		System.out.println("FREQUENCY OF "+s+" IN "+word+" :"+count);
		
	}
}
