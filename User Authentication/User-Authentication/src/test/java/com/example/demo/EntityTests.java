package com.example.demo;
import com.example.entities.User;
import com.example.repositories.UserRepository;
import com.example.services.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class EntityTests {
	@Test
	public void getAndSetPassword() {
		User testUser = new User();
		
		testUser.setPassword("mypassword");
		assertEquals(testUser.getPassword(),"mypassword");
	}
	
	@Test
	public void getAndSetName() {
		User testUser = new User();
		
		testUser.setName("joe");
		assertEquals(testUser.getName(),"joe");
	}
	
	@Test
	public void getAndSetEmail() {
		User testUser = new User();
		
		testUser.setEmail("joe@email.com");
		assertEquals(testUser.getEmail(),"joe@email.com");
	}
	
	@Test
	public void checkToString() {
		User testUser = new User();
		
		assertNotNull(testUser.toString());
	}
	
	@Test
	public void checkConstructor() {
		User testUser = new User("joe","joe@email.com","joe");
		
		User checkUser = new User();
		checkUser.setName("joe");
		checkUser.setEmail("joe@email.com");
		checkUser.setPassword("joe");
		
		assertEquals(testUser.getName(), checkUser.getName());
		assertEquals(testUser.getEmail(), checkUser.getEmail());
		assertEquals(testUser.getPassword(), checkUser.getPassword());
	}
	
	@Test
	public void testDefaultConstructor() {
		User testUser = new User();
		
		assertNotNull(testUser);
	}
}
