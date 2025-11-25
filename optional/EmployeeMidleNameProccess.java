package optional;

import java.util.Optional;

class Employee{
	private String name;
	private String midleName;
	private String lastName;
	
	public Employee(String name,String midleName,String lastName) {
		this.name=name;
		this.midleName=midleName;
		this.lastName=lastName;
	}

	public String getName() {
		return name;
	}

	public Optional<String> getMidleName() {
		return Optional.ofNullable(midleName);
	}

	public String getLastName() {
		return lastName;
	}
	
	
}


public class EmployeeMidleNameProccess {
public static void main(String[] args) {
	Employee e1 = new Employee("Sundar", "G.", "Belkar");
    Employee e2 = new Employee("Ram", null, "Shinde");
	String e1FullName=e1.getName()+" "+e1.getMidleName().orElse(" ")+" "+e1.getLastName();
	String e2FullName=e2.getName()+" "+e2.getMidleName().orElse(" ")+" "+e2.getLastName();
	
	System.out.println(e1FullName);
	System.out.println(e2FullName);
}
}
