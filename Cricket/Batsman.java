class Batsman extends Player implements IBatsman {
	public String getName() {
		return name;
	}
	public int getJerseyNo() {
		return jerseyNo;
	}
	public void role() {
		System.out.println(batsmanRole);
	}
}