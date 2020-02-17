class CoffeeMachine extends Milk implements ICompleteEspresso,ICappucino,ILatte {

	@Override
	public void getLatte() {
		// TODO Auto-generated method stub
		if(getMilkContent() >= 20.0 ) {
			getMilk();
			getSomeEspresso();
			System.out.println("Getting Latte");
			System.out.println("Mixing above contents....\nYOUR LATTE IS READY!!!!");
			setMilkContent(-20.0);
	
		}
		else {
			double addMilkQuantity =  20.0 - getMilkContent();
			System.out.println("Sorry Milk content is less... Please add atleast " + addMilkQuantity + " ml of milk");
		}
	}

	@Override
	public void getCapuccino() {
		// TODO Auto-generated method stub
		if(getMilkContent() > 30.0) {
			getMilk();
			getSomeEspresso();
			System.out.println("Getting Cappucino");
			System.out.println("Mixing above contents....\nYOUR CAPPUCINO IS READY!!!!");
			setMilkContent(-30.0);
		}
		else {
			double addMilkQuantity =  30.0 - getMilkContent();
			System.out.println("Sorry Milk content is less... Please add atleast " + addMilkQuantity + " ml of milk");
		}
	}

	@Override
	public void getCompleteEspresso() {
		// TODO Auto-generated method stub
		getSomeEspresso();
		System.out.println("YOUR ESPRESSO IS READY!!!!");
	}
	
	@Override
	public void getSomeEspresso() {
		// TODO Auto-generated method stub
		System.out.println("Getting Espresso");
	}
}