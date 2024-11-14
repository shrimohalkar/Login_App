package Interview;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.google.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebDriverWait wait = (WebDriverWait) driver;

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='id']")))).click();

		Actions act = new Actions(driver);

		act.contextClick(driver.findElement(By.id("id"))).build().perform();

		Select sel = new Select(driver.findElement(By.className("drp")));
		sel.selectByVisibleText("ram");

		List<WebElement> options = sel.getOptions();

		for (WebElement option : options) {
			String str = option.getText();

			if (str.equalsIgnoreCase("ram")) {
				option.click();
				break;
			}
		}

	}

}
