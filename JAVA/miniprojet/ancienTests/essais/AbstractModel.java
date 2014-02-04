import java.util.ArrayList;

public abstract class AbstractModel implements Observable{

	private ArrayList<Observer> listObserver = new ArrayList<Observer>();
	protected CompteurTemps unCompteurTemps;
	protected GenerateurDrapeaux generDrap=new GenerateurDrapeaux();
	protected Score unScore=new Score();

	public abstract Drapeau getDrapeauCourant();
	public abstract int getScore();
	public abstract CompteurTemps getCompteurTemps();

	protected abstract GenerateurDrapeaux getGenerateurDrapeaux();

	//Initialiser unCompteurTemps
	public abstract void setMaxCompteurTemps(long t);
	
	//Lancer compteur quand appui sur bouton
	public abstract void lancerCompteur();

	//Incrémente le score
	public abstract void scorePlusUn();

	//Change le drapeau courant
	public abstract void changeDrapeauCourant();

	//Obtenir nom du drapeau courant
	public abstract String getNomDrapCour();

	//Obtenir chemin du drapeau courant
	public abstract String getCheminDrapCour();

	//Redéfinition des méthodes abstraites de Observable
	public void addObserver(Observer obs){
		this.listObserver.add(obs);
	}

	public void notifyObserver(String str){
		//update observer, inutile pour l'instant
	}

	public void removeObserver(){
		listObserver = new ArrayList<Observer>();
	}
}
