class MentionPost extends Post
{
	@Override 
    public void createPost(String postMessage)
    {
        super.createPost(postMessage);
        db.notifyUser(postMessage); 
    }
}

