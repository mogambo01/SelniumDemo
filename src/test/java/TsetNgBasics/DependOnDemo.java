package TsetNgBasics;

import org.testng.Assert;
import org.testng.annotations.Test;


public class DependOnDemo {
	
	@Test
	public void login(){
		System.out.println("Validating login");
		//Assert.fail("Login is not Working");
		}
	
	@Test(dependsOnMethods = {"login"})
	public void sendFriendRequest() {
		System.out.println("Sending Friend Request");
		Assert.fail("Login is not Working");
	}
	
	@Test(dependsOnMethods = {"login", "sendFriendRequest"})
	public void acceptFriendRequest() {
		System.out.println("Acceping Friend Request");
	}
	@Test
	public void forgotPassword() {
		System.out.println(" Forgot Password");
	}

}
