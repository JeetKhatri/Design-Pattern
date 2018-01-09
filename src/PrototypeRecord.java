public class PrototypeRecord implements PrototypeClone{
	private String name, designation, address;
	private double salary;

	PrototypeRecord() {
	}

	PrototypeRecord(String name, String designation, double salary,
			String address) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.address = address;
	}

	public void showRecord() {

		System.out.println("Name : " + name + "\nDesignation : " + designation + "\nSalary : "
				+ salary + "\nAddress : " + address);
	}

	@Override
	public PrototypeRecord getClone() {

		return new PrototypeRecord(name, designation, salary, address);
	}
}
