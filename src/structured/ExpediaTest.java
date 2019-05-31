package structured;

import hotel.HotelBooking;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import flight.Flight;

public class ExpediaTest {
	String instanceVar;
	 public ExpediaTest(String args){
		 instanceVar = args;
	 }
	 

	public static void main(String[] args) {
		ExpediaTest expedia = new ExpediaTest(args[0]);
		expedia.test();
		//expedia.clone()..
	}
	
	public void test(){
		try {
			//new Flight().testFlight(instanceVar);
			new HotelBooking().hotelSearch(instanceVar);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
}
