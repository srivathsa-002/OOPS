import java.util.ArrayList;

class Database {
	public static ArrayList<String> posts = new ArrayList<String>();
	//DIP
	ILogger logge=new Logger();
	public void addToDb(String postMessage) {
		posts.add(postMessage);
		logge.log(postMessage);
		String message = postMessage;
		System.out.println("Added to Database : "+ message);
	}
	public void addAsTag(String postMessage) {
		posts.add(postMessage);
		logge.log(postMessage);
		String tagMessage = postMessage;
		System.out.println("Added to Database : "+ tagMessage);
	}

	public void notifyUser(String postMessage) {
		System.out.println("Sending notification to user :" + postMessage);
	}
	
	public ArrayList<String> getUnhandledPosts(){
			return posts;
	}
}
