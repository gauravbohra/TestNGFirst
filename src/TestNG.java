import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestNG {
	WebDriver driver;
  @Test
  public void f() {
	  
	  String baseUrl = "https://www.toolsqa.com/";
	  System.out.println("Launching Google Chrome browser");
      driver.get(baseUrl);
     driver.manage().window().maximize();
      String testTitle = "Free QA Automation Tools Tutorial for Beginners with Examples";
      String originalTitle = driver.getTitle();
      Assert.assertEquals(originalTitle, testTitle);
  }
  @BeforeMethod
  public void beforeMethod() {
	  
		System.setProperty("webdriver.chrome.driver",
				"C:\\GauravWorkSpace\\selenium.webdriver\\src\\test\\java\\webDriver\\chromedriver.exe");
      driver = new ChromeDriver();

	  System.out.println("Starting Test On Chrome Browser");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
