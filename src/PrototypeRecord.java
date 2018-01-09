/***
 * 
 * @author JeetKhatri
 * @since Jan,18
 * 
 */
public class PrototypeRecord implements PrototypeClone{
	private String name, designation, address;
	private double salary;

	PrototypeRecord() {
	}
	/***
	 * 
	 * @param name Name of the employee
	 * @param designation designation of the employee
	 * @param salary salary of the employee
	 * @param address address of the employee
	 */
	PrototypeRecord(String name, String designation, double salary,
			String address) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.address = address;
	}
	/***
	 * Display record
	 */
	public void showRecord() {

		System.out.println("Name : " + name + "\nDesignation : " + designation + "\nSalary : "
				+ salary + "\nAddress : " + address);
	}

	@Override
	public PrototypeRecord getClone() {

		return new PrototypeRecord(name, designation, salary, address);
	}
}
