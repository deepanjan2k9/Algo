package sort;

/**
 * Class to implement quick sort algorithm.
 * */
public class Quicksort {
	
	int arr[];
	
	public Quicksort(int[] arr) {
		this.arr = arr;
	}
	
	public void DoQuicksort(int left, int right) {
		int index = Partition(left, right);
		if(left < index - 1) {
			DoQuicksort(left, index-1);
		}
		if(index < right) {
			DoQuicksort(index, right);
		}
	}

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
	
	public void printArray() {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,12,5,26,7,14,3,7,2};
		Quicksort q = new Quicksort(arr);
		System.out.println("Unsorted array: ");
		q.printArray();
		q.DoQuicksort(0, 8);
		System.out.println("Sorted array: ");
		q.printArray();
		
	}

}
