package algoJava;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class treeset {

	public treeset() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = {"one", "two", "three", "four", "four", "five"};
		//convert string array to lis
		List<String> tmpList = Arrays.asList(strArr);
		//create a treeset with the list, which eliminates duplicates
		TreeSet<String> unique = new TreeSet<String>(tmpList);
		System.out.println(unique);
		
	}

}
