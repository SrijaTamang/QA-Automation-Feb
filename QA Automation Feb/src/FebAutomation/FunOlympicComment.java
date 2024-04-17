package FebAutomation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FunOlympicComment extends SetUp{
	
	@Test
	public static void Comment() 
	{
		driver.findElement(By.xpath("//a[@href='/Broadcasts']")).click();
		
		driver.findElement(By.xpath("(//img[@class='card-img-top rounded '])[1]")).click();
		
		driver.findElement(By.id("Comment_Content")).sendKeys("This is my favourite");
		driver.findElement(By.xpath("//input[@value='Post']")).click();
	}

}
