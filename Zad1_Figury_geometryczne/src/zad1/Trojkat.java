package zad1;

/**
 * Klasa opisujaca trojkat.
 */
public class Trojkat implements Wielokat {

	private Wspolrzedna[] wspolrzedneWierzcholkow;
	
	/**
	 * Konstruktor klasy Trojkat. Argumentem jest tablica wspolrzednych wierzcholkow.
	 */
	public Trojkat(Wspolrzedna[] wspolrzedneWierzcholkow) {
		this.wspolrzedneWierzcholkow = wspolrzedneWierzcholkow;
	}

	@Override
	public String nazwa() {
		return "trojkat";
	}

	@Override
	public String opis() {
		String tekst = "Trojkat o wierzcholkach: ";
		
		for (int i = 0; i < 3; i++) {
			tekst += wspolrzedneWierzcholkow[i].opis() + " ";
		}
		
		return tekst;
	}

	@Override
	public Wspolrzedna[] wspolrzedneWierzcholkow() {
		return wspolrzedneWierzcholkow;
	}

	@Override
	public int liczbaBokow() {
		return 3;
	}

	@Override
	public double[] dlugoscBokow() {
		double[] dlugoscBokow = new double[3];
		
		dlugoscBokow[0] = dlugosc(wspolrzedneWierzcholkow[0], wspolrzedneWierzcholkow[1]);
		dlugoscBokow[1] = dlugosc(wspolrzedneWierzcholkow[1], wspolrzedneWierzcholkow[2]);
		dlugoscBokow[2] = dlugosc(wspolrzedneWierzcholkow[2], wspolrzedneWierzcholkow[0]);
		
		return dlugoscBokow;
	}

	@Override
	public double obwod() {
		double[] dlugoscBokow = dlugoscBokow();
		return dlugoscBokow[0] + dlugoscBokow[1] + dlugoscBokow[2];
	}

	@Override
	public double pole() {
		double[] dlugoscBokow = dlugoscBokow();
		
		double p = obwod() / 2.0;
		double a = dlugoscBokow[0];
		double b = dlugoscBokow[1];
		double c = dlugoscBokow[2];
		
		double wynik = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		return wynik;
	}

	/**
	 * Oblicza dlugosc odcinka.
	 */
	public double dlugosc(Wspolrzedna a, Wspolrzedna b) {
		double czesc1 = Math.pow(b.getX() - a.getX(), 2);
		double czesc2 = Math.pow(b.getY() - a.getY(), 2);
		
		return Math.abs(Math.sqrt(czesc1 + czesc2));
	}
}
