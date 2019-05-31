package demofb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookRegistration
{

	public static void main(String[] args)
	{
		//System.setProperty("webdriver.firefox.driver","N:\\Parul\\geckodriver.exe\\firefoxdriver.exe");
		System.setProperty("webdriver.gecko.driver","N:\\Parul\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//driver.

 
	}
}

