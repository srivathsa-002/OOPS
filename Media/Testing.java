public class Testing {
	public static void main(String[] args) {
		Media audio = new AudioMedia();
		audio.setName("ASDFGHJ");
		audio.setDuration(20);
		audio.writeTo(new DiskWriter());
		audio.printInfo();
		Media video = new VideoMedia();
		video.setName("ZXCVBNM");
		video.setDuration(40);
		video.writeTo(new CloudWriter());
		video.printInfo();
	}
}
interface IWriter {
	public void saveTo(String fileName);
}
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

class DiskWriter implements IWriter{
	@Override
	public void saveTo(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Saving a file to Disk");
	}
}
class CloudWriter implements IWriter {
	@Override
	public void saveTo(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Saving a file to Cloud");
	}
}
class AudioMedia extends Media {
	@Override
	void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("This is an audio file. It's name is " + getName() + ". It's duration is " + getDuration() + " minutes.");
	}
}
class VideoMedia extends Media {
	@Override
	void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("This is a video file. It's name is " + getName() + ". It's duration is " + getDuration() + " minutes.");
	}
}