package com.testcases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c://Driver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[contains (@id,'APjFqb')]")).sendKeys("Shriram.mohalkar");
		
		driver.findElement(By.xpath("//*[@class=\"gNO89b\"]")).click();

	}

}
