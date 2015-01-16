package algoJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bsearch {

	public bsearch() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Emp> empList = new ArrayList<Emp>();
		empList.add(new Emp(12, "Danny", 50000));
		empList.add(new Emp(145, "Victor", 58000));
		empList.add(new Emp(201, "John", 40400));
		empList.add(new Emp(302, "Krish", 20040));
		empList.add(new Emp(543, "Anny", 10500));
		
		Emp searchKey = new Emp(201, "John", 40400);
		int index = Collections.binarySearch(empList, searchKey, new EmpComp());
		System.out.println("Index of the searched key: " + index);
	}

}
