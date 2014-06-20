package zad;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementacja biblioteki.
 */
public class Biblioteka {

	/**
	 * Metoda wyswietla ponumerowana liste materialow w bibliotece w zaleznosci
	 * od typu (ksiazka, czasopismo, itd).
	 */
	public void wyswietlListe(TypMaterialu typMaterialu) {
		List<? extends MaterialBiblioteczny> listaMaterialow = wczytaj(typMaterialu);

		for (int i = 0; i < listaMaterialow.size(); i++) {
			System.out.println(i + ". " + listaMaterialow.get(i).opis());
		}
	}

	/**
	 * Metoda dopisuje material biblioteczny do pliku w zaleznosci od typu materialu. Kazdy
	 * rodzaj materialow zapisywany jest w osobnym pliku.
	 */
	public void zapisz(MaterialBiblioteczny material, TypMaterialu typMaterialu) {
		/** Otwiera plik */
		File plik = new File(typMaterialu.getNazwaPliku());

		/** Strumien zapisu do pliku */
		FileOutputStream fileOut = null;

		/** Wyjsciowy strumien obiektow */
		ObjectOutputStream objectOut = null;

		try {
			fileOut = new FileOutputStream(plik, true);
			objectOut = new ObjectOutputStream(fileOut);

			/** Zapisuje obiekt do pliku: */
			objectOut.writeObject(material);
			objectOut.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			/** Zamykanie strumieni wyjsciowych: */

			if (fileOut != null) {
				try {
					fileOut.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (objectOut != null) {
				try {
					objectOut.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * Wczytuje liste obiektow z pliku w zaleznosci od typu materialu. Typ
	 * materialu wskazuje, z ktorego pliku zostana wczytane obiekty.
	 */
	public List<? extends MaterialBiblioteczny> wczytaj(
			TypMaterialu typMaterialu) {
		
		/** Otwiera plik: */
		File plik = new File(typMaterialu.getNazwaPliku());
		
		/** Strumienie wejsciowe: */
		FileInputStream fileIn = null;
		ObjectInputStream objectIn = null;
		
		/** Lista materialow, do niej zostana dodane wczytane materialy: */
		List<MaterialBiblioteczny> listaMaterialow = new ArrayList<>();

		try {
			fileIn = new FileInputStream(plik);

			Object wczytanyObjekt;

			/** Petla wczytuje kolejne obiekty z pliku i dodaje je do listy: */
			do {
				objectIn = new ObjectInputStream(fileIn);
				wczytanyObjekt = objectIn.readObject();

				listaMaterialow.add((MaterialBiblioteczny) wczytanyObjekt);
			} while (objectIn != null);
		} catch (EOFException e) {
			// Koniec pliku.
		} catch (FileNotFoundException e) {
			/** Plik nie zostal jeszcze utworzony */
			System.out.println("Brak danych");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			/** Zamykamy strumienie wejsciowe: */
			
			if (fileIn != null) {
				try {
					fileIn.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (objectIn != null) {
				try {
					objectIn.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return listaMaterialow;
	}
}
