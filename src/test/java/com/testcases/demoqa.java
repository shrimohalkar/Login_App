package com.testcases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class demoqa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Driver//chromedriver.exe");
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--allow-running-insecure-content");
		options.addArguments("--ignore-ssl-errors=yes");
		options.addArguments("--ignore-certificate-errors");
		
		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/login");
		
		// //*[@id="userName"]
		// //*[@id="password"]
		// //*[@id="login"]
		
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("alps");
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("alps1234!");
		
		Thread.sleep(20);
		
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		
		String titleOfPage= driver.getTitle();
		System.out.println(titleOfPage);
		
		// //*[contains(text(),"Log out")]
		
		
		driver.findElement(By.xpath("//*[contains(text(),'Log out')]"));
		
		driver.close();
		
		
	}

}
