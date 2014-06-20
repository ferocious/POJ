package zad2;

/**
 * Klasa Wykladowca, ktora rozszerza klase Osoba.
 */
public class Wykladowca extends Osoba {
	
	private String stopienNaukowy;

	/**
	 * Konstruktor klasy Wykladowca.
	 */
	public Wykladowca(String imie, String nazwisko, int rokUrodzenia,
			String plec, String stopienNaukowy) {
		super(imie, nazwisko, rokUrodzenia, plec);
		
		this.stopienNaukowy = stopienNaukowy;
	}

	public String getStopienNaukowy() {
		return stopienNaukowy;
	}

	public void setStopienNaukowy(String stopienNaukowy) {
		this.stopienNaukowy = stopienNaukowy;
	}

	@Override
	public String opis() {
		String opis = super.opis();
		
		opis += ", stopienNaukowy=" + stopienNaukowy;
		
		return opis;
	}

	
}
