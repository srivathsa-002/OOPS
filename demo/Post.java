import java.util.ArrayList;

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
