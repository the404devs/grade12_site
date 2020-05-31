package prjArrays;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class RawNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = "";
		double sum = 0;
		String numbers = "";
		
		FileReader fr;
		try {
			fr = new FileReader("rawNumbers.csv");
			BufferedReader file = new BufferedReader(fr);
			
			
			
			do {
				line = file.readLine();
				if (line!=null) 
				{					
					numbers += line+",";
				}
			}while(line != null);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] numArrayText = numbers.split(",");
		int[] numArray = new int[numArrayText.length];
		
		for(int x = 0; x<numArrayText.length; x++)
		{
			numArray[x] = Integer.parseInt(numArrayText[x]);
		}
		for(int x = 0; x<numArray.length; x++)
		{
			sum+=numArray[x];
		}
		double average = sum/numArray.length;
		System.out.print(average);
		
			
		
		
		
	}

}
