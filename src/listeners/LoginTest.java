package listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	
	@Test
	public void loginByEmail() {
		System.out.println("Login by email");
		Assert.assertEquals("gaurav","gaurav");
	}
	
	@Test
	public void loginByFacebook() {
		System.out.println("Login by facebook");
		Assert.assertEquals("gaurav","rahul");
	}
}
