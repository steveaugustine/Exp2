import java.util.*;
public class rep {
    public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		String word;
		System.out.println("ENTER A WORD :");
		word=obj.nextLine();
		char s,r;
		System.out.println("ENTER THE CHARACTER TO BE REPLACED :");
		s=obj.next().charAt(0);
	    System.out.println("ENTER THE CHARACTER TO WHICH IT HAS TO BE REPLACED WITH :");
		r=obj.next().charAt(0);
	    word=word.replace(s,r);
		System.out.println("NEW STRING :"+word);
		
	}
}
