package zad;

import java.io.Serializable;

/**
 * Glowny interfejs dla materialow bibliotecznych. Rozszerza interfejs
 * Serializable zeby umozliwic zapisywanie obiektu w pliku.
 */
public interface MaterialBiblioteczny extends Serializable {

	/**
	 * Zwraca opis materialu bibliotecznego.
	 */
	String opis();
}
