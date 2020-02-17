class Account implements IBank{
	private String name;
	private String ac_no;
	private double amount;
	private int pin;
	public Account() {
		this.amount=0.0;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setAcNo(String ac_no) {
		this.ac_no=ac_no;
	}
	public String getAcNo() {
		return ac_no;
	}
	
	public void setBalance(double addAmount) {
		amount += addAmount;
	}
	public double getBalance() {
		return amount;
	}
	public void setPin(int pin) {
		this.pin=pin;
	}
	public int getPin() {
		return pin;
	}		
}