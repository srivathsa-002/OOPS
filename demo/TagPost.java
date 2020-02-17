class TagPost implements IPostCreate{
	Database db=new Database();
	@Override
	public void createPost(String postMessage) {
		//logger.log(postMessage);
		db.addAsTag(postMessage);
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
