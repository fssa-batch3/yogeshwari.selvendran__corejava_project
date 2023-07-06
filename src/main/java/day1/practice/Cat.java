package day1.practice;

public class Cat {
	 // Attributes
    private int age;
    private String color;
static  String speak = "Meow!";

    // Getters and setters
   

    public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	
	//

	// Main method to create Dog objects
    public static void main(String[] args) {
        // Create two Dog objects
        Cat cat1 = new Cat();
        cat1.setColor("White");
        cat1.setAge(3);
        Cat cat2 = new Cat();
        cat2.setColor("blue");
        cat2.setAge(4);

        // Print the attributes of each Dog
        System.out.println("Cat 1:");
        System.out.println("Age: " + cat1.getAge());
        System.out.println("Color: " + cat1.getColor());
        System.out.println("Speaks:" + speak);

        System.out.println("Cat 2:");
        System.out.println("Age: " + cat2.getAge());
        System.out.println("Color: " +cat2.getColor());
        System.out.println("Speaks:" + speak);
    }
}
