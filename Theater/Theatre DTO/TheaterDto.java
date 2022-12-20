package com.Xworkz_Theater;

public class TheaterDto{

	private String name;
	private String location;
	private int noOfSeats;
	private String timings;
	private boolean hasParking;
	private String showTimings;
	private int noOfFloors;
	private int noOfStores;
	private int noOfEntrance;
	private String Screens;
	
	
	public TheaterDto()
	{
	System.out.println("I am default constructor");
	}

	public TheaterDto(String name, String location, int noOfSeats, String timings, boolean hasParking,
			String showTimings, int noOfFloors, int noOfStores, int noOfEntrance, String screens) {
		super();
		this.name = name;
		this.location = location;
		this.noOfSeats = noOfSeats;
		this.timings = timings;
		this.hasParking = hasParking;
		this.showTimings = showTimings;
		this.noOfFloors = noOfFloors;
		this.noOfStores = noOfStores;
		this.noOfEntrance = noOfEntrance;
		Screens = screens;
	}
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public int getNoOfSeats() {
		return noOfSeats;
	}


	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}


	public String getTimings() {
		return timings;
	}


	public void setTimings(String timings) {
		this.timings = timings;
	}


	public boolean isHasParking() {
		return hasParking;
	}


	public void setHasParking(boolean hasParking) {
		this.hasParking = hasParking;
	}


	public String getShowTimings() {
		return showTimings;
	}


	public void setShowTimings(String showTimings) {
		this.showTimings = showTimings;
	}


	public int getNoOfFloors() {
		return noOfFloors;
	}


	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}


	public int getNoOfStores() {
		return noOfStores;
	}


	public void setNoOfStores(int noOfStores) {
		this.noOfStores = noOfStores;
	}


	public int getNoOfEntrance() {
		return noOfEntrance;
	}


	public void setNoOfEntrance(int noOfEntrance) {
		this.noOfEntrance = noOfEntrance;
	}


	public String getScreens() {
		return Screens;
	}


	public void setScreens(String screens) {
		Screens = screens;

	}

	@Override
	public String toString() {
		return "TheaterDTO [name=" + name + ", location=" + location + ", noOfSeats=" + noOfSeats + ", timings="
				+ timings + ", hasParking=" + hasParking + ", showTimings=" + showTimings + ", noOfFloors=" + noOfFloors
				+ ", noOfStores=" + noOfStores + ", noOfEntrance=" + noOfEntrance + ", Screens=" + Screens + "]";
	}	
}
