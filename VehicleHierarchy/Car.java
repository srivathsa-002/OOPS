class Car extends Vehicle {
    private int wheelCount;
    public Car(String regNo,int model,int wheelCount) {
        super(regNo,model);
        this.wheelCount=wheelCount;
    }
    public void display() {
        System.out.println("Four wheeler car");
        super.display();
        System.out.println("No. of wheels:" + wheelCount);
    }
}
