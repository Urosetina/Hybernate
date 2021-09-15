package glavni;

import java.util.ArrayList;
import java.util.List;

import dao.CrudMethodsLogic;
import dao.HqlMethods;
import model.Adresa;
import model.Card;
import model.DebitCard;
import model.Kontakt;
import model.PremiumRacun;
import model.Racun;
import model.User;
import model.UserType;

public class Glavna {


public static void main (String[] args) {
	
	CrudMethodsLogic logic = new CrudMethodsLogic();
	
	HqlMethods hqlMetode = new HqlMethods();
		
		List<Racun> racuni = new ArrayList();
	
		racuni = hqlMetode.sviRacuni();
	
		for(Racun r : racuni) {
			
			System.out.println("id: " + r.getIdRacun());
			System.out.println("Stanje: " + r.getStanje());
			System.out.println("Banka: " + r.getBanka());
			System.out.println("Broj racuna" + r.getBrojRacuna());
		}
	
	
	List<Card> kartice = new ArrayList<>();
		kartice = hqlMetode.sveKartice();
	
	
	
	
	
	
	
	
	/*
	 
	 
	Racun racun = new Racun();
	racun.setBrojRacuna("123");
	racun.setBanka("BANCA INTESA");

	
	
	Card card = new Card();
	card.setPan(null);
	card.setCardType("67676767");
    card.setRacun(racun);
	
	logic.upisiKarticuUbazu(card, racun);
	
	DebitCard debitCard = new DebitCard();
		debitCard.setPan("635645");
		debitCard.setCardType("MasterCard");
		debitCard.setValuta("RSD");
		
	PremiumRacun premium = new PremiumRacun();
		premium.setBanka("Najbolja Bankka");
		premium.setBrojRacuna("51356");
		premium.setBanka("Intesa");
		premium.setExstraPopust(30);
			
	
	
	
	
	
	/*
	Kontakt k1 = new Kontakt();
		k1.setBrojMobilnog("964 111 222");
		k1.setMail("ruza1@gmail.com");
		
	Kontakt k2 = new Kontakt();
		k2.setBrojMobilnog("063 555 666");
		k2.setMail("ruza2@gmail.com");
		
	Kontakt k3 = new Kontakt();
		k3.setBrojMobilnog("061 999 888");
		k3.setMail("ruza3@gmail.com");
		
		
	List<Kontakt> RuziniKontakti = new ArrayList<>();
		RuziniKontakti.add(k1);
		RuziniKontakti.add(k2);
		RuziniKontakti.add(k3);
		
		
	
	
	
	
	Adresa adresa = new Adresa();
		adresa.setDrzava("Srbija");
		adresa.setGrad("Bajina Basta");
		adresa.setUlica("Marsala Tita");
		
		UserType userType = UserType.STANDARD_USER;
		
	User user = new User();
		user.setUserName("Pera");
		user.setAdresa(adresa);
		user.setUserType(userType);
		user.setKontakt(RuziniKontakti);
		
		
		
	Kontakt kontakt = new Kontakt();
		kontakt.setBrojFiksnog("182 3356");
		kontakt.setBrojMobilnog("38164203256");
		kontakt.setMail("asd@gmail.com");
		
		User user = logic.vratiUseraPoId(3);
			String imeUsera = user.getUserName();
				System.out.println("Ime: " + imeUsera);
				
		String drzava = user.getAdresa().getDrzava();
			System.out.println("Drzava: " + drzava);
			
			UserType tipUsera = user.getUserType();
				System.out.println("Tip usera je: " + tipUsera);
				
			List<Kontakt> listaKontakata = user.getKontakt();
			
				for(Kontakt k : listaKontakata) {
					
					System.out.println("Mob: :" + kontakt.getBrojMobilnog());
					System.out.println("Email: " + kontakt.getMail());
;					
				}
		
		
	
		
	
	/*
	Card card = new Card();
	card.setPan("7823 1234 9876 1234");
	card.setCardType("Visa");
	*/
	/*
	Card card = logic.vratiKarticuPoId(1);
		System.out.println("Pan: " + card.getPan());
		System.out.println("Tip kartice: " + card.getCardType());
	
	if(card != null) {
		System.out.println("Pan: " + card.getPan());
		System.out.println("Tip kartice: " + card.getCardType());
		
	} else {
		System.out.println("Nepostojeci id");}
	
*/
	
	
	
}



	}

