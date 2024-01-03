package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	@Test
	public void test01(){
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/selenium%20software/Offline%20Website/index.html");
    	driver.manage().window().maximize();
    	
    	driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
    	driver.findElement(By.id("password")).sendKeys("123456");
    	driver.findElement(By.xpath("//button")).click();
    	
    	Assert.assertEquals(driver.getTitle(),"JavaByKiran | Dashboard");
	}
}
