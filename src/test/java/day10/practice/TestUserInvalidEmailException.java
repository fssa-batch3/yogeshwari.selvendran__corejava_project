package day10.practice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestUserInvalidEmailException {
	
	User use1=new User(1, "yogi", "yogi@gmail.com");
	User use2=new User(1, "yogi", "yogibot@gmail.com");
	User use3=new User(1, "yogi", "yogibot@gmail.com");
	@Test

	public void testRegisterUser() {
		
	
		
	   Assertions.assertTrue(UserValidator.register(use1));
	}
	
	@Test
	public void testAlreadyRegisterUser() {
		try {
			UserValidator.register(null);
		
			
			Assertions.fail("User Already added failed");
			
		}
		catch(UserAlreadyExistsException e) {
		   Assertions.assertEquals("object cannot null", e.getMessage());
		}
		

	
	try {
		UserValidator.register(use3);
		UserValidator.register(use2);
		UserValidator.register(use3);
		
		Assertions.fail("User Already added failed");
		
	}
	catch(UserAlreadyExistsException e) {
	   Assertions.assertEquals("User Already added", e.getMessage());
	}
	}
}
