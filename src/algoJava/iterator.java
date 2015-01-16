package algoJava;

import java.util.*;

public class iterator {

	public iterator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		// add elements to the array list
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		
		//Use iterator display contents of al
		
		System.out.println("Original contents of al: ");
		Iterator itr = al.iterator();
		
		while (itr.hasNext()) {
			Object element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();
		
		// Modify objects being iterated
		
		ListIterator litr = al.listIterator();
		while (litr.hasNext()) {
			Object element = litr.next();
			litr.set(element + "+");
		}
		System.out.println("Modified contents of al: ");
		itr = al.iterator();
		
		while (itr.hasNext()) {
			Object element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();
		
		//Now, display the list backwards
		System.out.println("Modified list backwards: ");
		while (litr.hasPrevious()) {
			Object element = litr.previous();
			System.out.print(element + " ");
		}
		
		System.out.println();
	}

}
