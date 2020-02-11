import java.util.ArrayList;

public class Testing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setFirstName("MNOPQR");
		employee.setLastName("STUVWX");
		employee.setId(2);
		Employee employee1 = new Employee();
		employee1.setFirstName("JAQOIN");
		employee1.setLastName("PHOENIX");
		employee1.setId(3);
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(employee);
		empList.add(employee1);
		Manager manager = new Manager();
		manager.setId(1);
		manager.setFirstName("ABCDEF");
		manager.setLastName("GHIJKL");
		manager.setSubordinates(empList);
        System.out.println(manager);
	}
}
interface IEmployee {
	public void setFirstName(String firstName);
	public void setLastName(String lastName);
}
class Employee implements IEmployee {   
    private int id;
    private String firstName;
    private String lastName;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}

class Manager extends Employee {
    private ArrayList<Employee> subordinates = new ArrayList<Employee>();
    public ArrayList<Employee> getSubordinates() {
        return subordinates;
    }
    public void setSubordinates(ArrayList<Employee> empList) {
        subordinates.addAll(empList);
    }
    @Override
    public String toString() {
        return "Manager [subordinates=" + subordinates + ", details=" + super.toString() + "]";
    }
}
