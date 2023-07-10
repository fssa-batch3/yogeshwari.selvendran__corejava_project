package day3.practice;

class  Employee{
	private int id;
    private String name;

    public Employee() {
    	
    }
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
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

	
}

public class TestEmployee {
	 
    public static void main(String[] args) {
   
        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("naresh");
        Employee e2 = new Employee();
        e2.setId(2);
        e2.setName("suresh");
        
//         1, "naresh" 2, "suresh"
        
        System.out.println("id="+ e1.getId()+"," + " "+"name="+e1.getName());
        System.out.println("id="+ e2.getId()+"," + " "+"name="+e2.getName());
    }
}
