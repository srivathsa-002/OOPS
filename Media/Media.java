abstract class Media {
	private String name;
	private int duration;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public void writeTo(IWriter writer) {
		writer.saveTo(name);
	}
	abstract void printInfo();
}
