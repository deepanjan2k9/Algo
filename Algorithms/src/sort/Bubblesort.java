package sort;

public class Bubblesort {

	/**
	 * Method to implement bubble sort. 
	 * Running time: O(n-1(n-2)) - the inner for-loop will run n-2 times and 
	 * the outer do-while loop which denotes each pass, will run at most n-1
	 * times. Therefore, worst case scenario the algorithm has O(n^2) time 
	 * complexity. 
	 * */
	
	public void DoBubblesort(int[] arr) {
		boolean swap=false;
		int[] array = arr;
		int temp;
		
		/*
		 * After each potential swap, set swap=false otherwise the 
		 * algo gets stuck in infinite do-while loop. Once all elements
		 * are sorted, the algorithm still needs to execute one last pass
		 * to know that all elements are sorted. The boolean value swap
		 * takes care of this, since at the beginning of each pass its value
		 * is false. At the last pass where all elements are already sorted,
		 * the value remains false throughout, and the do-while loop finally
		 * terminates.*/
		do {
			swap=false;
			for(int i=0; i<array.length-1; i++) {
				if(array[i] > array[i+1]) {
					temp=array[i+1];
					array[i+1] = array[i];
					array[i] = temp;
					swap = true;
				}	
			}
		}while(swap==true);
	

		System.out.println("Sorted array: ");
		for(int i=0;i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bubblesort obj = new Bubblesort();
		int[] arr = {29,10,4,13,27,37}; 
		obj.DoBubblesort(arr);
		
	}

}
