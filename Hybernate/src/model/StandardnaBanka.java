package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
	
@Entity
public class StandardnaBanka extends Banka{

		
		private String nazivFilialije;

		public String getNazivFilialije() {
			return nazivFilialije;
		}

		public void setNazivFilialije(String nazivFilialije) {
			this.nazivFilialije = nazivFilialije;
	
	
		}
}