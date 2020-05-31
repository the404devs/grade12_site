package prjRecursion;
import java.util.ArrayList;
import java.util.Arrays;

public class RecursionEx1 {
	
	public static int largest(ArrayList<Integer> numbers)
	{
		System.out.println(numbers);
		if(numbers.size()==1)
		{
			System.out.println("if");
			return numbers.get(0);
		}
		else if((int)numbers.get(0)>(int)numbers.get(1))
		{
			System.out.println((int)numbers.get(1));
			numbers.set(1, (int)numbers.get(0));
			System.out.println("else if");
		}
		numbers.remove(0);
		for(int x=0; x<numbers.size(); x++)
		{
			System.out.print(numbers.get(x));
		}
		System.out.println("");
		//System.out.println(numbers);
		return largest(numbers);
	}



	public static int smallest(int[] array, int pos) {
	    if(pos == array.length-1)
	    {
	    	return array[array.length-1];
	    }
	    else if(array[pos]<array[pos+1])
	    {
	    	array[pos+1]=array[pos];
	    	return smallest(array, pos+1);
	    }
	    else{
	    	return smallest(array, pos+1);
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2,8,55,9,4,8));
		int[] nums2 = {2,8,55,9,4,8,-69};
		int number = smallest(nums2, 0);
		System.out.println(number);
		
	}

}
