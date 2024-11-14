package com.testcases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class flipcart_login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "c://Driver//chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='_36HLxm col col-3-5']//form//input[@type='text']")).sendKeys("454");
		driver.findElement(By.xpath("//div[@class='_36HLxm col col-3-5']//form//input[@type='password']")).sendKeys("1234");
		driver.findElement(By.xpath("//div[@class='_36HLxm col col-3-5']//form//button[@type='submit']")).submit();

		driver.close();
	}

}