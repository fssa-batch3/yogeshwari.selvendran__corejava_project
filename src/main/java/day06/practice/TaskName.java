package day06.practice;

import java.util.ArrayList;

class Task1{
	private String name;
	public Task1(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
public class TaskName {
public static void main(String[] args) {
	ArrayList<Task1> task = new ArrayList<>();
	task.add(new Task1("Wakeup"));
	
	
	boolean find = TaskNamed("Wakeup",task);
		System.out.println("Task Status:"+ find);
}
	public static boolean TaskNamed(String name, ArrayList<Task1> task) {
		for(Task1 tasks: task) {
			if(tasks.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
}

