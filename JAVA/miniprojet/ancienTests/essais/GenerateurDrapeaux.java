public class GenerateurDrapeaux{
	private ListeDeDrapeaux listeDrap;
	private Drapeau drapeauCourant;
	private String[] listeNom={"ecosse", "france", "allemagne", "pays-bas", "suisse"};
	private String[] listeChemin={"ecosse.jpg", "france.jpg", "allemagne.jpg", "hollande.jpg", "suisse.jpg"};
	private GenerateurNbAleatoire generAlea=new GenerateurNbAleatoire(0,listeNom.length);

	public GenerateurDrapeaux(){
		listeDrap=new ListeDeDrapeaux(listeNom, listeChemin);
		drapeauCourant=listeDrap.getDrapeau(generAlea.genererNb());
	}

	public Drapeau getDrapeauCourant(){
		return drapeauCourant;
	}

	public void changerDrapeau(){
		drapeauCourant=listeDrap.getDrapeau(generAlea.genererNb());
	}
}
