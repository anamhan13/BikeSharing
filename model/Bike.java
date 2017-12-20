package model;

import java.util.ArrayList;
import java.util.List;

public class Bike {
	
	private String code;
	private static int noBikes;
	private int idBike;
	private boolean availability;
	private Location<Bike> location; 
	private List<User> users = new ArrayList<User>();
	private List<Review> reviews = new ArrayList<Review>();
	
	public Bike() {
		noBikes++;
		this.idBike = noBikes;
		RandomCodeGenerator rcg = new RandomCodeGenerator();
		code = rcg.generateCode();
		availability = true;
		Location<Bike> l = new Location<Bike>();
		location = l.getCurrentLocation(this);
	}
	
	public static int getNoBikes() {
		return noBikes;
	}

	public static void setNoBikes(int noBikes) {
		Bike.noBikes = noBikes;
	}

	public int getIdBike() {
		return idBike;
	}

	public String getCode() {
		return code;
	}
	
	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public Location<Bike> getLocation() {
		return location;
	}

	public void setLocation(Location<Bike> location) {
		this.location = location;
	}

	public void addUser(User user) {
		if (user != null) {
			users.add(user);
		}
	}
	
	public void addReview(Review review) {
		if (review != null) {
			reviews.add(review);
		}
	}
	
	
}
