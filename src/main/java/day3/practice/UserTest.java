package day3.practice;
// Create a User class with 2 constructors. the second overloaded constructor
//User(name, password, emailId)
class User{
	private String name;
	private String password;
	private String emailId;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	public User() {
		
	}
	public User(String name,String password,String emailId) {
		this.name = name;
		this.password = password;
		this.emailId = emailId;
	}
}





public class UserTest {
public static void main(String[] args) {
	User u1 = new User();
	u1.setName("Yogi");
	u1.setEmailId("yogi@gmail.com");
	u1.setPassword("Yogi@123");
	System.out.println("Name:"+" "+u1.getName());
	System.out.println("WmailId:"+" "+u1.getEmailId());
	System.out.println("Name:"+" "+u1.getPassword());
}
}
