package day09.practice;


import java.time.LocalDate;
import java.util.*;
import java.util.*;

public class Task implements Comparable<Task>{
	
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

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	private int id;
	    private String name;
	    private LocalDate deadline;
	    
	    public Task(int id, String name, LocalDate deadline) {
	        this.id = id;
	        this.name = name;
	        this.deadline = deadline;
	    }
	    
	    @Override
		public int hashCode() {
			return Objects.hash(deadline, id, name);
		}
	    
		@Override
	    public int compareTo(Task o) {
	    	if(deadline.equals(o.getDeadline())) {
	    		return 0;
	    	} else {
	    		if(deadline.isAfter(o.getDeadline())) {
	    			return 1;
	    		} else {
	    			return -1;
	    		}
    		
	    	}
	    	
	    }
	    @Override
public String toString() {
	return "SortingTask" +id +" "+name+" "+deadline;
}
public static void sortTask(List<Task> list) {
	Collections.sort(list);
	for(Task task:list) {
		System.out.println(task);
	}
}



//3,Coding,2022-10-22
//
//5,Product Design,2022-10-01
//
//1,Software Design, 2022-10-07
//
//3,Coding,2022-10-22

public static void main(String[] args) {
	List<Task> list = new ArrayList<Task>();
	list.add(new Task(3,"Coding",LocalDate.of(2022,10,22)));
	list.add(new Task(5,"Product Design",LocalDate.of(2022,10,01)));
	list.add(new Task(1,"Software Design",LocalDate.of(2022,10,22)));
	list.add(new Task(3,"Coding",LocalDate.of(2022,10,22)));
	
	sortTask(list);

}
}