package zad1;

import java.io.IOException;

/**
 * Klasa Main programu.
 */
public class Main {

	/**
	 * Metoda main.
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		kolo();
		odcinek();
		kwadrat();
		trojkat();
	}
	
	/**
	 * Testuje klase Odcinek.
	 */
	private static void odcinek() {
		System.out.println("====== ODCINEK ====");
		Wspolrzedna a = new Wspolrzedna(1, 2);
		Wspolrzedna b = new Wspolrzedna(10, 21);
		
		Odcinek odcinek = new Odcinek(a, b);
		
		System.out.println("Nazwa: " + odcinek.nazwa());
		System.out.println("Opis: " + odcinek.opis());
		System.out.println("Dlugosc: " + odcinek.dlugosc());
		
		System.out.println();
	}
	
	/**
	 * Testuje klase kolo.
	 */
	private static void kolo() throws IOException {
		System.out.println("====== KOLO =======");
		double promien = 5;
		
		Kolo kolo = new Kolo(promien);
		
		System.out.println("Nazwa: " + kolo.nazwa());
		System.out.println("Opis: " + kolo.opis());
		System.out.println("Pole powierzchni: " + kolo.pole());
		System.out.println("Dlugosc okregu: " + kolo.dlugoscOkregu());
		
		System.out.println();
	}
	
	/**
	 * Testuje klase kwadrat.
	 */
	private static void kwadrat() {
		Wspolrzedna[] wspolrzedneWierzcholkow = new Wspolrzedna[4];
		wspolrzedneWierzcholkow[0] = new Wspolrzedna(0, 0);
		wspolrzedneWierzcholkow[1] = new Wspolrzedna(5, 0);
		wspolrzedneWierzcholkow[2] = new Wspolrzedna(5, 5);
		wspolrzedneWierzcholkow[3] = new Wspolrzedna(0, 5);
		
		Kwadrat kwadrat = new Kwadrat(wspolrzedneWierzcholkow);
		
		System.out.println("====== KWADRAT ====");
		System.out.println("Nazwa: " + kwadrat.nazwa());
		System.out.println("Opis: " + kwadrat.opis());
		System.out.println("Liczba bokow: " + kwadrat.liczbaBokow());
		System.out.println("Obwod: " + kwadrat.obwod());
		System.out.println("Pole powierzchni: " + kwadrat.pole());
		
		System.out.println();
	}
	
	/**
	 * Testuje klase Trojkat.
	 */
	private static void trojkat() {
		Wspolrzedna[] wspolrzedneWierzcholkow = new Wspolrzedna[3];
		wspolrzedneWierzcholkow[0] = new Wspolrzedna(0, 0);
		wspolrzedneWierzcholkow[1] = new Wspolrzedna(5, 0);
		wspolrzedneWierzcholkow[2] = new Wspolrzedna(5, 5);
		
		Trojkat trojkat = new Trojkat(wspolrzedneWierzcholkow);
		
		System.out.println("====== Trojkat ====");
		System.out.println("Nazwa: " + trojkat.nazwa());
		System.out.println("Opis: " + trojkat.opis());
		System.out.println("Liczba bokow: " + trojkat.liczbaBokow());
		System.out.println("Obwod: " + trojkat.obwod());
		System.out.println("Pole powierzchni: " + trojkat.pole());
	}

}
