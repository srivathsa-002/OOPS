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
