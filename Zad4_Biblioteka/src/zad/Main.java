package zad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Klasa Main programu.
 * 
 * autor: Dorota Gmerek
 */
public class Main {
	
	/** Wczytuje tekst z klawiatury. */
	private static BufferedReader reader;
	
	/** Biblioteka */
	private static Biblioteka biblioteka = new Biblioteka();
	
	/**
	 * Metoda main.
	 */
	public static void main(String[] args) throws IOException {
		reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("1. Dodaj ksiazke");
		System.out.println("2. Wyswietl ksiazki");
		System.out.println("3. Dodaj czasopismo");
		System.out.println("4. Wyswietl czasopisma");
		System.out.println("5. Wyjdz");
		
		int opcja;
		
		do {
			System.out.print("Wybierz opcje: ");
			opcja = Integer.parseInt(reader.readLine());
			
			switch (opcja) {
			case 1: dodajKsiazke(); break;
			case 2: wyswietlKsiazki(); break;
			case 3: dodajCzasopismo(); break;
			case 4: wyswietlCzasopisma(); break;
			}
		} while (opcja != 5);
		
		System.out.println("Koniec");
	}
	
	/**
	 * Dodaje ksiazke do biblioteki.
	 */
	private static void dodajKsiazke() throws IOException {
		System.out.print("Autor: ");
		String autor = reader.readLine();
		
		System.out.print("Tytul: ");
		String tytul = reader.readLine();
		
		System.out.print("Rok wydania: ");
		int rokWydania = Integer.parseInt(reader.readLine());
		
		System.out.print("ISBN: ");
		String isbn = reader.readLine();
		
		Ksiazka ksiazka = new Ksiazka(autor, tytul, rokWydania, isbn);
		
		biblioteka.zapisz(ksiazka, TypMaterialu.KSIAZKA);
	}
	
	/**
	 * Wyswietla liste ksiazek.
	 */
	private static void wyswietlKsiazki() {
		System.out.println("Ksiazki:");
		biblioteka.wyswietlListe(TypMaterialu.KSIAZKA);
	}
	
	/**
	 * Dodaje nowe czasopismo do biblioteki.
	 */
	private static void dodajCzasopismo() throws IOException {
		System.out.print("Tytul: ");
		String tytul = reader.readLine();
		
		System.out.print("Numer: ");
		int numer = Integer.parseInt(reader.readLine());
		
		System.out.print("Rok wydania: ");
		int rokWydania = Integer.parseInt(reader.readLine());
		
		System.out.print("Typ: ");
		String typ = reader.readLine();
		
		Czasopismo czasopismo = new Czasopismo(tytul, numer, rokWydania, typ);
		
		biblioteka.zapisz(czasopismo, TypMaterialu.CZASOPISMO);
	}
	
	/**
	 * Wyswietla liste czasopism.
	 */
	private static void wyswietlCzasopisma() {
		System.out.println("Czasopisma:");
		biblioteka.wyswietlListe(TypMaterialu.CZASOPISMO);
	}
}
