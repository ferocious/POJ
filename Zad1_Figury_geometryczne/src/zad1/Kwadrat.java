package zad1;

/**
 * Klasa opisujaca kwadrat.
 */
public class Kwadrat implements Wielokat {
	
	/** Wspolrzedne wierzcholkow: */
	private Wspolrzedna[] wspolrzedneWierzcholkow;

	
	/**
	 * Konstruktor klasy Kwadrat. Argumentem jest tablica wierzcholkow.
	 */
	public Kwadrat(Wspolrzedna[] wspolrzedneWierzcholkow) {
		this.wspolrzedneWierzcholkow = wspolrzedneWierzcholkow;
	}

	@Override
	public String nazwa() {
		return "kwadrat";
	}

	@Override
	public String opis() {
		String tekst = "Kwadrat o wierzcholkach: ";
		
		for (int i = 0; i < 4; i++) {
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
		return 4;
	}

	@Override
	public double[] dlugoscBokow() {
		double[] dlugosciBokow = new double[4];
		
		dlugosciBokow[0] = dlugosc(wspolrzedneWierzcholkow[0], wspolrzedneWierzcholkow[1]);
		dlugosciBokow[1] = dlugosc(wspolrzedneWierzcholkow[1], wspolrzedneWierzcholkow[2]);
		dlugosciBokow[2] = dlugosc(wspolrzedneWierzcholkow[2], wspolrzedneWierzcholkow[3]);
		dlugosciBokow[3] = dlugosc(wspolrzedneWierzcholkow[3], wspolrzedneWierzcholkow[0]);
		
		return dlugosciBokow;
	}
	
	/**
	 * Oblicza dlugosc odcinka.
	 */
	public double dlugosc(Wspolrzedna a, Wspolrzedna b) {
		double czesc1 = Math.pow(b.getX() - a.getX(), 2);
		double czesc2 = Math.pow(b.getY() - a.getY(), 2);
		
		return Math.abs(Math.sqrt(czesc1 + czesc2));
	}

	@Override
	public double obwod() {
		double[] dlugosciBokow = dlugoscBokow();
		
		return dlugosciBokow[0] + dlugosciBokow[1] + dlugosciBokow[2] + dlugosciBokow[3];
	}

	@Override
	public double pole() {
		double[] dlugosciBokow = dlugoscBokow();
		
		return dlugosciBokow[0] * dlugosciBokow[0];
	}

}
