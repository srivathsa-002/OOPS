class Calling extends MobileCall {
	private String number;
	Calling(String number) {
		this.number=number;
	}
	@Override
	public void call() {
		System.out.println("Calling " + number);
	}
	public String getNumber() {
		return number;
	}
}