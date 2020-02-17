class Tv implements Screen {
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Override
	public void screenDetails() {
		// TODO Auto-generated method stub
		System.out.println("This has a TV Screen!!!!");
	}
}
