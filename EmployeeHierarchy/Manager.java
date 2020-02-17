import java.util.ArrayList;

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
