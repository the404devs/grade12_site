public class insertSort1 {

	public static void sort() {
		//int[] array = { 6, 4, 78, 22, 73, 42, 71, 2, 8, 34, 9, 7 };
		int[] array = {5,2,7,3,6};
	    int iterations = 0;
	    for (int x = 0; x < array.length - 1; x++)
	    {
	      	for (int y = 1 + x; y >= 1; y--)
	      	{
	        	//System.out.println("key is: " + array[y]);
	        	if (array[y] < array[(y - 1)])
	        	{
	          		int pHolder = array[(y - 1)];
	          		array[(y - 1)] = array[y];
	          		array[y] = pHolder;
	          		iterations++;
	        	}	
	        	else
	        	{
	          		iterations++;	          
	          		break;
	        	}
	      	}
	    }

	    for (int z = 0; z<array.length; z++) {
	    	System.out.println(array[z]);
	    }
	    System.out.println("");
	    System.out.println(iterations+" iterations");

	}

    public static void main(String[] args) {
    	sort();
    }
}