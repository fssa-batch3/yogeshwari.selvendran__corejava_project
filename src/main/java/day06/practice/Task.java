package day06.practice;

import java.util.ArrayList;

import java.util.List;

public class Task {
	public String taskName;

	public int priority;

	public Task(String taskName, int priority) {
		this.taskName = taskName;
		this.priority = priority;
	}

	public static void main(String[] args) {
		ArrayList<Task> taskList = new ArrayList<>();
		taskList.add(new Task("wakeupearly", 1));
		taskList.add(new Task("Walking", 2));
		taskList.add(new Task("Office", 3));
		taskList.add(new Task("Brackfast", 4));

		for (Task task: taskList) {
			System.out.println("Task Name" + task.taskName);
		}
	}
}
