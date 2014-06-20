package zad2;

/**
 * Klasa Osoba.
 */
public class Osoba {

	private String imie;
	
	private String nazwisko;
	
	private int rokUrodzenia;
	
	private String plec;
	
	/**
	 * Konstruktor.
	 */
	public Osoba(String imie, String nazwisko, int rokUrodzenia, String plec) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.rokUrodzenia = rokUrodzenia;
		this.plec = plec;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public int getRokUrodzenia() {
		return rokUrodzenia;
	}

	public void setRokUrodzenia(int rokUrodzenia) {
		this.rokUrodzenia = rokUrodzenia;
	}

	public String getPlec() {
		return plec;
	}

	public void setPlec(String plec) {
		this.plec = plec;
	}

	/**
	 * Zwraca opis wlasciwosci klasy.
	 */
	public String opis() {
		return "imie=" + imie + ", nazwisko=" + nazwisko
				+ ", rokUrodzenia=" + rokUrodzenia + ", plec=" + plec;
	}
}
