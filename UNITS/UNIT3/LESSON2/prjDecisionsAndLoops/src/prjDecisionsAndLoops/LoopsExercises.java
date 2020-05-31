package prjDecisionsAndLoops;
import java.util.*;

public class LoopsExercises {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter Start:");
    	int start = Integer.parseInt(scan.nextLine());
    	System.out.println("Enter End:");
    	int end = Integer.parseInt(scan.nextLine());
    	System.out.println("");
    	for (int x = start; x<=end; x++) {
    		System.out.println(x);
    	}


    	System.out.println("");
    	System.out.println("Enter a word:");
    	System.out.println("");
    	String word = scan.nextLine();
    	for (int x = 0; x<word.length(); x++)
    	{
    		System.out.println(word);
    	}

    	System.out.println("");
    	System.out.println("Enter word 1:");
    	String word1 = scan.nextLine();
    	System.out.println("Enter word 2:");
    	String word2 = scan.nextLine();
    	int dots = 30-word1.length()-word2.length();
    	System.out.println("");
    	System.out.println("");
    	System.out.print(word1);
    	for (int x = 0; x<dots; x++) {
			System.out.print(".");    		
    	}
    	System.out.print(word2);
    }
}
