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