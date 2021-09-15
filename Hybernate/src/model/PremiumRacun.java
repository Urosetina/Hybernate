package model;

import javax.persistence.Entity;

@Entity
public class PremiumRacun extends Racun {

	
	private double exstraPopust;

	public double getExstraPopust() {
		return exstraPopust;
	}

	public void setExstraPopust(double exstraPopust) {
		this.exstraPopust = exstraPopust;
	}
	
	
	
	
	
	
}
