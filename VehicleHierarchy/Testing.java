interface IVehicle{
	public void display();
}
class Vehicle implements IVehicle {
    private String regNo;
    private int model;
    public Vehicle(String regNo, int model) {
        this.regNo=regNo;
        this.model=model;
    }
    public void display() {
        System.out.println("Registration no: "+regNo);
        System.out.println("Model no: "+model);
    }
}
 
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
 
class Testing {
    public static void main(String[] args) {
        Bike bike;
        Car car;
        bike=new  Bike("TS 11 AB 2345", 1,2);
        car=new Car("TS 12 BC 4567",5,4);
        bike.display();
        car.display();
    }
}