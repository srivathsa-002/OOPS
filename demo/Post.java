package demo;
import java.util.ArrayList;
interface IPostCreate
{
    void createPost(String message);
}

interface IPostRead
{
    void readPost();
}

 class Post implements IPostCreate
{
    Logger errorLogger = new ErrorLogger();
    Database db = new Database(); 
    public  void createPost(String postMessage)
    {
        if(postMessage.startsWith("ERROR"))
        	errorLogger.log(postMessage);
        else 
        	db.addToDb(postMessage);
    }
}
class TagPost implements IPostCreate{
	Database db=new Database();
	@Override
	public void createPost(String postMessage) {
		//logger.log(postMessage);
		db.addAsTag(postMessage);
	}
}
class MentionPost extends Post
{
	@Override 
    public void createPost(String postMessage)
    {
        super.createPost(postMessage);
        db.notifyUser(postMessage); 
    }
}
class ReadingPost implements IPostRead{
	Database db = new Database();
	@Override
	public void readPost() {
		ArrayList<String> lists = new ArrayList<String>();
		lists.addAll(db.getUnhandledPosts());
		System.out.println("\nReading Posts:");
		for(String s : lists)
			System.out.println(s);
	}
}
/*class TagPost extends Post
{
	@Override
	public void createPost(String postMessage) {
		// TODO Auto-generated method stub
		db.addAsTag(postMessage);
	}
}*/
