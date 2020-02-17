class Bike extends Vehicle {
    private int wheelCount;
    public Bike(String regNo,int model,int wheelCount) {
        super(regNo,model);
        this.wheelCount=wheelCount;
    }
    public void display() {
        System.out.println("Two wheeler Bike");
        super.display();
        System.out.println("No. of wheels: " +wheelCount);
    }
}
