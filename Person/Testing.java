public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("QWERTYUIOP",20);
		person.displayDetails();
		Teacher teacher = new Teacher("ASDFGHJK",28);
		teacher.setDeptNo(20);
		teacher.displayDetails();
	}
}
interface IPerson {
	public String getName();
	public int getAge();
}
class Person implements IPerson,IDisplayDetails {
	private String name;
	private int age;
	Person(String name,int age) {
		this.age = age;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void displayDetails() {
		System.out.println("Person Details.....");
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
	}
}

class Teacher extends Person {
	private int deptNo;
	Teacher(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("The person is a teacher and hence he has a Dept No: " + getDeptNo());
	}
}

interface IDisplayDetails{
	public void displayDetails();
}