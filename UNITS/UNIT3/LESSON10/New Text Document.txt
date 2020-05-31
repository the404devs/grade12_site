/*Quick Sort Stuff
By Owen, Jatin and Kevin
April 20th, 2018
Mr. Krnic*/

import java.util.*;

public class QuickSort1 {

	public static int[] quickSort (ArrayList<Integer> array, int lPos, int rPos, int initialSize)
	{
		//ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		

		if(array.size()==1||array.size()==0)
		{
			System.out.println("super done");
			int[] testing = {0,1,2,3};
			return testing;
		}

		int L = array.get(0);
		int R = array.get(array.size()-1);
		int P = L;

		int pPos = lPos;
		System.out.println(L+" "+R+" "+P);
		while(1==1){
			//FIRST LOOP, COMPARE P TO R
			while (1==1)//L != R && L != P && R != P)
			{
				if(R==L)
				{
					pPos=lPos;
					System.out.println("done");
					break;
				}
				System.out.println("P is "+P);
				System.out.println("R is "+R);
				System.out.println("L is "+L);
				if (R<=P){//swap
					array.set(lPos, R);
					array.set(rPos, P);
					L = array.get(lPos);
					R = array.get(rPos);
					P = R;
					pPos = rPos;
					System.out.println("swaddp");
					break;
				}
				else{
					System.out.println("no swap");
					System.out.println(R);
					System.out.println(array.size()+"is less than"+((initialSize/2)+1));
					//if (array.size()>(initialSize/2)+1)
					if(array.size()==initialSize)
					{
						System.out.println("Size is "+array.size());
						rPos--;
						R = array.get(rPos);
					}
					else
					{
						System.out.println("L"+L+"R"+R+"P"+P);
						
						//else{
							lPos++;
							L = array.get(lPos);
							pPos=lPos;
							P=array.get(pPos);
							// rPos--;
							// R = array.get(rPos);
							//break;
						//}
					}
					
				}	
			}
			
			System.out.println("array:");
			for (int x=0; x<=array.size()-1; x++)
			{
				System.out.println(array.get(x)+"");
			}

			System.out.println("");
			System.out.println("");
			System.out.println("");
			//SECOND LOOP, COMPARE P TO L
			while (1==1)//L != R && L != P && R != P)
			{
				if(R==L)
				{
					pPos=lPos;
					System.out.println("done");
					break;
				}	
				System.out.println("P is "+P);
				System.out.println("R is "+R);
				System.out.println("L is "+L);
				if (L>=P){
					array.set(rPos, L);
					array.set(lPos, P);
					L = array.get(lPos);
					R = array.get(rPos);
					P = L;
					pPos = lPos;
					System.out.println("swap");
					break;
				}
				else{
					System.out.println("no swsedfrsedfsdfap");
					System.out.println(L);
					//if(array.size()>(initialSize/2)+1)
					//if (array.size()!=2)
					if(array.size()==initialSize)
					{
						System.out.println("Size is "+array.size());
						lPos++;
						L = array.get(lPos);
					}
					else
					{
						System.out.println("L"+L+"R"+R+"P"+P);
						
						//else{
							rPos--;
							R = array.get(rPos);
							pPos=rPos;
							P=R;
							//break;
						//}
						
					}
				}
		
			}
			System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");
			System.out.println("L is "+L+"R is "+R+"P is"+P);
			if(L==R&&L==P)
			{
				break;
			}



		}

		 if(R==L)
		 {System.out.println("done");}
		
		//mini arrays start here
		//slide 15 in powerpoint

		 System.out.println("array:");
		 for (int x=0; x<=array.size()-1; x++)
		 {
		 	System.out.println(array.get(x)+"");
		 }

	
		//mini arrays start here

		/*break it up into 2 arrays, on either side of P
		send em both through the function*/

		ArrayList<Integer> rightMini = new ArrayList<>();
		for (int x = pPos+1; x<array.size(); x++){
			System.out.println("right:"+array.get(x));
			rightMini.add(rightMini.size(), array.get(x));
		}


		System.out.println("RIGHT MINI ARRAY:" +rightMini.size());
		
		quickSort(rightMini, 0, rightMini.size()-1, initialSize);




		ArrayList<Integer> leftMini = new ArrayList<>();
		for (int x = 0; x<pPos; x++){
			leftMini.add(leftMini.size(), array.get(x));
		}

		

		System.out.println("LEFT MINI ARRAY:"+leftMini.size());
		
		//try to sort left mini
		quickSort(leftMini, 0, leftMini.size()-1, initialSize);

		System.out.println("ALL DONE, HERES THE SORTED ONE");
		for (int x=0; x<leftMini.size(); x++) {
			array.set(x,leftMini.get(x));
		}
		for (int x=0; x<rightMini.size(); x++) {
			array.set(x+pPos+1,rightMini.get(x));
		}
		for (int x=0; x<array.size(); x++) {
			System.out.println(array.get(x));
		}
		
		int[] testing = {0,1,2,3};
		return testing;

	}

    public static void main(String[] args) {
    	//ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(5,2,7,4,6,9,1));
    	ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(10,72,69,42,64,2,12,9,72));
    	//ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,4,8,3,6));
    	//System.out.println(nums.size()/2);

    	//(1,5,3,7,10,9,5)

    	quickSort(nums, 0, nums.size()-1, nums.size());
    }
}