package zad1;

/**
 * Klasa opisujaca wsporzedna na ukladzie wsporzednych.
 */
public class Wspolrzedna {

	/** Wspolrzedna x */
	private int x;
	
	/** Wspolrzedna y */
	private int y;

	/**
	 * Konstruktor klasy Wspolrzedna. Argumentami sa wsporzedne x i y. 
	 */
	public Wspolrzedna(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	/**
	 * Zwraca wartosc x.
	 */
	public int getX() {
		return x;
	}

	/**
	 * Zwraca wartosc y.
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Zwraca opis wspolrzednej.
	 */
	public String opis() {
		return "[" + x + ";" + y + "]";
	}
}
