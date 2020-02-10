package demo;
import java.io.*;
interface ILogger{
	void log(String logMessage);
}

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

class ErrorLogger extends Logger{
	public void log(String logMessage) {
		try {
			File f = new File("/home/muthyala/error.txt");
			FileWriter fw = new FileWriter(f);
			fw.write(logMessage);
			fw.close();
		}catch(Exception e){}
		System.out.println("\nWriting error to log:" +  logMessage);
		}
}