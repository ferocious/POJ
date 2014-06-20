package zad2;

public class BibliotekaZnakow {

	/**
	 * Zlicza ilosc wystapien okreslonego znaku.
	 */
	public static int obliczIloscZnakow(String tekst, char znak) {
		char[] tablicaZnakow = tekst.toCharArray();
		int licznik = 0;
		
		for (int i = 0; i < tablicaZnakow.length; i++) {
			if (tablicaZnakow[i] == znak) {
				licznik++;
			}
		}
		
		return licznik;
	}
	
	/**
	 * Zlicza ilosc wystapien okreslonego znaku ignorujac wielkosc liter.
	 */
	public static int obliczIloscZnakowIgnorujacWielksc(String tekst, char znak) {
		String tekstLowerCase = tekst.toLowerCase();
		char znakLowerCase = String.valueOf(znak).toLowerCase().charAt(0);
		
		return obliczIloscZnakow(tekstLowerCase, znakLowerCase);
	}

	/**
	 * Zlicza ilosc wystapien okreslonego ciagu znakow.
	 */
	public static int obliczIloscCiagow(String tekst, String szukanyCiag) {
		int licznik = 0;
		int startIndex = 0;
		int index = 0;
				
		/* indexOf zwraca -1 jest szukany ciag nie zostal znaleziony w tekscie */
		while ((index = tekst.indexOf(szukanyCiag, startIndex)) != -1) {
			licznik++;
			startIndex = index + szukanyCiag.length();
		}
		
		return licznik;
	}
	
	/**
	 * Zlicza ilosc wystapien okreslonego ciagu znakow ignorujac wielkosc liter.
	 */
	public static int obliczIloscCiagowIgnorujWielkosc(String tekst, String szukanyCiag) {
		String tekstLowerCase = tekst.toLowerCase();
		String szukanyCiagLowerCase = szukanyCiag.toLowerCase();
		
		return obliczIloscCiagow(tekstLowerCase, szukanyCiagLowerCase);
	}
	
	/**
	 * Zlicza ilosc wystapien liter.
	 */
	public static int obliczIloscLiter(String tekst) {
		int licznik = 0;
		
		for (int i = 0; i < tekst.length(); i++) {
			if (Character.isLetter(tekst.charAt(i))) {
				licznik++;
			}
		}
		
		return licznik;
	}
	
	/**
	 * Zlicza ilosc samoglosek.
	 */
	public static int obliczIloscSamoglosek(String tekst) {
		String tekstLowerCase = tekst.toLowerCase();
		int licznik = 0;
		
		for (int i = 0; i < tekstLowerCase.length(); i++) {
			char znak = tekstLowerCase.charAt(i);
			
			if (czyJestSamogloska(znak)) {
				licznik++;
			}
		}
		
		return licznik;
	}
	
	/**
	 * Zlicza ilosc spolglosek.
	 */
	public static int obliczIloscSpolglosek(String tekst) {
		String tekstLowerCase = tekst.toLowerCase();
		int licznik = 0;
		
		for (int i = 0; i < tekstLowerCase.length(); i++) {
			char znak = tekstLowerCase.charAt(i);
			
			if (Character.isLetter(znak) && !czyJestSamogloska(znak)) {
				licznik++;
			}
		}
		
		return licznik;
	}
	
	/**
	 * Oblicza ilosc cyfr.
	 */
	public static int obliczIloscCyfr(String tekst) {
		int licznik = 0;
		
		for (int i = 0; i < tekst.length(); i++) {
			char znak = tekst.charAt(i);
			
			if (Character.isDigit(znak)) {
				licznik++;
			}
		}
		
		return licznik;
	}
	
	/**
	 * Zlicza ilosc znakow alfanumerycznych.
	 */
	public static int obliczIloscZnakowAlfanum(String tekst) {
		int licznik = 0;
		
		for (int i = 0; i < tekst.length(); i++) {
			char znak = tekst.charAt(i);
			
			if (Character.isLetterOrDigit(znak)) {
				licznik++;
			}
		}
		
		return licznik;
	}
	
	/**
	 * Zlicza ilosc znakow nie-alfanumerycznych.
	 */
	public static int obliczIloscZnakowNieAlfanum(String tekst) {
		int licznik = 0;
		
		for (int i = 0; i < tekst.length(); i++) {
			char znak = tekst.charAt(i);
			
			if (!Character.isLetterOrDigit(znak)) {
				licznik++;
			}
		}
		
		return licznik;
	}
	
	/**
	 * Zlicza ilosc znakow bialych
	 */
	public static int obliczIloscZnakowBialych(String tekst) {
		int licznik = 0;
		
		for (int i = 0; i < tekst.length(); i++) {
			char znak = tekst.charAt(i);
			
			if (Character.isWhitespace(znak)) {
				licznik++;
			}
		}
		
		return licznik;
	}
	
	/**
	 * Zlicza ilosc malych liter.
	 */
	public static int obliczIloscMalychLiter(String tekst) {
		int licznik = 0;
		
		for (int i = 0; i < tekst.length(); i++) {
			char znak = tekst.charAt(i);
			
			if (Character.isLowerCase(znak)) {
				licznik++;
			}
		}
		
		return licznik;
	}
	
	/**
	 * Zlicza ilosc wielkich liter.
	 */
	public static int obliczIloscWielkichLiter(String tekst) {
		int licznik = 0;
		
		for (int i = 0; i < tekst.length(); i++) {
			char znak = tekst.charAt(i);
			
			if (Character.isUpperCase(znak)) {
				licznik++;
			}
		}
		
		return licznik;
	}
	
	/**
	 * Sprawdza czy znak jest samogloska.
	 */
	private static boolean czyJestSamogloska(char znak) {
		String samogloski = "aeyuioó¹ê";
		
		if (samogloski.indexOf(znak) != -1) {
			return true;
		} else {
			return false;
		}
	}
}
