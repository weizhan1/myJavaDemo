package algoJava;
import java.util.Comparator;
import java.util.TreeMap;

public class treemap {

	public treemap() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//the treemap sorts by key
		TreeMap<String, String> hm = new TreeMap<String, String>(new MyComp());
		//add key-value pair to TreeMap
		hm.put("java",  "language");
		hm.put("computer", "machine");
		hm.put("india", "country");
		hm.put("mango", "fruit");
		System.out.println(hm);	
	}	

}
