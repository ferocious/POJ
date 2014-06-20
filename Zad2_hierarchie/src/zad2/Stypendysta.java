package zad2;

/**
 * Klasa Stypendysta, ktora rozszerza klase Student.
 */
public class Stypendysta extends Student {

	private float kwotaStypendium;
	
	public Stypendysta(String imie, String nazwisko, int rokUrodzenia,
			String plec, String numerIndeksu, float kwotaStypendium) {
		super(imie, nazwisko, rokUrodzenia, plec, numerIndeksu);
		
		this.kwotaStypendium = kwotaStypendium;
	}

	public float getKwotaStypendium() {
		return kwotaStypendium;
	}

	public void setKwotaStypendium(float kwotaStypendium) {
		this.kwotaStypendium = kwotaStypendium;
	}

	@Override
	public String opis() {
		String opis = super.opis();
		
		opis += ", kwotaStypendium=" + kwotaStypendium;
		
		return opis;
	}
}
