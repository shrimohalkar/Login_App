package com.testcases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlinks {

	public static void main(String[] args) throws IOException {

		//System.setProperty("webdriver.chrome.driver", "C://Driver//chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/"); //https://www.flipkart.com/  https://www.amazon.in/ https://www.facebook.com/
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total links is --> " + links.size());
		
		int brokenlinks=0;

		for (WebElement element : links) {

			String url = element.getAttribute("href");

			if (url == null || url.isEmpty()) {
				System.out.println("URL is Empty --> " + url);
				continue;
			}

			URL link = new URL(url);

			try {
				HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();

				httpconn.connect();

				int rescode = httpconn.getResponseCode();

				if (rescode>=400) {

					System.out.println(rescode+ " -- "+url + " " + " --> Is broken link");
					brokenlinks++;
				} else {
					System.out.println(rescode+ " -- "+url + " " + "--> Is valid link");
				}
			} catch (Exception e) {

			}
		}
		
		System.out.println("Total Bokenlink is --> " +brokenlinks );
		driver.quit();
	}

}
