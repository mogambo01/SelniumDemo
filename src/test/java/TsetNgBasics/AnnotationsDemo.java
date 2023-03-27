package TsetNgBasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Open The Browser");
		System.out.println("Launch The Application");
	}
	
	@Test
	public void validateTitle() {
		System.out.println("Validating the Title");
	}
	@Test
	public void validateLogin() {
		System.out.println("Validating Login");
	}
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Close the Browser");
		
	}
}
