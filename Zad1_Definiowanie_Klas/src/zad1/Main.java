package zad1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Klasa main.
 * 
 * Zadanie 1 (definiowanie klas)
 */
public class Main {
	
	/** Lista plyt w bibliotece */
	private static List<Plyta> listaPlyt = new ArrayList<>();

	/** Wczytuje informacje wpisywane z klawiatury */
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	/**
	 * Metoda main.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int opcja;
		do {
			wyswietlMenu();
			
			opcja = wczytajOpcje();
			
			switch (opcja) {
			case 1: 
				dodajPlyte();
				break;
			case 2:
				wyswietlListePlyt();
				break;
			case 3: 
				wyswietlInformacjeOPlycie();
				break;
			case 4:
				wyswietlWykonawcow();
				break;
			case 5:
				wyswietlInformacjeOUtworze();
				break;
			}
		} while (opcja != 6);
		
		System.out.println("--- KONIEC ---");
	}
	
	/**
	 * Wyswietla menu.
	 */
	private static void wyswietlMenu() {
		System.out.println("--- Biblioteka plyt ---");
		System.out.println();
		System.out.println("\t--- MENU: ---");
		System.out.println("\t1. Dodaj plyte");
		System.out.println("\t2. Wyswietl liste plyt");
		System.out.println("\t3. Wyswietl informacje o plycie");
		System.out.println("\t4. Wyswietl wykonawcow");
		System.out.println("\t5. Wyswietl informacje o utworze");
		System.out.println("\t6. Zakoncz");
		
		System.out.println();
	}
	
	/**
	 * Wczytuje wybrana opcje menu.
	 */
	private static int wczytajOpcje() throws NumberFormatException, IOException {
		System.out.print("Wybierz opcje: ");
		
		int opcja = Integer.parseInt(reader.readLine());
		
		System.out.println();
		
		return opcja;
	}
	
	/**
	 * Tworzy i dodaje plyte do biblioteki.
	 */
	private static void dodajPlyte() throws NumberFormatException, IOException {
		System.out.println("--- Dodaj plyte: ---");
		
		Plyta plyta = utworzPlyte();
		
		listaPlyt.add(plyta);
		
		System.out.println("Dodano plyte.");
		System.out.println();
	}
	
	/**
	 * Wyswietla liste plyt
	 */
	private static void wyswietlListePlyt() {
		System.out.println("Lista plyt:");
		
		for (int i = 0; i < listaPlyt.size(); i++) {
			Plyta plyta = listaPlyt.get(i);
			
			System.out.println("Id: " + plyta.numerPlyty + ", tytul: " + plyta.tytul);
		}
		
		System.out.println();
	}
	
	/**
	 * Wyswietla informacje o plycie.
	 */
	private static void wyswietlInformacjeOPlycie() throws NumberFormatException, IOException {
		Plyta plyta = znajdzPlytePoIdentyfikatorze();
		
		if (plyta != null) {
			System.out.println("Informacje o plycie:");
			System.out.println("Tytul: " + plyta.tytul);
			System.out.println("Czas trwania: " + plyta.czasTrwaniaPlyty);
			
			System.out.println("Lista utworow:");
			for (int i = 0; i < plyta.listaUtworow.size(); i++) {
				Utwor utwor = plyta.listaUtworow.get(i);
				
				System.out.println("- " + utwor.numerUtworu + ". " + utwor.tytul + " (" + utwor.czasTrwania + ")");
			}
		} else {
			System.out.println("Nie znaleziono plyty o podanym identyfikatorze!");
		}
		
		System.out.println();
	}
	
	/**
	 * Wyswietla liste wykonawcow plyty
	 */
	private static void wyswietlWykonawcow() throws NumberFormatException, IOException {
		System.out.println();
		
		Plyta plyta = znajdzPlytePoIdentyfikatorze();
		
		System.out.println("List wykonawcow:");
		for (String wykonawca : plyta.spisWykonawcow) {
			System.out.println("- " + wykonawca);
		}
		
		System.out.println();
	}
	
	/**
	 * Wyswietla informacje o utworze.
	 */
	private static void wyswietlInformacjeOUtworze() throws NumberFormatException, IOException {
		Plyta plyta = znajdzPlytePoIdentyfikatorze();
		
		if (plyta != null) {
			System.out.print("Podaj numer utworu: ");
			int nrUtworu = Integer.parseInt(reader.readLine());
			
			Utwor utwor = plyta.listaUtworow.get(nrUtworu - 1);
			
			System.out.println("Informacja o utworze:");
			if (utwor != null) {
				System.out.println("Tytul: " + utwor.tytul);
				System.out.println("Czas trwania: " + utwor.czasTrwania);
				
				for (String wykonawca : utwor.wykonawcy) {
					System.out.println("Wykonawca: " + wykonawca);
				}
				
				System.out.println("Kompozytor: " + utwor.kompozytor);
			} else {
				System.out.println("Nie znaleziono utworu o podanym numerze");
			}
		} else {
			System.out.println("Nie znaleziono plyty o podanym identyfikatorze");
		}
		
		System.out.println();
	}
	
	/**
	 * Znajduje plyte w bibliotece po identyfikatorze.
	 */
	private static Plyta znajdzPlytePoIdentyfikatorze() throws NumberFormatException, IOException {
		System.out.print("Podaj identyfikator plyty: ");
		int id = Integer.parseInt(reader.readLine());
				
		for (int i = 0; i < listaPlyt.size(); i++) {
			Plyta plyta = listaPlyt.get(i);
			
			if (plyta.numerPlyty == id) {
				return plyta;
			}
		}
		
		return null;
	}

	/**
	 * Tworzy nowa plyte
	 */
	private static Plyta utworzPlyte() throws NumberFormatException, IOException {
		Plyta plyta = new Plyta();
		
		System.out.print("Identyfikator: ");
		plyta.numerPlyty = Integer.parseInt(reader.readLine());
		
		System.out.print("Tytul: ");
		plyta.tytul = reader.readLine();
		
		System.out.print("Podaj liczbe utworow: ");
		int liczbaUtworow = Integer.parseInt(reader.readLine());
		
		for (int i = 1; i <= liczbaUtworow; i++) {
			Utwor utwor = utworzUtwor();
			utwor.numerUtworu = i;
			
			plyta.listaUtworow.add(utwor);
			plyta.czasTrwaniaPlyty += utwor.czasTrwania;
			plyta.spisWykonawcow.addAll(utwor.wykonawcy);
		}
		
		return plyta;
	}
	
	/**
	 * Tworzy nowy utwor.
	 */
	private static Utwor utworzUtwor() throws NumberFormatException, IOException {
		Utwor utwor = new Utwor();
		
		System.out.println("--- Dodaj utwor: ---");
		
		System.out.print("- Tytul: ");
		utwor.tytul = reader.readLine();
		
		System.out.print("- Czas trwania: ");
		utwor.czasTrwania = Float.parseFloat(reader.readLine());
		
		System.out.print("- Liczba wykonawcow utworu: ");
		int liczbaWykonawcow = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < liczbaWykonawcow; i++) {
			System.out.print("- Wykonawca: ");
			utwor.wykonawcy.add(reader.readLine());
		}
		
		System.out.print("- Kompozytor: ");
		utwor.kompozytor = reader.readLine();
		
		return utwor;
	}
}
