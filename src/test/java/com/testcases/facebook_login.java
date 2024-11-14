package com.testcases;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class facebook_login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications"); // disable notification

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");  //open URL
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("9766900619");
		
		driver.findElement(By.id("pass")).sendKeys("Rambabu@12");
		
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		
		driver.findElement(By.xpath("//div[@aria-label=\"Account\"]")).click();
		
		String act_title=driver.getTitle();
		
		System.out.println(act_title);
		
		String title="Facebook";
		
		if(act_title.contains(title))
		{
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
		
		//driver.close();
	}

}
