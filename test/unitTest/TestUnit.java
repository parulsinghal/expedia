package unitTest;

import hotel.HotelBooking;

import org.junit.Test;

import structured.ExpediaTest;

public class TestUnit {

	@Test
	public void TestCode(){
		//new ExpediaTest("Sonu").test();
		try {
			new HotelBooking().hotelSearch("Sonu");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
