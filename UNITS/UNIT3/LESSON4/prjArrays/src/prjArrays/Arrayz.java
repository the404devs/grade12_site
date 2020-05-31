package prjArrays;

public class Arrayz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data = new String[5];//its got 5 spots
		//arrays are objects, so they got functions and properties you can have fun with
		//most important property is the length of the array. its the number of elements in the array
		//Remember the first element of an array is [0], the last one would be [Array.Length-1]
		data [0] = "Mario";
		data [1] = "Luigi";
		data [2] = "Pepe";
		data [3] = "Rick Astley";
		data [4] = "error 404 name not found";
		
		int[] numbers = {4,6,8,4,3,0,5};
		//different way to make an array
		
		double sum = 0;
		for (int x = 0;x<numbers.length;x++)
		{
			sum+=numbers[x];
			
		}
		double average = 0;
		average = sum/numbers.length;
		System.out.print("the average is: "+average);
		
		
	}

}
