package zad1;

/**
 * Klasa opisujaca odcinek.
 */
public class Odcinek implements Figura {
	
	/** Wspolrzedna a */
	private Wspolrzedna a;
	
	/** Wspolrzedna b */
	private Wspolrzedna b;

	/**
	 * Konstruktor klasy Odcinek. Argumentami sa wspolrzedne krancow odcinka: a i b.
	 */
	public Odcinek(Wspolrzedna a, Wspolrzedna b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public String nazwa() {
		return "odcinek";
	}

	@Override
	public String opis() {
		return "Ocinek o wspolrzednych a: " + a.opis() + " b: " + b.opis();
	}

	/**
	 * Oblicza dlugosc odcinka.
	 */
	public double dlugosc() {
		double czesc1 = Math.pow(b.getX() - a.getX(), 2);
		double czesc2 = Math.pow(b.getY() - a.getY(), 2);
		
		return Math.abs(Math.sqrt(czesc1 + czesc2));
	}
}
