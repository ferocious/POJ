package zad3;

/**
 * Klasa przelicza jednostki objetosci.
 */
public class Objetosc {

	private final double metrSzescienny = 1;
	
	private final double litr = metrSzescienny * 0.001;
	
	private final double kwaterka = litr * 0.25;
	
	private final double galonAngielski = litr * 4.5456;
	
	/**
	 * Przelicza metry szescienne na litry.
	 */
	public double przeliczLitr(double iloscMetrowSzesc) {
		return iloscMetrowSzesc / litr;
	}
	
	/**
	 * Przelicza metry szescienne na kwaterki.
	 */
	public double przeliczKwaterke(double iloscMetrowSzesc) {
		return iloscMetrowSzesc / kwaterka;
	}
	
	/**
	 * Przelicza metry szescienne na galony angielskie.
	 */
	public double przeliczGalonyAngielskie(double iloscMetrowSzesc) {
		return iloscMetrowSzesc / galonAngielski;
	}
}
