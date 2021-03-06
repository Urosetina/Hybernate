package model;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Card {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCard;
	private String pan;
	private String cardType;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	private Racun racun;
	
	
	
	public int getIdCard() {
		return idCard;
	}
	public void setIdCard(int idCard) {
		this.idCard = idCard;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public void setRacun(Racun racun2) {
		
		
	}
	
	
	
	
	
	
	
}
