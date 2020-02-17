abstract class Player {
	public String name;
	public int jerseyNo;
	public void setName(String name) {
		this.name = name;
	}
	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}
	public void playerDetails() {
		System.out.println("Name: " + name + "\nJersey No: " + jerseyNo);
	}
	public abstract void role();
}
