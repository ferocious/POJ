package zad3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Zad. 3 (Wlasciwosci)
 * 
 * Glowna klasa programu przeliczajacego jednostki miar.
 * 
 * autor: Dorota Gmerek
 */
public class Main {

	private static BufferedReader reader;
	
	private static Jednostki jednostki = new Jednostki();
	
	/**
	 * Metoda main.
	 */
	public static void main(String[] args) throws IOException {
		// Tworzenie bufora wczytujacego dane z klawiatury:
		reader = new BufferedReader(new InputStreamReader(System.in));
		
		przeliczIlosc();
		przeliczDlugosc();
		przeliczMase();
		przeliczTemperature();
		przeliczMoc();
		przeliczObjetosc();
		
		System.out.println("Koniec");
	}

	/**
	 * Przelicza ilosci.
	 */
	private static void przeliczIlosc() throws IOException {
		System.out.print("Podaj ilosc: ");
		
		double ilosc = wczytajLiczbe();
		
		System.out.println("Kopa: " + jednostki.ilosc.przeliczKopa(ilosc));
		System.out.println("Tuzin: " + jednostki.ilosc.przeliczTuzin(ilosc));
		System.out.println("Mendel: " + jednostki.ilosc.przeliczMendel(ilosc));
		
		System.out.println();
	}

	/**
	 * Przelicza dlugosci.
	 */
	private static void przeliczDlugosc() throws IOException {
		System.out.print("Podaj dlugosc w metrach: ");
		
		double dlugosc = wczytajLiczbe();
		
		System.out.println("Milimetr: " + jednostki.dlugosc.przeliczMilimetr(dlugosc));
		System.out.println("Cal: " + jednostki.dlugosc.przeliczCal(dlugosc));
		System.out.println("Yard: " + jednostki.dlugosc.przeliczYard(dlugosc));
		System.out.println("Mila morska: " + jednostki.dlugosc.przeliczMilaMorska(dlugosc));
		System.out.println("Mila angielska: " + jednostki.dlugosc.przeliczMilaAngielska(dlugosc));
		
		System.out.println();
	}
	
	/**
	 * Przelicz mase.
	 */
	private static void przeliczMase() throws IOException {
		System.out.print("Podaj mase w kilogramach: ");
		
		double masa = wczytajLiczbe();
		
		System.out.println("Gram: " + jednostki.masa.przeliczGram(masa));
		System.out.println("Tona: " + jednostki.masa.przeliczTone(masa));
		System.out.println("Kwintal: " + jednostki.masa.przeliczaKwintal(masa));
		System.out.println("Funt brytyjski: " + jednostki.masa.przeliczFuntBrytyjski(masa));
		System.out.println("Uncja: " + jednostki.masa.przeliczUncje(masa));
		
		System.out.println();
	}

	/**
	 * Przelicza temperature.
	 */
	private static void przeliczTemperature() throws IOException {
		System.out.print("Podaj stopnie w skali Kelvina: ");
		
		double ilosc = wczytajLiczbe();
		
		System.out.println("Stopnie Celsjusza: " + jednostki.temperatura.przeliczCelsjusze(ilosc));
		System.out.println("Stopnie Fahrenheita: " + jednostki.temperatura.przeliczFahrenheity(ilosc));
		
		System.out.println();
	}
	
	/**
	 * Przelicza moc.
	 */
	private static void przeliczMoc() throws IOException {
		System.out.print("Podaj moc w watach: ");
		
		double ilosc = wczytajLiczbe();
		
		System.out.println("Konie mechaniczne: " + jednostki.moc.przeliczKonieMechaniczne(ilosc));
		
		System.out.println();
	}
	
	/**
	 * Przelicza objetosci.
	 */
	private static void przeliczObjetosc() throws IOException {
		System.out.print("Podaj ilosc w metrach szesciennych: ");
		
		double ilosc = wczytajLiczbe();
		
		System.out.println("Litr: " + jednostki.objetosc.przeliczLitr(ilosc));
		System.out.println("Kwaterka: " + jednostki.objetosc.przeliczKwaterke(ilosc));
		System.out.println("Galon angielski: " + jednostki.objetosc.przeliczGalonyAngielskie(ilosc));
		
		System.out.println();
	}
	
	/**
	 * Wczytuje liczbe zmiennoprzecinkowa.
	 */
	private static double wczytajLiczbe() throws IOException {
		String ilosc = reader.readLine();
		
		return Double.parseDouble(ilosc);
	}
}
