package stepDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import utilities.Hooks;

public class stepDefinition {
	WebDriver driver = Hooks.driver;
	
	@Given("^I have opened the elearning page$")
	public void i_have_opened_the_elearning_page() {
	  driver.get("http://elearningm1.upskills.in/");
	  driver.manage().window().maximize();
	    
	}

	@When("^Enter the \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_the(String FirstName, String LastName, String Email, String UserName, String Pass1, String Pass2) throws InterruptedException {
		driver.findElement(By.linkText("Sign up!")).click();
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@id='registration_firstname']")).sendKeys(FirstName);
	    driver.findElement(By.xpath("//input[@id='registration_lastname']")).sendKeys(LastName);
	    driver.findElement(By.xpath("//input[@id='registration_email']")).sendKeys(Email);
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys(UserName);
	    driver.findElement(By.xpath("//input[@id='pass1']")).sendKeys(Pass1);
	    driver.findElement(By.xpath("//input[@id='pass2']")).sendKeys(Pass2);
	    
	    driver.findElement(By.id("registration_submit")).click();
	}
		
	    
	
	@Then("^Register is successful$")
	public void register_is_successful() {
		
	    System.out.println("Registration Successful");
	    	    
	}
	
	@Then("^Goto Inbox$")
	public void goto_Inbox() throws InterruptedException {
	  //Click on Caret to open frame
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		Thread.sleep(3000);
		//Click on Inbox to send the email
		driver.findElement(By.xpath("//div/div[2]/ul[2]/li[2]/ul/li[3]/a")).click();
		Thread.sleep(3000);
		
	}

	@Then("^Send Email$")
	public void send_Email() throws InterruptedException, AWTException  {
		driver.findElement(By.xpath("//img[@title='Compose message']")).click();
		Thread.sleep(3000);
		WebElement E=driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		E.sendKeys("Arifa");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Arifa Khatoon (Arifa_ibm)']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='title']")).sendKeys("Test Email");
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']")));
		WebElement E1= driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']"));
		E1.click();
		E1.sendKeys("This is a testing email.");
		Thread.sleep(3000);
		driver.switchTo(). parentFrame();
	    driver.findElement(By.xpath("//button[@name='compose']")).click();
	     
	    WebElement Alertmessage= driver.findElement(By.xpath("//div[@class='alert alert-success']//*[text()='Arifa Khatoon (Arifa_ibm)']"));
	    Assert.assertEquals(Alertmessage.isDisplayed(), true);
	}

	


}
