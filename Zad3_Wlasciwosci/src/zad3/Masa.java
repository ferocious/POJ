package zad3;

/**
 * Klasa zawiera jednostki masy.
 */
public class Masa {

	private final double kilogram = 1.0;
	
	private final double gram = kilogram * 0.001;
	
	private final double tona = kilogram * 1000;
	
	private final double kwintal = kilogram * 100;
	
	private final double funtBrytyjski = kilogram * 0.453592;
	
	private final double uncja = gram * 28.35;
	
	/**
	 * Przelicza kilogramy na gramy.
	 */
	public double przeliczGram(double iloscKilogramow) {
		return iloscKilogramow / gram;
	}

	/**
	 * Przelicza kilogramy na tony.
	 */
	public double przeliczTone(double iloscKilogramow) {
		return iloscKilogramow / tona;
	}

	/**
	 * Przelicza kilogramy na kwintale.
	 */
	public double przeliczaKwintal(double iloscKilogramow) {
		return iloscKilogramow / kwintal;
	}

	/**
	 * Przelicza kilogramy na funty brytyjskie.
	 */
	public double przeliczFuntBrytyjski(double iloscKilogramow) {
		return iloscKilogramow / funtBrytyjski;
	}

	/**
	 * Przelicza kilogramy na uncje.
	 */
	public double przeliczUncje(double iloscKilogramow) {
		return iloscKilogramow / uncja;
	}
	
}
