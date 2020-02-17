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
