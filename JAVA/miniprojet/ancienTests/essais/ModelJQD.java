public class ModelJQD extends AbstractModel{
	
	protected GenerateurDrapeaux getGenerateurDrapeaux(){
		return generDrap;
	}

	public Drapeau getDrapeauCourant(){
		return this.getGenerateurDrapeaux().getDrapeauCourant();
	}

	public int getScore(){
		return unScore.getScore();
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

	public String getNomDrapCour(){
		return this.getDrapeauCourant().getNom();
	}

	public String getCheminDrapCour(){
		return this.getDrapeauCourant().getChemin();
	}
}
