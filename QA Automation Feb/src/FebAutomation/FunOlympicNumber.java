package FebAutomation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FunOlympicNumber extends SetUp{
	
	@Test
	public static void ChangeNumber()
	{
		driver.findElement(By.xpath("//a[@title='Manage']")).click();
		driver.findElement(By.id("profile")).click();
		
		driver.findElement(By.id("Input_PhoneNumber")).clear();
		driver.findElement(By.id("Input_PhoneNumber")).sendKeys("123456789");
		driver.findElement(By.id("update-profile-button")).click();
		System.out.println("Your profile has been updated");
	}

}
