package zad2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Glowna klasa programu.
 * 
 * autor: Dorota Gmerek
 */
public class Main {

	/** Wczytuje dane z klawiatury. */
	private static BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * Klasa main.
	 */
	public static void main(String[] args) throws IOException {
		String zawartoscPliku = wczytajPlik();
		
		wystapieniaOkreslonegoZnaku(zawartoscPliku);
		wystapieniaFrazy(zawartoscPliku);
		wystapieniaSamoglosek(zawartoscPliku);
		wystapieniaSpolglosek(zawartoscPliku);
		wystapieniaCyfr(zawartoscPliku);
		wystapieniaZnakowAlfanum(zawartoscPliku);
		wystapieniaZnakowNieAlfanum(zawartoscPliku);
		wystapieniaZnakowBialych(zawartoscPliku);
		wystapieniaMalychLiter(zawartoscPliku);
		wystapieniaWielkichLiter(zawartoscPliku);
	}
	
	private static void wystapieniaOkreslonegoZnaku(String zawartoscPliku) throws IOException {
		System.out.print("Podaj znak: ");
		char znak = consoleReader.readLine().charAt(0);
		
		int iloscZnakow;
		
		iloscZnakow = BibliotekaZnakow.obliczIloscZnakow(zawartoscPliku, znak);
		System.out.println("Podany znak wystapil w pliku: " + iloscZnakow + " razy.");
		
		iloscZnakow = BibliotekaZnakow.obliczIloscZnakowIgnorujacWielksc(zawartoscPliku, znak);
		System.out.println("Podany znak wystapil w pliku (ignorujac wielkosc liter): " + iloscZnakow + " razy.");
	}
	
	private static void wystapieniaFrazy(String zawartoscPliku) throws IOException {
		System.out.print("Podaj ciag znakow: ");
		String fraza = consoleReader.readLine();
		
		int ilscWystapien;
		
		ilscWystapien = BibliotekaZnakow.obliczIloscCiagow(zawartoscPliku, fraza);
		System.out.println("Podany ciag znakow wystapil w pliku: " + ilscWystapien + " razy");
		
		ilscWystapien = BibliotekaZnakow.obliczIloscCiagowIgnorujWielkosc(zawartoscPliku, fraza);
		System.out.println("Podany ciag znakow wystapil w pliku (ignorujac wielkosc liter): " + ilscWystapien + " razy");
	}
	
	private static void wystapieniaSamoglosek(String zawartoscPliku) {
		int iloscSamoglosek = BibliotekaZnakow.obliczIloscSamoglosek(zawartoscPliku);
		
		System.out.println("Ilosc samoglosek: " + iloscSamoglosek);
	}
	
	private static void wystapieniaSpolglosek(String zawartoscPliku) {
		int iloscSpolglosek = BibliotekaZnakow.obliczIloscSpolglosek(zawartoscPliku);
		
		System.out.println("Ilosc spolglosek: " + iloscSpolglosek);
	}
	
	private static void wystapieniaCyfr(String zawartoscPliku) {
		int iloscCyfr = BibliotekaZnakow.obliczIloscCyfr(zawartoscPliku);
		
		System.out.println("Ilosc cyfr: " + iloscCyfr);
	}
	
	private static void wystapieniaZnakowAlfanum(String zawartoscPliku) {
		int ilosc = BibliotekaZnakow.obliczIloscZnakowAlfanum(zawartoscPliku);
		
		System.out.println("Ilosc znakow alfanumerycznych: " + ilosc);
	}
	
	private static void wystapieniaZnakowNieAlfanum(String zawartoscPliku) {
		int ilosc = BibliotekaZnakow.obliczIloscZnakowNieAlfanum(zawartoscPliku);
		
		System.out.println("Ilosc znakow nie-alfanumerycznych: " + ilosc);
	}
	
	private static void wystapieniaZnakowBialych(String zawartoscPliku) {
		int ilosc = BibliotekaZnakow.obliczIloscZnakowBialych(zawartoscPliku);
		
		System.out.println("Ilosc znakow bialych: " + ilosc);
	}
	
	private static void wystapieniaMalychLiter(String zawartoscPliku) {
		int ilosc = BibliotekaZnakow.obliczIloscMalychLiter(zawartoscPliku);
		
		System.out.println("Ilosc malych liter: " + ilosc);
	}
	
	private static void wystapieniaWielkichLiter(String zawartoscPliku) {
		int ilosc = BibliotekaZnakow.obliczIloscWielkichLiter(zawartoscPliku);
		
		System.out.println("Ilosc malych liter: " + ilosc);
	}

	private static String wczytajPlik() throws IOException {
		System.out.print("Podaj nazwe pliku do wczytania: ");
		String nazwaPliku = consoleReader.readLine();
		
		File plik = new File(nazwaPliku);
		
		BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(plik)));
		
		String zawartoscPliku = "";
		
		String linia;
		while ((linia = fileReader.readLine()) != null) {
			zawartoscPliku += linia + "\n";
		}
		
		fileReader.close();
		
		System.out.println("Wczytano plik!");
		return zawartoscPliku;
	}
}
