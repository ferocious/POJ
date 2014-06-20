package zad3;

/**
 * Klasa zawiera miary dlugosci.
 */
public class Dlugosc {

	private final double metr = 1.0;
	
	private final double milimetr = metr * 0.001;
	
	private final double cal = milimetr * 25.4;
	
	private final double yard = metr * 0.9144;
	
	private final double milaMorska = metr * 1852;
	
	private final double milaAngielska = metr * 1609.344;
	
	/**
	 * Przelicza metry na milimetry.
	 */
	public double przeliczMilimetr(double iloscMetrow) {
		return iloscMetrow / milimetr;
	}
	
	/**
	 * Przelicza metry na cale.
	 */
	public double przeliczCal(double iloscMetrow) {
		return iloscMetrow / cal;
	}
	
	/**
	 * Przelicza metry na jardy.
	 */
	public double przeliczYard(double iloscMetrow) {
		return iloscMetrow / yard;
	}

	/**
	 * Przelica metry na mile morskie.
	 */
	public double przeliczMilaMorska(double iloscMetrow) {
		return iloscMetrow / milaMorska;
	}

	/**
	 * Przelicza metry na mile angielskie. 
	 */
	public double przeliczMilaAngielska(double iloscMetrow) {
		return iloscMetrow / milaAngielska;
	}
}
