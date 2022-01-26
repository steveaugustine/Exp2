import java.util.*;
public class stringp {
    public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		String name,rev="";
		System.out.println("ENTER A WORD :");
		name=obj.nextLine();
		
		int n=name.length();
		for(int i=0;i<n;i++)
		{
			rev+=name.charAt(n-1-i);
		}
		if(name.equals(rev))
		{
			System.out.println(name+" IS A PALINDROME");
		}
		else
		{
			System.out.println(name+" NOT A PALINDROME");
		}
		
	}
}
