package zad1;

/**
 * Klasa opisujaca kolo.
 */
public class Kolo implements Figura {
	
	/** Promien kola */
	private double promien;

	/**
	 * Konstruktor klasy Kolo. Argumentem jest promien kola.
	 */
	public Kolo(double promien) {
		this.promien = promien;
	}
	
	@Override
	public String nazwa() {
		return "kolo";
	}

	@Override
	public String opis() {
		return "kolo o promieniu: " + promien;
	}

	/**
	 * Zwraca pole kola.
	 */
	public double pole() {
		return Math.PI * promien * promien;
	}
	
	/**
	 * Zwraca dlugosc okregu kola.
	 */
	public double dlugoscOkregu() {
		return 2 * Math.PI * promien;
	}
}
