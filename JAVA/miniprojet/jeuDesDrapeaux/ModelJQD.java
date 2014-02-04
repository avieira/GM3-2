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
		unCompteurTemps.start();
	}

	public void scorePlusUn(){
		unScore.incrementerScore();
	}

        public void setScore(int i)
        {
         	unScore.setScore(i);
        }

	public void changeDrapeauCourant(){
		generDrap.changerDrapeau();
	}

        public void iniJeu()
        {
         	this.setScore(0);  
        }
}
