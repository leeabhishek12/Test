package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.HomePage_PF;
import PageFactory.LoginPage_PF;
import io.cucumber.java.en.*;

public class LoginDemoSteps {
	
	
	WebDriver driver=null;
	LoginPage_PF login;
	HomePage_PF home;
	
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside Step - browser is open");
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project Path is :"+projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
	   
	driver.navigate().to("https://example.testproject.io/web/");
	
	}
	
	

	@When("^user enter (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
	    
		login= new LoginPage_PF(driver);
		login.enterUserName(username);
		login.enterPassword(password);
		
		Thread.sleep(2000);
	}

	@And("user clicks on login")
	public void user_clicks_on_login() {
		login.clickOnLogin();
	   
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		
		
		//home.checkLogoutIsDisplayed();
	    
	}

	
}
