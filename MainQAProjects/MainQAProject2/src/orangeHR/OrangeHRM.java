package orangeHR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM extends BasicSetup 
{
	public static void pause() throws InterruptedException
	{
		Thread.sleep(47000);
	}
	
	@BeforeClass //Display Message Before Class
	public void messageBeforeClass(){
		System.out.println("Let this message be always display before the class!!! ");
	}
	
	@BeforeMethod //Display Message Before each Test Cases
	public void messageBeforeTestCase() {
		System.out.println("Let this message be always display before the method!!!");
	}
	
	@Test(priority=1) //Test Case for Landing Page
	public static void landingPage()
	{
		driver.manage().window().maximize(); 
		driver.findElement(By.name("EmailHomePage")).sendKeys("twowett@visitorweb.net");
		driver.findElement(By.name("action_request")).click();
		
	}
	
	@Test(priority=2) //Test Case for Trial Details Entry Page
	public static void trialDetails() throws InterruptedException
	{
		 WebElement section1 = driver.findElement(By.className("free-trial-info-menu"));
	     new Actions(driver).scrollToElement(section1).perform();
	     driver.findElement(By.name("subdomain")).sendKeys("twowettexp");
	     driver.findElement(By.name("Name")).sendKeys("Tom Matthew Ett");
	     driver.findElement(By.name("Email")).sendKeys("twowett@visitorweb.net");
	     driver.findElement(By.name("Contact")).sendKeys("+61 483 839 583");
	     driver.findElement(By.name("Country")).sendKeys("Australia");
	     pause();
	     driver.findElement(By.name("action_submitForm")).click();
	     
	}
	
	@Test(priority=3) //Test Case for Contact Sales option to go to the Contact Details Entry Page  
	public static void contactSales()
	{
		driver.findElement(By.xpath("//body[1]/nav[1]/div[1]/div[2]/div[2]/ul[1]/li[2]/a[1]/button[1]")).click();
	}
	
	@Test(priority=4) // Test Case for the Contact Details Entry Page
	public static void contactDetails() throws InterruptedException
	{
		 WebElement section2 = driver.findElement(By.className("contact-form-section"));
	     new Actions(driver).scrollToElement(section2).perform();
	     driver.findElement(By.name("FullName")).sendKeys("Tom Matthew Ett");
	     driver.findElement(By.name("Contact")).sendKeys("+61 483 839 583");
	     driver.findElement(By.name("Email")).sendKeys("twowett@visitorweb.net");
	     Select country = new Select(driver.findElement(By.name("Country")));
	     country.selectByVisibleText("Australia");
	     Select no_of_employees = new Select(driver.findElement(By.name("NoOfEmployees")));
	     no_of_employees.selectByVisibleText("101 - 150");	     
	     driver.findElement(By.name("JobTitle")).sendKeys("Software Tester");
	     driver.findElement(By.name("Comment")).sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
	     pause();
	     driver.findElement(By.name("action_submitForm")).click();
	     
	}
	
	@Test(priority=5) //Test Case for Book Free Demo option to go to the Free Demo Entry Page 
	public static void bookFreeDemo()
	{
		driver.findElement(By.xpath("//body[1]/nav[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/a[1]/button[1]")).click();
	}
	
	@Test(priority=6) //Test Case for Booking in the Free Demo Entry Page 
	public static void demoForm() throws InterruptedException
	{
		WebElement section3 = driver.findElement(By.className("free-demo-info-menu"));
	    new Actions(driver).scrollToElement(section3).perform();
	    driver.findElement(By.name("FullName")).sendKeys("Tom Matthew Ett");
	    driver.findElement(By.name("Email")).sendKeys("twowett@visitorweb.net");
	    Select country = new Select(driver.findElement(By.name("Country")));
	    country.selectByVisibleText("Australia");
	    driver.findElement(By.name("Contact")).sendKeys("+61 483 839 583");
	    pause();
	    driver.findElement(By.name("action_submitForm")).click();
	    
	}
	
	@Test(priority=7) //Test Case for Returning to Landing Page by pressing on Navbar logo 
	public static void returnHome()
	{
		driver.findElement(By.xpath("//body[1]/nav[1]/div[1]/a[1]")).click();
	}
	
	@AfterMethod //Display message after each method
	public void messageAfterTestCase(){
		System.out.println("Let this message be always display after the method!!!");
	}
	
	@AfterClass //Display message after class
	public void messageAfterClass() {
		System.out.println("Let this message be always display after the class!!!");
	}
}
