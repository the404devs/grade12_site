package prjRecursion;
import java.util.*;

public class RecursionEx2 {

	public static boolean palin(String word)
	{
		// System.out.println(word.length()-1);
		// System.out.println(word.substring(0, 0));
		// System.out.println(word.substring(word.length()-1, word.length()-1));
		if(word.length()==1||word.length()==0)
		{
			return true;
		}
		else if(word.substring(0, 0).equals(word.substring(word.length()-1, word.length()-1)))
		{
			System.out.println(word.substring(1, word.length()-1));
			return palin(word.substring(1, word.length()-1));
		}
		else
		{
			return false;
		}
	}

	public static boolean palin2(String word) {
		if (word.length()==1||word.length()==0)
		{
			return true;
		}
		else if (word.charAt(0) == word.charAt(word.length()-1))
		{
			return palin2(word.substring(1, word.length()-1));

		}
		else
		{
			return false;
		}
	    
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (1==1)
		{
			System.out.println("Enter word:");
			Scanner scan = new Scanner(System.in);
			String word = scan.nextLine();
			if(palin2(word) == true)
			{
				System.out.println(":)");
			}
			else
			{
				System.out.println(":(");
			}
		}
	}

}
