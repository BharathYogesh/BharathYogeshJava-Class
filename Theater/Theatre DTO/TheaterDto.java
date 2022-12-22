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
	private int lifts;
	private String colour;
	private String Speakers;
	private String seatingPositions;
	private int guards;
	private String screen;
	
	
	
	public TheaterDto() {
	System.out.println("I am default constructor");
	}



	public TheaterDto(String name, String location, int noOfSeats, String timings, boolean hasParking,
			String showTimings, int noOfFloors, int noOfStores, int noOfEntrance, int lifts, String colour,
			String speakers, String seatingPositions, int guards,String screen) {
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
		this.lifts = lifts;
		this.colour = colour;
		Speakers = speakers;
		this.seatingPositions = seatingPositions;
		this.guards = guards;
		this.screen= screen;
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



	public int getLifts() {
		return lifts;
	}



	public void setLifts(int lifts) {
		this.lifts = lifts;
	}



	public String getColour() {
		return colour;
	}



	public void setColour(String colour) {
		this.colour = colour;
	}



	public String getSpeakers() {
		return Speakers;
	}



	public void setSpeakers(String speakers) {
		Speakers = speakers;
	}



	public String getSeatingPositions() {
		return seatingPositions;
	}



	public void setSeatingPositions(String seatingPositions) {
		this.seatingPositions = seatingPositions;
	}



	public int getGuards() {
		return guards;
	}



	public void setGuards(int guards) {
		this.guards = guards;
	}



	public TheaterDto(String screen) {
		super();
		this.screen = screen;
	}



	
	




	public String getScreen() {
		return screen;
	}



	public void setScreen(String screen) {
		this.screen = screen;
	}



	@Override
	public String toString() {
		return "TheaterDto [name=" + name + ", location=" + location + ", noOfSeats=" + noOfSeats + ", timings="
				+ timings + ", hasParking=" + hasParking + ", showTimings=" + showTimings + ", noOfFloors=" + noOfFloors
				+ ", noOfStores=" + noOfStores + ", noOfEntrance=" + noOfEntrance + ", lifts=" + lifts + ", colour="
				+ colour + ", Speakers=" + Speakers + ", seatingPositions=" + seatingPositions + ", guards=" + guards
				+ ", screen=" + screen + "]";
	}



	
	
	}



	