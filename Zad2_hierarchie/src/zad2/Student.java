package zad2;

/**
 * Klasa Student, ktora rozszerza klase Osoba.
 */
public class Student extends Osoba {

	private String numerIndeksu;
	
	public Student(String imie, String nazwisko, int rokUrodzenia, String plec, String numerIndeksu) {
		super(imie, nazwisko, rokUrodzenia, plec);
		
		this.numerIndeksu = numerIndeksu;
	}

	public String getNumerIndeksu() {
		return numerIndeksu;
	}

	public void setNumerIndeksu(String numerIndeksu) {
		this.numerIndeksu = numerIndeksu;
	}

	public String opis() {
		String opisOsoba = super.opis();
		
		opisOsoba += ", numerIndeksu: " + numerIndeksu;
		
		return opisOsoba;
	}
	
	
	
}
