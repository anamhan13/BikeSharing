package model;

import java.time.LocalDateTime;

public class Review {

	private LocalDateTime creationDate;
	private String text;
	private int idReview;
	private int idBike;
	private boolean takenIntoAccount;
	private static int noReviews;
	
	
	public Review(LocalDateTime creationDate, String text,int idBike) {
		noReviews++;
		this.creationDate = creationDate;
		this.text = text;
		this.idBike = idBike;
		this.takenIntoAccount = false;
		this.idReview = noReviews;
	}

	public Review(int idBike) {
		noReviews++;
		this.creationDate = LocalDateTime.now();
		this.takenIntoAccount = false;
		this.idReview = noReviews;
		this.idBike = idBike;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getIdReview() {
		return idReview;
	}

	public static int getNoReviews() {
		return noReviews;
	}

	public static void setNoReviews(int noReviews) {
		Review.noReviews = noReviews;
	}

	public boolean isTakenIntoAccount() {
		return takenIntoAccount;
	}

	public void setTakenIntoAccount(boolean takenIntoAccount) {
		this.takenIntoAccount = takenIntoAccount;
	}

	public int getIdBike() {
		return idBike;
	}
	
}
