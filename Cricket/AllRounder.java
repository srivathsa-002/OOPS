class AllRounder extends Player implements IAllRounder {
	public String getName() {
		return name;
	}
	public int getJerseyNo() {
		return jerseyNo;
	}
	public void role() {
		System.out.println(batsmanRole);
		System.out.println(bowlerRole);
	}
}