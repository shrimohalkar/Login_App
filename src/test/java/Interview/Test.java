package Interview;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

//	1. Open Google.com
//	Repeatable steps
//	  2. Search for <Test Data>
//	  3. Wait till the result is loaded
//	  4. Show the response for 3 seconds

	public static void main(String args[]) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://Google.com");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("Test Data");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = driver.findElement(By.xpath("//input[contains(text(),'login')]"));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();

		Thread.sleep(3000);
		driver.close();

	}

}
