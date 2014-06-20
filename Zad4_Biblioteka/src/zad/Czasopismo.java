package zad;

/**
 * Klasa reprezentujaca czasopismo.
 */
public class Czasopismo implements MaterialBiblioteczny {

	/** Wersja */
	private static final long serialVersionUID = 1L;

	private String tytul;

	private int numer;

	private int rokWydania;

	private String typ;

	/**
	 * Konstruktor tworzy obiekt czasopisma.
	 */
	public Czasopismo(String tytul, int numer, int rokWydania, String typ) {
		super();
		this.tytul = tytul;
		this.numer = numer;
		this.rokWydania = rokWydania;
		this.typ = typ;
	}

	@Override
	public String opis() {
		return "Tytul: " + tytul + ", numer: " + numer + ", rokWydania: "
				+ rokWydania + ", typ: " + typ;
	}

	public String getTytul() {
		return tytul;
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

	public int getNumer() {
		return numer;
	}

	public void setNumer(int numer) {
		this.numer = numer;
	}

	public int getRokWydania() {
		return rokWydania;
	}

	public void setRokWydania(int rokWydania) {
		this.rokWydania = rokWydania;
	}

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

}
