package Interview;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "c://Driver//chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Abc@123");
		
		driver.findElement(By.xpath("//*[@name='login']")).click();
		
		driver.close();
	}

}
