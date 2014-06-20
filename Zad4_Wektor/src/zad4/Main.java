package zad4;

import java.util.Arrays;

/**
 * Zadanie 4 (Wektor)
 * 
 * autor: Dorota Gmerek
 */
public class Main {

	/**
	 * Klasa main.
	 */
	public static void main(String[] args) {
		double[] tablica = { 4.5, 7.2, 8, 1.0, 8.1, 2.3 };
		
		Wektor wektor = new Wektor(tablica);
		
		System.out.println("Lista elementow: " + wektor.toString());
		
		System.out.println("Element o indeksie 4: " + wektor.get(4));
		
		wektor.set(4, 100.5);
		
		System.out.println("Element o indeksie 4: " + wektor.get(4));
		
		System.out.println("Najwiekszy element: " + wektor.max());
		
		double[] tablica2 = { 5, 5, 5, 5, 5, 5 };
		
		System.out.println("Rezultat dodawania: " + Arrays.toString(wektor.add(tablica2)));
		
		Wektor.show(tablica2);
		
		System.out.println("Wektor posortowany rosnaco: " + Arrays.toString(wektor.sort(true)));
		
		System.out.println("Wektor posortowany malejaco: " + Arrays.toString(wektor.sort(false)));
		
	}
}
