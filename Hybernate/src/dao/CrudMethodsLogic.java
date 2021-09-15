package dao;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import glavni.HibernateUtil;
import model.Banka;
import model.Card;
import model.Ebanka;
import model.Racun;
import model.User;

public class CrudMethodsLogic {

	// Session factory objekat
	private  SessionFactory  sf = HibernateUtil.getSessionFactory();
	
	
	public Racun vratiRacunPoId(int id) {
		
		Racun racun = null;
		
		Session session = sf.openSession();
			session.beginTransaction();
			
			try {
				racun = session.get(Racun.class, id);
				session.getTransaction();
				
			} catch(Exception e){
				
			}
		
		return racun;
	}
	
	public void upisiUseraUBazu(User user) {
		
		// otvaram sesiju
		Session session = sf.openSession();
		
			// zapocinjem transakciju
			session.beginTransaction();
		
		try {
			session.persist(user);
			// transakcija ok
			session.getTransaction().commit();
		} catch(Exception e) {
			
		}

		
	}
	
	
	public Card vratiKarticuPoId(int id) {
		
		Card card = null;
		
		Session session = sf.openSession();
			session.beginTransaction();
		
		try {
			// ovde preuzimam(Select)
			session.get(Card.class, id); 
				System.out.println("Preuzimam karticu ciji je id: " + id);
			session.getTransaction().commit();
			
		} catch(Exception e) {
			
		}
		
		session.close();
		
		
		return card;
	
	}
	
	public void updatePan(String pan, String id) {
		
		Session session = sf.openSession();
		session.beginTransaction();
		
		try {
			// izvlacim objekat koji zelim da updatujem
			Card card = session.get(Card.class, Integer.parseInt(id));
				//setujem vrednost pan-a
				card.setPan(pan);
				// update
				session.update(card);
			// ------------------------------------------------
			session.getTransaction();
			
		} catch(Exception e) {
			
			session.getTransaction().rollback();
		}
		
		session.close();
		
	}
	
	public void deleteCard(String id) {
		
		Session session = sf.openSession();
			session.beginTransaction();
			try {
				
				Card card = session.get(Card.class, Integer.parseInt(id));
				
				session.delete(card);
				session.getTransaction().commit();
				
				
			} catch(Exception e) {
				
				session.getTransaction().rollback();
			}
		
	}
	
	public User vratiUseraPoId(int id) {
		
		User user = null;
		
		Session session = sf.openSession();
			session.beginTransaction();
			
			try {
				session.get(User.class, id);
				// Eksplicitno sam mu rekao da ucita i listu kontakata
				Hibernate.initialize(user.getKontakti());
				user.getKontakti().size();
					System.out.println("Preuzeo sam usera!");
				session.getTransaction().commit();
				
			} catch(Exception e) {
					System.out.println("Nisam preuzeo usera!");
				session.getTransaction().rollback();
			}
		
	
		return user;
		
	}
	
	public void upisiKarticuUbazu(Card card, Racun racun) {
		
		Session session = sf.openSession();
		session.beginTransaction();
		
		try {
			session.persist(racun);
			session.persist(card);
			session.getTransaction().commit();
		} catch(Exception e) {
			
			session.getTransaction().rollback();
		}
		
	}
	
  public void upisiDebitnuKarticuUbazu(Card card, Racun racun) {
		
		Session session = sf.openSession();
		session.beginTransaction();
		
		try {
			session.persist(racun);
			session.persist(card);
			session.getTransaction().commit();
		} catch(Exception e) {
			
			session.getTransaction().rollback();
		}
	}
  
  
}
