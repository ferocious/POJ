package zad1;

public interface Wielokat extends Figura {

	/**
	 * Zwraca wspolrzedne wierzcholkow wielokata.
	 */
	Wspolrzedna[] wspolrzedneWierzcholkow();
	
	/**
	 * Zwraca liczbe bokow.
	 */
	int liczbaBokow();
	
	/**
	 * Zwraca dlugosci bokow.
	 */
	double[] dlugoscBokow();
	
	/**
	 * Zwraca obwod wielokata.
	 */
	double obwod();
	
	/**
	 * Zwraca pole wielokata.
	 */
	double pole();
}
