package prjRecursion;
import java.util.*;


public class RecursionEx3 {
	public static int digitSum(int number) {
	    if (number==0)
	    {
	    	return number;
	    }
	    return (number % 10) + digitSum(number/10);
	}
	public static int gcd(int a, int b) {
	    if (b==0){return a;}
	    else {return gcd(b, a % b);}
	}



	public static int findmin(int a[], int n) {
	    if(a[0]<a[1])
	    {
	    	a[1]=a[0];
	    }
	    return 56756;
	}

	public static String stars(String word) {
	    if (word.lastIndexOf("*")==word.length()-2)
	    {
	    	return word;	    	
	    }
	    else if (word.lastIndexOf("*")==-1)
	    {
	    	word = word.substring(0, 1) + "*" + word.substring(1, word.length());
	    	return stars(word);
	    }
	    else
	    {	
			word = word.substring(0, word.lastIndexOf("*")+2) + "*" + word.substring(word.lastIndexOf("*")+2, word.length() );
			
	    	return stars(word);
	    }
	    
	}

	public static int Eleven(int[]array) {
		String values = Arrays.toString(array);
		values = values.substring(1,values.length()-1);
		values = values.replace(",", "");
	 	System.out.println(values);

	 	if(values.indexOf("11")==-1)
	 	{
	 		return 0;
	 	}
	 	else
	 	{
	 		values = values.substring(values.indexOf("11")+2, values.length());
	 		System.out.println(values);

	 		return 1 + Eleven(array);
	 	}

	}

    public static void main(String[] args) {
    	int[] array = {11,6,3,2,11,56,4887,11,321};
    	System.out.println(Eleven(array));
    	int size = array.length;
    	System.out.println(stars("memeszlsuhfbohjasbdgpkesrbdngsbertg;ksnrg;kxdnrfg;k"));
    	findmin(array, size);
    	while (1==1) {
    		System.out.println(gcd(20, 12)+"");
    		System.out.println("Enter number:");
    		Scanner scan = new Scanner(System.in);
    		int number = Integer.parseInt(scan.nextLine());

    		System.out.println(digitSum(number)+"");
    	}
    }
}
