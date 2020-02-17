public class Testing {
	//Database db = new Database();
	
	public static void main(String[] args) {
		//Logger logger = new Logger();
		//ErrorLogger errorlogger = new ErrorLogger();
		Post p = new Post();
		p.createPost("Content1");
		
		Post error = new Post();
		error.createPost("ERRORContent1");
		
		Post lsp=new MentionPost();
		lsp.createPost("LSPContent");
		
		TagPost tag = new TagPost();
		tag.createPost("#Content2");
		
		MentionPost mention = new MentionPost();
		mention.createPost("@Content3");
		
		ReadingPost read = new ReadingPost();
		read.readPost();
	}
}
