public class ModelJQD extends AbstractModel{
	
	protected GenerateurDrapeaux getGenerateurDrapeaux(){
		return generDrap;
	}

	public Drapeau getDrapeauCourant(){
		return this.getGenerateurDrapeaux().getDrapeauCourant();
	}

	public Score getScore(){
		return unScore;
	}

	public CompteurTemps getCompteurTemps(){
		return unCompteurTemps;
	}

	public void setMaxCompteurTemps(long t){
		unCompteurTemps=new CompteurTemps(t);
	}

	public void lancerCompteur(){
		unCompteurTemps.demarrer();
	}

	public void scorePlusUn(){
		unScore.incrementerScore();
	}

	public void changeDrapeauCourant(){
		generDrap.changerDrapeau();
	}
}
