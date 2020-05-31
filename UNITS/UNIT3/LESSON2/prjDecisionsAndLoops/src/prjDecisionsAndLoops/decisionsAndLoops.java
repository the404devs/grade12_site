/**
 * 
 */
package prjDecisionsAndLoops;
import java.util.*;
//The above imports all the available classes in the java.utils package for us to use. one of these is the 'scanner' class

/**
 * @author 072613128
 *
 */
public class decisionsAndLoops {

	/**
	 * @param args
	 */
	/*
	 * The following is the main function that the java interpreter will call when running your class!
	 * As a review, note that the keyword void indicates that this function does not return a value?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Allow the user to enter a series of marks one after the other until they enter a negative mark.
		 * at that time calculate the average and show the min and max marks. yee
		 */
		String data = ""; 
		float studentMark = 0;
		float totalMark = 0;
		float minMark = 101;
		float maxMark = 0;
		float average = 0;
		int numMarx = 0;
		Scanner scan = new Scanner(System.in);
		//Create a copy of the scanner class. the copy is called an object, which is stored as a reference in the scan variable. 
		System.out.println("Mark Manager");
		System.out.println("In this program, you'll enter a series of marks");
		System.out.println("When you enter a negative mark we'll calculate the average and show you the min and max lol");
		
		do {
			System.out.println("yo sauce me some marks fam");
			data = scan.nextLine();
			//this uses the scanner object's nextline function to read a line entered into the console. a line is delimited by hitting the enter button.
			studentMark = Float.parseFloat(data);			
			//Float is a class not an object. parseFloat looks through a string for a number and returns it as a float
		
			if (studentMark >= 0 && studentMark <=100)
			{
				totalMark += studentMark;			
				numMarx++;
				if (studentMark>maxMark){
					maxMark=studentMark;
				}
				if (studentMark<minMark)
				{
					 minMark=studentMark;
				}
			}
		}while(studentMark >= 0);
		average = totalMark/numMarx;
		System.out.println("--------------------------------------");
		System.out.println("Average: "+average+"%");
		System.out.println("Min: "+minMark+"%");
		System.out.println("Max: "+maxMark+"%");
		scan.close();		
	}

}
