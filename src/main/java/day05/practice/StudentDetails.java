package day05.practice;

class Department {
	String deptName;
	int deptId;
	
	public Department(String deptName,int deptId) {
		this.deptName=deptName;
		this.deptId=deptId;
	}
	
}
class Student {
	String name;
	int id;
	Department department;
	
	// Create a constructor and assign depart and respective attributes
	// Add toString method to get the Student details.
	
	public  Student(String name,int id,Department department) {
		
		this.name=name;
		this.id=id;
		this.department=department;
	}
	public void getStudent() {
		
		System.out.println("Student details:");
		System.out.println("Department name: "+department.deptName);
		System.out.println("Department id: "+department.deptId);
		System.out.println("Student name: "+name);
		System.out.println("Student id: "+id);
	}
	
	
}
public class StudentDetails {
	public static void main(String[] args) {
		Department Scetion =new Department("CIVIL", 456);
		Student roal =new Student("Yogi", 33, Scetion);
		roal.getStudent();
	}
}
