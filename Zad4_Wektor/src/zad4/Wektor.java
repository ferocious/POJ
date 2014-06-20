package zad4;

import java.util.Arrays;

/**
 * Klasa wektor.
 */
public class Wektor {

	private double[] tablica;
	
	/**
	 * Konstruktor tworzacy wektor zerowy o rozmiarze n.
	 */
	public Wektor(int n) {
		tablica = new double[n];
	}

	/**
	 * Konstruktor tworzacy wektor z podanej tablicy liczb rzeczywistych.
	 */
	public Wektor(double[] tablica) {
		this.tablica = tablica;
	}

	/**
	 * Zwraca i-ty element wektora.
	 */
	public double get(int i) {
		return tablica[i];
	}
	
	/**
	 * Ustawia wartosc dla i-tego elementu wektora.
	 */
	public void set(int i, double wartosc) {
		tablica[i] = wartosc;
	}
	
	/**
	 * Zwraca najwiekszy element wektora.
	 */
	public double max() {
		double max = tablica[0];
		
		for (int i = 1; i < tablica.length; i++) {
			if (max < tablica[i]) {
				max = tablica[i];
			}
		}
		
		return max;
	}
	
	/**
	 * Zwraca wektor bedacy suma poelementowa dwoch wektorow.
	 */
	public double[] add(double[] tab) {
		double[] rezultat = new double[tablica.length];
		
		for (int i = 0; i < tablica.length; i++) {
			rezultat[i] = tablica[i] + tab[i];
		}
		
		return rezultat;
	}
	
	/**
	 * Zwraca liczbe elementow wektora.
	 */
	public int size() {
		return tablica.length;
	}
	
	/**
	 * Zwraca lancuch znakowy przedstawiajacy elementy wektora.
	 */
	public String toString() {
		return Arrays.toString(tablica);
	}
	
	/**
	 * Wyprowadza w konsoli elementy tablicy.
	 */
	public static void show(double[] tab) {
		System.out.println(Arrays.toString(tab));
	}
	
	/**
	 * Sortuje elementy wektora.
	 */
	public double[] sort(boolean rosnaco) {
		if (rosnaco) {
			return sortujRosnaco();
		} else {
			return sortujMalejaco();
		}
	}
	
	private double[] sortujRosnaco() {
		boolean sortowane;
		double[] rezultat = Arrays.copyOf(tablica, tablica.length);
		double tmp;
		
		do {
			sortowane = false;
			
			for (int i = 0; i < rezultat.length - 1; i++) {
				if (rezultat[i] > rezultat[i + 1]) {
					tmp = rezultat[i];
					rezultat[i] = rezultat[i + 1];
					rezultat[i + 1] = tmp;
					
					sortowane = true;
				}
			} 
		} while (sortowane);
		
		return rezultat;
	}
	
	private double[] sortujMalejaco() {
		boolean sortowane = false;
		double[] rezultat = Arrays.copyOf(tablica, tablica.length);
		double tmp;
		
		do {
			sortowane = false;
			
			for (int i = 0; i < rezultat.length - 1; i++) {
				if (rezultat[i] < rezultat[i + 1]) {
					tmp = rezultat[i];
					rezultat[i] = rezultat[i + 1];
					rezultat[i + 1] = tmp;
					
					sortowane = true;
				}
			} 
		} while (sortowane);
		
		return rezultat;
	}
}
