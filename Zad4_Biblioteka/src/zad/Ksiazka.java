package zad;

/**
 * Klasa reprezentujaca ksiazke.
 */
public class Ksiazka implements MaterialBiblioteczny {

	/** Domyslny numer wersji klasy. */
	private static final long serialVersionUID = 1L;

	private String autor;

	private String tytul;

	private int rokWydania;

	private String isbn;

	/**
	 * Konstruktor tworzacy klase ksiazki.
	 */
	public Ksiazka(String autor, String tytul, int rokWydania, String isbn) {
		super();
		this.autor = autor;
		this.tytul = tytul;
		this.rokWydania = rokWydania;
		this.isbn = isbn;
	}

	@Override
	public String opis() {
		return "Autor: " + autor + ", tytul: " + tytul + ", rok wydania: "
				+ rokWydania + ", isbn: " + isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTytul() {
		return tytul;
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

	public int getRokWydania() {
		return rokWydania;
	}

	public void setRokWydania(int rokWydania) {
		this.rokWydania = rokWydania;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}
