package model;

import javax.persistence.Embeddable;

@Embeddable
public class Kontakt {

	
	private String brojFiksnog;
	private String brojMobilnog;
	private String mail;
	
	
	public String getBrojFiksnog() {
		return brojFiksnog;
	}
	public void setBrojFiksnog(String brojFiksnog) {
		this.brojFiksnog = brojFiksnog;
	}
	public String getBrojMobilnog() {
		return brojMobilnog;
	}
	public void setBrojMobilnog(String brojMobilnog) {
		this.brojMobilnog = brojMobilnog;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	
	
	
	
	
}
