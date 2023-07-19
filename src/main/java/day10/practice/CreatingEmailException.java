package day10.practice;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;


class InvalidEmailException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8105491977357554060L;

	// Calling each super constructors for each of the types
	public InvalidEmailException(String msg) {
		super(msg);
	}

	public InvalidEmailException(Throwable te) {
		super(te);
	}

	public InvalidEmailException(String msg, Throwable te) {
		super(msg, te);
	}
}
class EmailValidator {
	public static boolean isValidEmail(String emailId) throws InvalidEmailException {
		if(emailId==null) {
			
			throw new InvalidEmailException("Email is null");
			}
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(emailId);
//		Boolean isMatch = matcher.matches();
		Boolean isMatch = Pattern.matches(regex, emailId);

		if (!isMatch) {
			throw new InvalidEmailException("Email is invalid");
		
		}
		return true;
	}
}

public class CreatingEmailException {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter your emailId");
	String email = s.nextLine();
	try {
		EmailValidator.isValidEmail(email);
	} catch (InvalidEmailException e) {
		e.printStackTrace();
	}
}
}
