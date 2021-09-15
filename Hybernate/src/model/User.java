package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "user_table")
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUser;
	@Column(name = "user_name")
	private String userName;
	@Embedded
	private Adresa adresa;
	@Enumerated
	private UserType userType;
	@ElementCollection(fetch = FetchType.EAGER)
	private List<Kontakt> kontakt;
	
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Adresa getAdresa() {
		return adresa;
	}
	public void setAdresa(Adresa adresa) {
		this.adresa = adresa;
	}
	public List<Kontakt> getKontakt() {
		return kontakt;
	}
	public void setKontakt(List<Kontakt> ruziniKontakti) {
		this.kontakt = ruziniKontakti;
	}
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	
	@ElementCollection
	private List<Kontakt> kontakti = new ArrayList<>();

	public List<Kontakt> getKontakti() {
		return kontakti;
	}
	public void setKontakti(List<Kontakt> kontakti) {
		this.kontakti = kontakti;
	}
	
	@OneToMany(cascade = CascadeType.PERSIST) 
	private List<Card> kartice = new ArrayList();
	
	
	
	
}
