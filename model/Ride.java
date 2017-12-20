package model;

public class Ride {

	private static int noRides;
	private int idRide;
	private int idBike;
	private int idUser;
	private Location<Bike> location;
	
	public Ride(int idBike, int idUser, Location<Bike> location) {
		noRides++;
		this.idRide = noRides;
		this.idBike = idBike;
		this.idUser = idUser;
		this.location = location;
	}
	
	public Ride() {
		noRides++;
		this.idRide = noRides;
	}

	public static int getNoRides() {
		return noRides;
	}

	public static void setNoRides(int noRides) {
		Ride.noRides = noRides;
	}

	public int getIdRide() {
		return idRide;
	}

	public int getIdBike() {
		return idBike;
	}

	public int getIdUser() {
		return idUser;
	}

	public Location<Bike> getLocation() {
		return location;
	}

	public void setLocation(Location<Bike> location) {
		this.location = location;
	}
	
	
}
