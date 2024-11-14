package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstcry_login {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.firstcry.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='fc_login']/ul/li[6]")).click();
		
		driver.findElement(By.cssSelector("input#lemail")).sendKeys("90989889898");
		
		driver.findElement(By.xpath("//div[text()='CONTINUE']")).click();
		
		driver.close();

	}

	
	
//	WebDriverWait wait = new WebDriverWait(driver, 10);
//	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//form[1]/div/label/span[text()='Enter Email/Mobile number']")));
	
//	driver.findElement(By.xpath("//form[1]/div/label/span[text()='Enter Email/Mobile number']")).click();
}
