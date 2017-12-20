package database;

import model.*;

public class BikeDAO extends AbstractDAO<Bike> {

	public BikeDAO() {
		super();
	}

	public Bike findById(int id) {
		return super.findByAs(id,"idbike");
	}

	public int insertBike(Bike bike) {
		return insert(bike);
	}
	
	public int updateBike(Bike bike, int id) {
		BikeDAO bikeDao = new BikeDAO();
		Bike o = bikeDao.findById(id);
		if (o == null) {
			System.out.println("Cannot update bike: couldn't be found");
			return -1;
		}
		return update("idbike",id,bike);
	}
	
	public int deleteBike(int id) {
		Bike o = this.findById(id);
		if (o == null) {
			System.out.println("Cannot delete bike: couldn't be found");
			return -1;
		}
		return delete("idbike",id);
	}
}
