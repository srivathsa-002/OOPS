public class Testing {
    public static void main(String[] args) {
    	Pen pen1 = new GelPen("Octane","Blue");
    	Pen pen2 = new InkPen("Old Model","Red");
    	Pen pen3 = new BallPen("Cello","Black");
    	System.out.println(pen1.getClass());
    	pen1.displayDetails();
    	System.out.println(pen2.getClass());
    	pen2.displayDetails();
    	System.out.println(pen3.getClass());
    	pen3.displayDetails();
    }
}