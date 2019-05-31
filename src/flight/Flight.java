package flight;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flight {

	public void testFlight(String args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.expedia.com.sg");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		driver.findElement(By.id("//button[@id='tab-flight-tab-hp']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("//button[@id='tab-flight-tab-hp']"))
				.sendKeys("jaipur");

		// wait for the suggestions to appear

		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		wait2.until(ExpectedConditions.visibilityOf(driver.findElement(By
				.xpath("//*[@role='listbox']/div/li/a/span/div"))));

		List<WebElement> suggestions = driver.findElements(By
				.xpath("//*[@role='listbox']/div/li/a/span/div"));
		System.out.println("Size of the suggestions is : " + suggestions);
		System.out.println(suggestions.size());

		for (int j = 0; j < (suggestions.size()); j++) {

			System.out.println("value is : " + suggestions.get(j).getText());

			suggestions.get(j + 1).click();
		}
		new FlightSearchResult().searchResults();
	}
}
