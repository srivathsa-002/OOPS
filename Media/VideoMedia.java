class VideoMedia extends Media {
	@Override
	void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("This is a video file. It's name is " + getName() + ". It's duration is " + getDuration() + " minutes.");
	}
}