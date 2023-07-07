package day2.practice;
/*
 * Create a User class with attribute id, name, password,
 *  emailId and create setters and getters for the same. 
 *  Please note no attribute should be available publicly
 *   they should be only be accessible via the access modifiers.
 */
public class Encapsulation {
	private int id;
private String name;
private String password;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
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
public static void main(String[] args) {
	Encapsulation check = new Encapsulation();
	check.setId(33);
	System.out.println(check.getId());
	check.setName("Yogi");
	System.out.println(check.getName());
	check.setPassword("Yogi@123");
	System.out.println(check.getPassword());
	
}

}
