public class Testing {
	public static void main(String[] args) {
		IceCream chocolate = new ChocolateIceCream("Scoops");
		chocolate.details();
		System.out.println(chocolate.getName());
		chocolate.myFlavour();
		IceCream strawberry = new StrawberryIceCream("Masqati");
		strawberry.details();
		System.out.println(strawberry.getName());
		strawberry.myFlavour();
	}
}
