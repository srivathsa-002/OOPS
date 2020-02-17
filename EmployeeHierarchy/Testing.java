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