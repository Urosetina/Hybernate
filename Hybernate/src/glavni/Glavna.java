package glavni;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.Card;


public class Glavna {


public static void main (String[] args) {
	
	Card card1 = new Card();
	card1.setPan("7823 1234 9876 1234");
	card1.setCardType("Visa");
	
	// Session factory objekat
	SessionFactory  sf = HibernateUtil.getSessionFactory();
	
	// otvaram sesiju
	Session session = sf.openSession();
	
		// zapocinjem transakciju
		session.beginTransaction();
	
	try {
		session.save(card1);
		// transakcija ok
		session.getTransaction().commit();
	} catch(Exception e) {
		
	}
	
	
	
	
	
}

	}

