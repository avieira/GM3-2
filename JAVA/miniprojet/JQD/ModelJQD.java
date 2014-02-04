import java.util.ArrayList;

public class ModelJQD{
/*-------------------------------------------------------------------------------
			Variables d'instances
-------------------------------------------------------------------------------*/
	protected CompteurTemps unCompteurTemps;
	protected GenerateurDrapeaux generDrap=new GenerateurDrapeaux();
	protected Score unScore=new Score();
	
/*-------------------------------------------------------------------------------
			Constructeurs
-------------------------------------------------------------------------------*/


/*-------------------------------------------------------------------------------
				Accesseurs
				   get
-------------------------------------------------------------------------------*/

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

	public String getCheminDrapeauCourant(){
		return this.getDrapeauCourant().getChemin();
	}

	public String getNomDrapeauCourant(){
		return this.getDrapeauCourant().getNom();
	}

/*-------------------------------------------------------------------------------
				   set
-------------------------------------------------------------------------------*/
	public void setMaxCompteurTemps(long t){
		unCompteurTemps=new CompteurTemps(t);
	}

        public void setScore(int i){
         	unScore.setScore(i);
        }

/*-------------------------------------------------------------------------------
				Méthodes
-------------------------------------------------------------------------------*/
        public void iniJeu(){
         	this.setScore(0);  
		this.changeDrapeauCourant();
        }

	public void lancerCompteurTemps(){
		unCompteurTemps.start();
	}

	public void scorePlusUn(){
		unScore.incrementerScore();
	}

	public void changeDrapeauCourant(){
		generDrap.changerDrapeau();
	}
}
