package day06.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestTask {
// We check the input task name is valid 
	@Test
	
	public void testvalid() {
		Assertions.assertTrue(Task.taskName("wakeupearly"));
	}
	
//	we check the input task is invalide
	@Test
	public void testInvalid() {
//		we check the input task name size minumum 2 and maximum 50 
		try {
			Task.taskName("to");
			Assertions.fail("Validate failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("The  task name should be  minimum 2 letters and maximum 200 letters", ex.getMessage());
		}
//		we check the input empty or null 
		try {
			Task.taskName(null);
			Assertions.fail("Validate failed");
		}
		catch(IllegalArgumentException e) {
			Assertions.assertEquals("TaskName cannot be null or empty", e.getMessage());
			
		}
	}
	
//	Test a task priority
	@Test
	public void testpriority() {

		Assertions.assertTrue(Task.taskpriority(1));

	}

//	Test a task invalide priority
	
	@Test
	public void testInValidpriority() {

		try {
			Task.taskpriority(0);
			Assertions.fail("Validate failed");
		} catch (IllegalArgumentException e) {
			Assertions.assertEquals("InValid priority", e.getMessage());
		}

	

	}
	
}
