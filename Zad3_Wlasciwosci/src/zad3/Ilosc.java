package zad3;

/**
 * Klasa zawiera jednoski ilosci.
 */
public class Ilosc {

	private final double kopa = 60;
	
	private final double tuzin = 12;
	
	private final double mendel = 15;

	/**
	 * Przelicza ilosc na kopy.
	 */
	public double przeliczKopa(double ilosc) {
		return ilosc / kopa;
	}

	/**
	 * Przelicza ilosc na tuziny.
	 */
	public double przeliczTuzin(double ilosc) {
		return ilosc / tuzin;
	}

	/**
	 * Przelicza ilosci na mendele.
	 */
	public double przeliczMendel(double ilosc) {
		return ilosc / mendel;
	}
}
