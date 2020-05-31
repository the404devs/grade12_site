


public class bubbleSort1 {

	public static void sort() {
	    int[] array = {10,5,8,45,21};	
	    int iterations = 0;
	    for (int x = 0; x<array.length; x++) {
	    	Boolean swap = false;
	    	for (int y = 0; y<array.length-(x+1); y++) {
	    		if (array[y]>array[y+1]) {
	    			swap = true;
	    			int temp = array[y+1];
	    			array[y+1] = array[y];
	    			array[y] = temp;
	    		}
	    		iterations++;	
	    		if (swap == true){
	    			break;
	    		}    		
	    	}
	    }

	    for (int z = 0; z<array.length; z++) {
	    	System.out.println(array[z]);

	    }
	    System.out.println("");
	    System.out.println(iterations);

	}

    public static void main(String[] args) {
    	sort();
    }
}

