package zad;

/**
 * Typ wyliczeniowy zawiera typy materialow bibliotecznych.
 */
public enum TypMaterialu {

	KSIAZKA("ksiazki"),
	CZASOPISMO("czasopismo");

	/** Nazwa pliku, do ktorego beda zapisywane materialy. */
	private final String nazwaPliku;

	TypMaterialu(String nazwaPliku) {
		this.nazwaPliku = nazwaPliku;
	}

	public String getNazwaPliku() {
		return nazwaPliku;
	}
}
