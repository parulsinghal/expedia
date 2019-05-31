package demofb;


import java.text.ParseException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class FacebookChrome {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
// getting title name and length
		
		String title=	driver.getTitle();
        int length= driver.getTitle().length();
         	
		System.out.println("title of the page is:"+ title);
		System.out.println("length of the page is:"+ length);
		
//URL verification
		
		String actualURL= driver.getCurrentUrl();
		if (actualURL.equals("https://www.facebook.com/"))
		{
			System.out.println("successful verification :");	
		}
		
		else
		{
			System.out.println("unsuccessful attempt :");	
		
		}

//getting page source
		
		String pageSource= driver.getPageSource();
		int pageSourceLength= driver.getPageSource().length();
		
		System.out.println("pageSource is :"+ pageSource);
		System.out.println("pageSourcelength is :"+ pageSourceLength);
		
//refreshing page
		
		driver.navigate().refresh();
		Thread.sleep(4000);
		
	
//email
		WebElement element = driver.findElement(By.xpath("//input[@name='email']"));
		String linktexttagname = element.getTagName();
		
		System.out.println("linktexttagname is :" +linktexttagname);
		
	    element.sendKeys("parul.singhal43@gmail.com");
	
		driver.findElement(By.xpath("//input[@name='email']")).click();
// password
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("nishantparulnishant");
		
		driver.findElement(By.xpath("//input[@name='pass']")).click();
//name
		
		driver.findElement(By.xpath("//input[@id='u_0_j']")).sendKeys("parul");
		driver.findElement(By.xpath("//input[@id='u_0_j']")).click();
		
//surname		
		driver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys("singhal");
		driver.findElement(By.xpath("//input[@id='u_0_l']")).click();
//dob		
		Select s1= new Select(driver.findElement(By.xpath(" //select[@id='day']")));
		s1.selectByIndex(6);
		
		Thread.sleep(3000);
		
//male input		
	    
		driver.findElement(By.xpath("//input[@value='2'][@name='sex']")).click();
		Thread.sleep(3000);
//sign-up button		
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		Thread.sleep(3000);
//login 		
		
		WebElement element1= driver.findElement(By.xpath("//input[@value='Log In']"));
//attributes
		
		String attri= element1.getAttribute("xpath");
		System.out.println("attribute is:"+attri);
//location
		Point point= element1.getLocation();
//dimension
	
		Dimension dimensions = element1.getSize();
		
		System.out.println("height"+dimensions.height+"width"+dimensions.width);
		System.out.println("x-coordinate"+point.x+"y-coodinate"+point.y);
		element1.click();
		
		Thread.sleep(6000);
		
//alert click		
		
		WebElement alert=driver.switchTo().activeElement();
		alert.click();//accept();
		Thread.sleep(3000);
		
		
//profile click
		
		driver.findElement(By.xpath("//a[@class='_2s25 _606w']")).click();
		
		Thread.sleep(3000);
		WebElement comboBox = driver.findElement(By.xpath("//div[@class='coverBorder']"));
		comboBox.click();
		
//page scroll
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,8000)");
		
		
				//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		//((JavascriptExecutor) driver).executeScript("scroll(0,800)");
		
		
		Thread.sleep(5000);
		
		
		driver.navigate().back();
		
		
		
		//driver.findElement(By.xpath("//div[@class='fbTimelineProfilePicSelector _23fv']")).click();	
	//	driver.findElement(By.xpath("")).click();
		//WebElement uploadElement = driver.findElement(By.xpath(""));
		//uploadElement.sendKeys("N:\\bio\\NISHANT.JPG");
		
		
//home click
		
		driver.findElement(By.xpath("//a[@class='_2s25']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		
//create click
		
	//driver.findElement(By.xpath("//a[@id='creation_hub_entrypoint']")).click();
		
		driver.findElement(By.xpath("//a[@class='_6-6'][contains(text(),'Friends')]")).click();
		Thread.sleep(3000);
		
		//driver.navigate().back();
		
		//driver.findElement(By.cssSelector("#js_bql")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Search for your friends']")).sendKeys("hhhj");
		
		Thread.sleep(3000);
		
   driver.findElement(By.xpath("//span[@class='_3sz'][contains(text(),'Birthdays')]")).click();
   
   Thread.sleep(4000);
   JavascriptExecutor js1= (JavascriptExecutor)driver;
  	js1.executeScript("scrollBy(0,500)");
  	 Thread.sleep(4000);
 driver.findElement(By.xpath("//span[@class='_c24 _2iem']//following::div[@ class='_5t4x'][1]/a")).click();
 
 Thread.sleep(3000);
driver.navigate().back();
 Thread.sleep(4000);

 driver.findElement(By.xpath("//span[@class='_c24 _2iem']//following::div[@ class='_5t4x'][2]")).click();

 Thread.sleep(3000);
 driver.navigate().back();
 Thread.sleep(3000);
 
 driver.findElement(By.xpath("//span[@class='_c24 _2iem']//following::div[@ class='_5t4x'][3]")).click();
 Thread.sleep(3000);
 driver.navigate().back();
 Thread.sleep(3000);
 
 try{
 driver.findElement(By.xpath("//span[@class='_c24 _2iem']//following::div[@ class='_5t4x'][4]")).click();
 Thread.sleep(3000);
 driver.navigate().back();
 }
 catch(Exception e)
 {
	 e.printStackTrace();
	 }
 finally
 {
	 System.out.println("no element is there more ");
 }
 
 Thread.sleep(6000);
 
 JavascriptExecutor js2= (JavascriptExecutor)driver;
	js2.executeScript("scrollBy(0,500)");
	//js2.executeScript("window.scrollTo(0,document.body.(scrollHeight(-500))");
	Thread.sleep(6000);
	 
	// driver.findElement(By.xpath("//button[@id='u_4y_27']")).click();
	// Thread.sleep(6000);
	 
	 //WebElement list= driver.findElement(By.xpath("//div[@id='pagelet_timeline_app_collection_100000687546524:221226937919712:10']//following::li[1]"))
	
			
 
		        
 //String parentHandle = driver.getWindowHandle(); 
 driver.findElement(By.xpath("//div[@id='pagelet_timeline_app_collection_100000687546524:221226937919712:10']//following::li[1]")).click();
 Thread.sleep(3000);
 
 
 String URL= driver.getCurrentUrl();
 System.out.println("current url"+URL);
 
 Thread.sleep(3000);
 
 
 
// for (String winHandle : driver.getWindowHandles()) {
   //  driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
// }
 driver.findElement(By.xpath("//div[@class='_50zm']")).click();
 Thread.sleep(3000);
 
 String URL2= driver.getCurrentUrl();
 System.out.println("current url2"+URL2);
 
 driver.findElement(By.xpath("//div[@class='_6iis']//span[1]")).click();
 
 Thread.sleep(3000);
 
 
 
 //driver.switchTo().window(parentHandle); 
		
		         
	}
}



 /*  boolean present;
   try {
      driver.findElement(By.xpath("//span[@class='_3sz'][contains(text(),'Birthdays')]"));
     
      present = true;
      System.out.println("message"+present );
      
     
   }
   catch (NoSuchElementException e)
   {
     
      present = false;
      
   } /*
   
   



//driver.findElement(By.xpath("//span[@class='_c24 _2iem']//following::div[@ class='_5t4x'][i]")).click();     

	driver.findElement(By.xpath("//span[@class='_c24 _2iem']//following::div[@ class='_5t4x'][1]")).click(); 
	
	  Thread.sleep(3000);

	
	driver.navigate().back();

    Thread.sleep(3000);

	

//  driver.findElement(By.xpath("//div[@id='userNavigationLabel'] ")).click();
          //Thread.sleep(3000);
          
         //driver.findElement(By.xpath("//a[@class='_4-h7 _5qtn fbReactComposerAttachmentSelector_STATUS']")).click();
         
         
        // driver.findElement(By.xpath("//span[@class='_m _5g_r']//div[@class='_3jk']")).click();
       //  WebElement uploadElement = driver.findElement(By.xpath("//span[@class='_m _5g_r']//div[@class='_3jk']"));
 		
 		//uploadElement.sendKeys("N:\\bio\\NISHANT.JPG");
 		//WebElement UploadImg = driver.findElement(By.xpath("//span[@class='_m _5g_r']//div[@class='_3jk']"));
 		
 		//  UploadImg.click();
 		
 		 
 		  
 		
 		 //System.out.println(UploadImg.getText());
 		 //driver.findElement(By.name("File name")).sendKeys("N:\\NG\\Nishant_docs\\Marriage certificate.jpg");
 		//WebElement alert1=driver.switchTo().activeElement();
 		//Thread.sleep(3000);
 		
		//alert1.
		//Thread.sleep(3000);
 		// alert1.submit();
 		 
         
 		 // driver.findElement(By.xpath("//li[@class='_54ni navSubmenu _6398 _6393 __MenuItem']")).click();
    
     //  driver.findElement(By.linkText("Facebook")).click();  
    //   driver.findElement(By.linkText("Add Photos/Video")).click();  
     //  driver.findElement(By.xpath("//div[text()='Upload Photos/Video']/ following-sibling::div/input")).sendKeys("N:\\bio\\Nishant_pick.jpg");  
      
       
       
          
          
          
        
    
	}

}
	
	
	
	/*-------------------------------------------------------
	  
          href link test
	
	driver.navigate().back();
	
	
	List<WebElement>linklist= driver.findElements(By.tagName("a"));
	linklist.addAll(driver.findElements(By.tagName("img")));
	System.out.println("size before sort"+linklist.size());
	
	
	List<WebElement>activeLinks=new ArrayList<WebElement>();

	
	for(int i=0;i<linklist.size();i++)
	{
		try
		{
			if(linklist.get(i).getAttribute("href")!= null)
			
				activeLinks.add(linklist.get(i));				
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			e.getMessage();
		}
	}
	System.out.println("size after sort"+activeLinks.size()); */
	

	

	

	



		
		
		//System.out.println("driver.getTitle() after nav: " + driver.getTitle());
		//driver.manage().window().setPosition(new Point(0, 0));
		//driver.manage().window().maximize();
		
		