package zad3;

/**
 * Klasa zawiera jednostki mocy.
 */
public class Moc {

	private final double konMechaniczny = 735.498;
	
	/**
	 * Przelicza waty na konie mechaniczne.
	 */
	public double przeliczKonieMechaniczne(double iloscWatow) {
		return iloscWatow / konMechaniczny;
	}
}
