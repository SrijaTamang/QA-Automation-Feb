package FebAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetUp {
	
	public static WebDriver driver;

	public static WebDriver browser() 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		return driver;
		
	}
	
	public static void Login()
	{
		
		driver.findElement(By.xpath("(//a[@class='nav-link text-dark'])[3]")).click();
		driver.findElement(By.id("Input_Email")).sendKeys("srijatamang8@gmail.com");
		driver.findElement(By.id("Input_Password")).sendKeys("Test@123");
		driver.findElement(By.id("login-submit")).click();
		
	}
	
	@BeforeSuite (alwaysRun = true)
	public static void OpenBrowser()
	{
		driver=browser();
		driver.get("https://localhost:7196/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Login();
		
	}
	
	
}
