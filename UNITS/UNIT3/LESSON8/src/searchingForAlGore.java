import java.util.*;

public class searchingForAlGore {

	public static void sort(int[] array) {	
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
    	Scanner scan = new Scanner(System.in);
    	int[] array = {5,45,4165,1546354865,2,15,48,136,0,12,5};
    	int L = 0;
    	int R = array.length - 1;
    	int M = (L+R)/2;
		String input = scan.nextLine();
    	sort(array);
    	while (L!=M && L!=R && R!=M) {
    		
    	}
    }
}
