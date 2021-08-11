package com.problem2;

public class SuiteRoom extends HotelRoom {

	private int ratePerSqFeet;

	public SuiteRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi, int ratePerSqFeet) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 15;
	}
	
	public int getRatePerSqFeet() {
		if(HotelRoom.isHasWifi()==true) {
			return ratePerSqFeet+2;
		}
		else {
			return ratePerSqFeet;
		}
	}

	public SuiteRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 15;
	}
}
