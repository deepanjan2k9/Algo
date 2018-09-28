package sort;

/**
 * Class to implement quick sort algorithm.
 * */
public class Quicksort {
	
	int arr[];
	
	public Quicksort(int[] arr) {
		this.arr = arr;
	}
	
	/**
	 * Recursively runs Quicksort algorithm on the 
	 * arrays left and right to the partition index. 
	 * @param left: the left-most index of the array
	 * @param right: the right-most index of the array
	 * */
	public void DoQuicksort(int left, int right) {
		int index = Partition(left, right);
		if(left < index - 1) {
			DoQuicksort(left, index-1);
		}
		if(index < right) {
			DoQuicksort(index, right);
		}
	}

	/**
	 * Partitions the array in the following fashion - 
	 * Left most index is i, right most index is j. 
	 * While i is less than or equal to j, if value at i
	 * is less than the pivot value, then increment i. If
	 * value at j is greater than pivot value, then decrement j.
	 * If value at i is equal to or greater than value at j,
	 * then swap those values while i being less than or equal 
	 * to j. Loop ends when i becomes greater than j. In that case,
	 * return i as the index where array is split into two and sent
	 * to DoQuicksort method to run algorithm recursively. 
	 * 
	 * @param left: left-most index of array
	 * @param right: right-most index of array
	 * @return index: the index where array is split
	 * */
	public int Partition(int left, int right) {
		int i = left;
		int j = right;
		int pivot = arr[(i+j)/2];
		int temp = 0;
		
		while(i <= j) {
			while(arr[i] < pivot) {
				i++;
			}
			while(arr[j] > pivot){
				j--;
			}
			if(i <= j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		return i;
	}
	
	
	/**
	 * Utility method to display contents of array
	 * */
	public void printArray() {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[] = {1,12,5,26,7,14,3,7,2};
		Quicksort q = new Quicksort(arr);
		System.out.println("Unsorted array: ");
		q.printArray();
		q.DoQuicksort(0, 8);
		System.out.println("Sorted array: ");
		q.printArray();
		
	}

}
