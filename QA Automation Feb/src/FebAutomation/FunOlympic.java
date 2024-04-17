package FebAutomation;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class FunOlympic extends SetUp{
	
	
	@Test
	public static void Add() {
		
		driver.findElement(By.xpath("//button[@data-bs-toggle ='dropdown']")).click();
		driver.findElement(By.xpath("//a[@href ='/Videos']")).click();
		
		//to add videos
		driver.findElement(By.xpath("//a[@href ='/Videos/Create']")).click();
		driver.findElement(By.id("Video_VideoTitle")).sendKeys("Rang(The Rockheads)");
		driver.findElement(By.id("Video_VideoLink")).sendKeys("https://www.youtube.com/watch?v=U5syMIJ5JRA");
		driver.findElement(By.id("Video_ThumbnailLink")).sendKeys("https://noodlerex.com.np/media/albums/Single_Cover_-_Ranga_VGtEy3T.jpg");
		driver.findElement(By.id("Video_Category")).sendKeys("Music");
		driver.findElement(By.id("Video_VideoDescription")).sendKeys("Rang(The Rockheads)");
		driver.findElement(By.xpath("//input[@value ='Create']")).click();
		
	}
	
	@Test
	public static void Update() throws InterruptedException {
		
		Thread.sleep(20000);
		
		driver.findElement(By.xpath("(//a[@class='btn btn-primary mb-2'])[1]")).click();
		
		//update video title
		driver.findElement(By.id("Video_VideoTitle")).clear();
		driver.findElement(By.id("Video_VideoTitle")).sendKeys("John Chamling Rai");
		
		
		//update video link
		driver.findElement(By.id("Video_VideoLink")).clear();
		driver.findElement(By.id("Video_VideoLink")).sendKeys("https://www.youtube.com/embed/dQkiw5uK8JI?si=FKl0gdMCAwNyaHbx");
		
		
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		
	}
	
	@Test
	public static void Delete()
	{
		driver.findElement(By.xpath("(//a[@class='btn btn-danger py-2'])[2]")).click();
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
	}
	
	
	@AfterSuite
	public static void Logout()
	{
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
