package algoJava;

public class Emp {

		private int empId;
		private String empName;
		private int empSal;
		
		public Emp(int id, String name, int sal){
			this.empId = id;
			this.empName = name;
			this.empSal = sal;
		}
		
		public int getEmpId() {
			return empId;
		}
		
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		
		public String getEmpName() {
			return empName; 
		}
		
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		
		public int getEmpSal() {
			return empSal;
		}
		
		public void setEmpSal(int empSal) {
			this.empSal = empSal;
		}
		
		public String toString() {
			return empId + " : " + empName + " : " + empSal;
		}

}
