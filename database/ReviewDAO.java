package database;

import model.*;

public class ReviewDAO extends AbstractDAO<Review> {

	public ReviewDAO() {
		super();
	}
		
	public Review findById(int id) {
		return super.findByAs(id,"idreview");
	}

	public int insertUser(Review review) {
		return insert(review);
	}
	
	public int updateReview(Review review, int id) {
		Review o = this.findById(id);
		if (o == null) {
			System.out.println("Cannot update review: couldn't be found");
			return -1;
		} else if (o.isTakenIntoAccount()) {
			System.out.println("Cannot update review: already dealt with");
			return -1;
		}
		return update("idreview",id,review);
	}
	
	public int deleteClient(int id) {
		Review o = this.findById(id);
		if (o == null) {
			System.out.println("Cannot update review: couldn't be found");
			return -1;
		} 
		return delete("idreview",id);
	}
}
