package test.java.com.qaa.module3.unit_testing_exercises.exercise2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import main.java.com.qaa.module3.unit_testing_exercises.exercise2.UserService;

class UserServiceTest {
	
	private UserService service;

	@BeforeEach
	void setUp() throws Exception {
		service = new UserService();
	}

	@AfterEach
	void tearDown() throws Exception {
		service = null;
	}
	
	void RegisterValidDetails()
	{
		String username = "bobby";
		String password = "pswrd";
		String expected = username;
		
		String actual = service.register(username, password);
		
		Assertions.assertEquals(expected, actual);
	}
}