package database;

import model.*;

public class RideDAO extends AbstractDAO<Ride> {

	public RideDAO() {
		super();
	}

	public Ride findById(int id) {
		return super.findByAs(id,"idride");
	}

	public int insertRide(Ride ride) {
		return insert(ride);
	}
	
	public int updateRide(Ride ride, int id) {
		RideDAO rideDao = new RideDAO();
		Ride o = rideDao.findById(id);
		if (o == null) {
			System.out.println("Cannot update ride: couldn't be found");
			return -1;
		}
		return update("idride",id,ride);
	}
	
	public int deleteRide(int id) {
		Ride o = this.findById(id);
		if (o == null) {
			System.out.println("Cannot delete ride: couldn't be found");
			return -1;
		} else {
			BikeDAO bd = new BikeDAO();
			UserDAO ud = new UserDAO();
			Ride rr = this.findById(id);
			Bike br = bd.findById(rr.getIdBike());
			if (br!=null) {
				User ur = ud.findById(rr.getIdUser());
				if (ur!=null) {
					
				}
			}
		}
		return delete("idride",id);
	}
}
