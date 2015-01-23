package algoJava;

public class quicksort {

	private static int []a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a = getArray();
		printArray();
		sort();
		System.out.println();
		printArray();

	}
	
	public static void sort() {
		int left = 0;
		int right = a.length-1;
		quicksort(left, right);
	}
	
	private static void quicksort(int left, int right) {
		if (left >= right)
			return;
		
		int pivot = a[right];
		int partition = partition(left, right, pivot);
		
		quicksort(0, partition-1);
		quicksort(partition+1, right);
		
	}
	
	private static int partition(int left, int right, int pivot) {
		int leftCursor = left-1;
		int rightCursor = right;
		
		while (leftCursor < rightCursor) {
			while(a[++leftCursor] < pivot);
			while(rightCursor > 0 && a[--rightCursor] > pivot);
			
			if (leftCursor >= rightCursor) {
				break;
			} else {
				swap(leftCursor, rightCursor);
			}
		}
		swap(leftCursor, right);
		return leftCursor;
	}
	
	public static void swap(int left, int right) {
		int temp = a[left];
		a[left] = a[right];
		a[right] = temp;
	}
	
	public static void printArray() {
		for (int i: a) {
			System.out.print(i+" ");
		}
	}
	
	public static int[] getArray() {
		int size = 10;
		int [] array = new int[size];
		int item = 0;
		for (int i=0; i< size; i++) {
			item = (int)(Math.random()*100);
			array[i] = item;
		}
		return array;
	}

}
