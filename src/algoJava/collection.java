package algoJava;

import java.util.*;
public class collection {

	public collection() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Collection Example:");
		int size;
		HashSet collection = new HashSet();
		String str1 = "Yellow", str2 = "White", str3 = "Green", str4 = "Blue";
		Iterator iterator;
		collection.add(str1);
		collection.add(str2);
		collection.add(str3);
		collection.add(str4);
		System.out.println("Collection data:");
		iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		size = collection.size();
		if (collection.isEmpty()) {
			System.out.println("Collection empty");
		} else {
			System.out.println("Collection size: " + size);
		}
		System.out.println();
	}

}
