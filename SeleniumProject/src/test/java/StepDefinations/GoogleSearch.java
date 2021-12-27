//package StepDefinations;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//
//public class GoogleSearch {
//	
//	WebDriver driver = null;
//	
//	@Given("browser is open")
//	public void browser_is_open() {
//		System.out.println("Inside Step - browser is open");
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project Path is :"+projectPath);
//		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
//	    driver = new ChromeDriver();
//	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	    driver.manage().window().maximize();
//	}
//
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() {
//		
//		System.out.println("Inside Step - user is on google search page");
//		driver.navigate().to("https://www.google.com");
//	    
//	}
//
//	@When("user enter a text in search box")
//	public void user_enter_a_text_in_search_box() throws InterruptedException {
//	   
//		driver.findElement(By.name("q")).sendKeys("automation step by step");
//		Thread.sleep(2000);
//	}
//
//	@When("hits enter")
//	public void hits_enter() throws InterruptedException {
//	   
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//	}
//
//	@Then("user is navigated to search results")
//	public void user_is_navigated_to_search_results() {
//	   
//		driver.getPageSource().contains("Selenium - Automation Step by Step");
//		driver.close();
//		driver.quit();
//		
//	}
//
//}
