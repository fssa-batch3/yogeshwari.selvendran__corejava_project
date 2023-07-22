package day11.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTaskToDo {
	@Test
	public void testValidTask() throws DAOException {
		Task task1 = new Task("Learn java", "Compleated");
		Assertions.assertTrue(TaskToDo.createTask(task1));
	}

	@Test
	public void testInValidTask() {
		try {
			Task task1 = null;
			TaskToDo.createTask(task1);
		} catch (DAOException ex) {
			Assertions.assertEquals("Tasks object cannot be null", ex.getMessage());
		}

	}

}
