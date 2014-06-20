package zad3;

/**
 * Klasa zawiera jednostki temperatury.
 */
public class Temperatura {

	/**
	 * Przelicza stopnie w skali Kelvina na skale Celsjusza.
	 */
	public double przeliczCelsjusze(double iloscKelvinow) {
		return iloscKelvinow - 273.15;
	}

	/**
	 * Przelicza stopnie w skali Kelvina na skale Celsjusza.
	 */
	public double przeliczFahrenheity(double iloscKelvinow) {
		return 32.0 + 9.0 / 5.0 * przeliczCelsjusze(iloscKelvinow);
	}
}
