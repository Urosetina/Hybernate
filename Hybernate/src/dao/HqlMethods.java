package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.Card;
import model.Racun;

import glavni.HibernateUtil;

public class HqlMethods {

	private SessionFactory sf = HibernateUtil.createSessionFactory();
	
	
	public List<Racun> sviRacuni(){
		
		List<Racun> listaRacuna = new ArrayList<>();
		
		Session session = sf.openSession();
			session.beginTransaction();
			
			try {
				
				// hql upit
				String hql = "from Racun";
				// ovde saljemo upit ka bazi
					Query query = session.createQuery(hql);
				// ovde prihvatam objekte iz baze
					listaRacuna = (List<Racun>)query.getResultList();
					
					
					session.getTransaction().commit();
				
			} catch(Exception e) {
				listaRacuna = null;
				session.getTransaction().rollback();
			}
		 
		
		
		
		session.close();
		
		return listaRacuna;
		
	}
	
	public List<Card> sveKartice(){
		List<Card> listaKartica = new ArrayList<>();
		
		Session session = sf.openSession();
			session.beginTransaction();
			
			try {
				
				String hql = "from Card";
				
				Query query = session.createQuery(hql);
					listaKartica = (List<Card>)query.getResultList();
				
				
			} catch(Exception e) {
				
				listaKartica = null;
				session.getTransaction().rollback();
			}
		
	
		
		return listaKartica;
		
	}
	
	
	
}
