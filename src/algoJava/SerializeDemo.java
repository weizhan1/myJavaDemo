package algoJava;
import java.io.*;

public class SerializeDemo {
	
	public SerializeDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.name = "Reyan Ali";
		e.address = "Test address, OK";
		e.SSN = 114466389;
		e.number = 101;
		
		try {
			FileOutputStream fileOut = new FileOutputStream ("/tmp/employee.ser");
			ObjectOutputStream out = new ObjectOutputStream (fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved");
		} catch (IOException i) {
			i.printStackTrace();
		}
		
	}

}
