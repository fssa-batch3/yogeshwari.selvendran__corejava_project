package day07.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Question#2: Create an ArrayList<TaskUnique> of TaskUnique with tasks having the same name and deadline.
 * Use a HashSet<TaskUnique> to remove duplicate tasks.
 */
public class TaskUnique {
    private int id;
    private String name;
    private LocalDate deadline;

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

    public TaskUnique(int id, String name, LocalDate deadline) {
        this.id = id;
        this.name = name;
        this.deadline = deadline;
    }
    
    @Override
    public String toString() {
        return "Duplicate [id=" + id + ", name=" + name + ", deadline=" + deadline + "]";
    }
    
    public static boolean  validatetaskName (String name)throws IllegalArgumentException {
		if(name==null || name.isEmpty()) {
			throw new IllegalArgumentException(" The taskName cannot be null or empty");
		}
		String nameregex = "^[a-zA-Z]{2,50}$";
		Pattern pattern = Pattern.compile(nameregex);
		Matcher matcher = pattern.matcher(name);
		Boolean isMatch = matcher.matches();



		 if (!isMatch) {
			throw new IllegalArgumentException("The  task name should be  minimum 2 letters and maximum 50 letters");

		}
		 return true;

		
	}
    
    public static boolean  validateTaskDate(LocalDate deadline)throws IllegalArgumentException {
		LocalDate currentDate = LocalDate.now();
		if(deadline==null) {
			throw new IllegalArgumentException("Task date cannot be empty or  null");
		}
		if(deadline.isBefore(currentDate)) {
			throw new IllegalArgumentException("Task date should be in the prasent");
			
		}
		return true;
		
	}

    public static void main(String[] args) {
        ArrayList<TaskUnique>taskList = new ArrayList<>();

        TaskUnique t1 = new TaskUnique(1, "wakeupearly", LocalDate.of(2023, 07, 16));
        taskList.add(t1);
        taskList.add(t1);
        taskList.add(new TaskUnique(2, "Walking", LocalDate.of(2023, 07, 17)));
        taskList.add(new TaskUnique(3, "Office", LocalDate.of(2023, 07, 15)));
        System.out.println(taskList);

        taskDuplicate(taskList);

    }

    public static void taskDuplicate(ArrayList<TaskUnique> tasks) {
        HashSet<TaskUnique> uniqueTasks = new HashSet<TaskUnique>(tasks);
        System.out.println(uniqueTasks);
    }
public static boolean validateDuplicatemethod(ArrayList<TaskUnique> tasks) throws IllegalArgumentException{
		
		HashSet<String> taskSet = new HashSet<>();
		for(TaskUnique task:tasks) {
			   String taskLists = task.getName() + "-" + task.getDeadline();
			   if(taskSet.contains(taskLists)) {
				   throw new IllegalArgumentException("duplicate task was found");
			   }
			   taskSet.add(taskLists);
		
		}
		return true;
	}

}
