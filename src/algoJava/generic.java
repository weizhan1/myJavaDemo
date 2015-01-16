package algoJava;

public class generic {

	public generic() {
		// TODO Auto-generated constructor stub
	}
	
	public static <E> void printArray(E[] inputArray) {
		// Display array elements
		for ( E element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create arrays of Integer, Double and Character
		Integer[] intArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
		Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
		
		System.out.println("Array integerarray:");
		printArray( intArray);
		
		System.out.println("Array doublearray:");
		printArray( doubleArray);
		
		System.out.println("Array characterarray:");
		printArray( charArray);
		
		}

}
