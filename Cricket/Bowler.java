class Bowler extends Player implements IBowler {
	
	public String getName() {
		return name;
	}
	public int getJerseyNo() {
		return jerseyNo;
	}
	public void role() {
		System.out.println(bowlerRole);
	}
}