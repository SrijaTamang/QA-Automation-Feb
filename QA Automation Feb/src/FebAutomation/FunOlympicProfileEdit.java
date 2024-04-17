package FebAutomation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FunOlympicProfileEdit extends SetUp{
	
	@Test
	public static void Changepassword() 
	{
		
		driver.findElement(By.xpath("//a[@title='Manage']")).click();
		
		driver.findElement(By.id("change-password")).click();
		
		driver.findElement(By.id("Input_OldPassword")).sendKeys("Test@123456");
		driver.findElement(By.xpath("(//input[@autocomplete='new-password'])[1]")).sendKeys("Test@123");
		driver.findElement(By.xpath("(//input[@autocomplete='new-password'])[2]")).sendKeys("Test@123");
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	}

}
