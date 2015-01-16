package algoJava;
import java.util.Comparator;
public class EmpComp implements Comparator<Emp>{

	public int compare(Emp e1, Emp e2) {
		// TODO Auto-generated constructor stub
		if(e1.getEmpId() == e2.getEmpId()) {
			return 0;
		} else {
			return -1;
		}
	}

}
