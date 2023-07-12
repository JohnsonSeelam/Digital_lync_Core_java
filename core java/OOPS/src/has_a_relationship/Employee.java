package has_a_relationship;

public class Employee {
	public int empId;
	public String empName;
	public String empContact;
	public String empEmail;
	public Address address;
	public Employee(int empId, String empName, long l, String empEmail, Address address2) {

		this.empId = empId;
		this.empName = empName;
		this.empContact = empContact;
		this.empEmail = empEmail;
		this.address = address2;
	}
	public void display() {
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empContact);
		System.out.println(empEmail);
		System.out.println(address.address);
		System.out.println(address.pincode);
		System.out.println(" ");
	}
	public static void main(String[] args) {
		Address address1 = new Address("Hyderabad", 533401);
		Employee emp1 = new Employee(101, "Johnson", 9640434735L, "seelam.johnson@gmail.com", address1);
		emp1.display();
		Address address2 = new Address("Tuni", 533401);
		Employee emp2 = new Employee(102, "John", 9645555885L, "john@gmail.com", address2);
		emp2.display();
	}
	

}
