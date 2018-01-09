/***
 * 
 * @author JeetKhatri
 * @since Jan,18
 * 
 */
package CreationalDesignPatterns.PrototypeDesignPattern;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypeMain {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Name: ");
		String name = br.readLine();

		System.out.print("Enter Designation: ");
		String designation = br.readLine();

		System.out.print("Enter Address: ");
		String address = br.readLine();

		System.out.print("Enter Salary: ");
		double salary = Double.parseDouble(br.readLine());

		PrototypeRecord e1 = new PrototypeRecord(name, designation,
				salary, address);
		System.out.println();
		e1.showRecord();
		PrototypeRecord e2 = (PrototypeRecord) e1.getClone();
		System.out.println();
		e2.showRecord();

	}
}
