package blazeDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class BlazeDemo  extends BasicSetup{
	@BeforeClass
	public void messageBeforeClass(){
		System.out.println("Always display this message before class");
	}
	
	
	@BeforeMethod
	public void messageBeforeTestCases() {
		System.out.println("Always display this message before method");
	}
	
	
	@Test(priority=1)//Test case for landing page
	public static void landingPage() {
		
		driver.manage().window().maximize(); 
	    Select dep_city=new Select(driver.findElement(By.name("fromPort")));
	    dep_city.selectByVisibleText("Boston");
	    Select dest_city=new Select(driver.findElement(By.name("toPort")));
	    dest_city.selectByVisibleText("Cairo");
	    driver.findElement(By.xpath("//input[@class='btn btn-primary']")).submit();
		
	}
	
	@Test(priority=2)//Test Case for Reserve Page 
	public static void reservePage() {
		
		
		driver.manage().window().maximize(); 
	    driver.findElement(By.xpath("//body[1]/div[2]/table[1]/tbody[1]/tr[3]/td[1]/input[1]")).sendKeys(Keys.RETURN);
	}
	
	@Test(priority=3)//Test case for purchase ticket page
	public static void purchaseTicket() {
		
		
		driver.manage().window().maximize(); 
	    driver.findElement(By.id("inputName")).sendKeys("Dravin Poudyal");
	    driver.findElement(By.name("address")).sendKeys("NewRoad");
	    driver.findElement(By.id("city")).sendKeys("Kathmandu");
	    driver.findElement(By.name("state")).sendKeys("Bagmati pradesh");
	    driver.findElement(By.id("zipCode")).sendKeys("101234");
	    Select card_type=new Select(driver.findElement(By.name("cardType")));
	    card_type.selectByVisibleText("Diner's Club");
	    driver.findElement(By.id("creditCardNumber")).sendKeys("1608-5674-9874-1123");
	    driver.findElement(By.id("creditCardMonth")).sendKeys("12");
	    driver.findElement(By.id("creditCardYear")).sendKeys("2020");
	    driver.findElement(By.name("nameOnCard")).sendKeys("Dravin Poudyal");
	    driver.findElement(By.name("rememberMe")).click();
	    driver.findElement(By.xpath("//input[@class='btn btn-primary']")).submit();
	    
	}
	
	@Test(priority=4)//Test case for register page
	public static void registerPage() {
		
		driver.get("https://www.blazedemo.com/register");
		driver.manage().window().maximize(); 
	    driver.findElement(By.id("name")).sendKeys("Dravin Poudyal");
	    driver.findElement(By.id("company")).sendKeys("NAC");
	    driver.findElement(By.id("email")).sendKeys("poud.drav@org.company.np");
	    driver.findElement(By.id("password")).sendKeys("Dravin12Poudyal34");
	    driver.findElement(By.id("password-confirm")).sendKeys("Dravin12Poudyal34");
	    driver.findElement(By.xpath("//button[@class='btn btn-primary']")).submit();
	}
	
	public static void login() {
		driver.get("https://blazedemo.com/login");
	}
	
	@Test(priority=5)//Test case for login page
	public static void homeLoginPage() {
	
		login();
		driver.manage().window().maximize(); 
		driver.findElement(By.id("email")).sendKeys("poud.drav@org.company.np");
		driver.findElement(By.id("password")).sendKeys("Dravin12Poudyal34");
		driver.findElement(By.name("remember")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).submit();
    
}

	
	@Test(priority=6)//Test case for forgot password page 
	public static void forgotPassword(){
		
		login();
		driver.manage().window().maximize(); 
	    driver.findElement(By.xpath("//a[@class='btn btn-link']")).click();
	}
	
	@Test(priority = 7)//Test case for reset password page
	public static void resetPassword(){
		
		driver.get("https://blazedemo.com/password/reset");
		driver.manage().window().maximize(); 
		driver.findElement(By.id("email")).sendKeys("poud.drav@org.company.np");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).submit();
	}
	
	
	
	@Test(priority=5)//Test Case for Destination of week page
	public static void destOfWeek() {
		
		driver.get("https://www.blazedemo.com/");
		driver.manage().window().maximize(); 
	    driver.findElement(By.xpath("//body[1]/div[2]/div[1]/p[2]/a[1]")).click();
	}
	
	
	
	
	@AfterMethod //Display message after each method
	public void messageAfterMethod(){
		System.out.println("Always display this message after method");
	}
	
	@AfterClass //Display message after class
	public void messageAfterClass() {
		System.out.println("Always display this message after class");
	}
	
	
		

}
