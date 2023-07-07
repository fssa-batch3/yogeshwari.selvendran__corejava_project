package day2.practice;

public class Logger {
	public static void debug (String msg) {
		System.out.println("DEBUG: " + msg);
	}
	public static void log (String msg) {

		System.out.println("LOG: " + msg);
	}
	
	public static void error (String msg) {
	
		System.out.println("ERROR: " + msg);
	}
	
	public static void debug (int num) {

		System.out.println("DEBUG: " + num);
	}	
	public static void log (int num) {
	
		System.out.println("LOG: " + num);
	}
	public static void error (int num) {
	
		System.out.println("ERROR: " + num);
	}
		
public static void main(String[] args) {
	
	Logger log = new Logger();
	
	log.debug("Yogi");
	log.log("Yogi");
	log.error("Yogi");
	
	log.debug(10);
	log.log(10);
	log.error(10);
}
}
