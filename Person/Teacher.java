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