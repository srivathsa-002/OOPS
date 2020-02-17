import java.io.*;

class Logger implements ILogger{
	public void log(String logMessage) {
		try {
			File f = new File("/home/muthyala/contents.txt");
			PrintWriter out = new PrintWriter(new FileWriter(f, true));
			out.write(logMessage);
			out.close();
		}catch(Exception e){}
		System.out.println("\nWriting to log:" +  logMessage);
	}
}

