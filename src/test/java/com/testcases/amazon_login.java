package com.testcases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon_login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C://Driver//chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		
		String wa=driver.getWindowHandle();
		
		driver.switchTo().window(wa);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("mohalkar.ram@hotmail.com");
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Shri@123");
		
		Thread.sleep(10);
		
		driver.close();
		
	}

}