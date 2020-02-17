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
