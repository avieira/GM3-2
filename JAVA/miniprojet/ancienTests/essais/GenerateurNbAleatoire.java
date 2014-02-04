public class GenerateurNbAleatoire{
	private int borneMin, borneSup;

	public GenerateurNbAleatoire(int min, int max){
		borneMin=min;
		borneSup=max;
	}

	public int getBorneMin(){
		return borneMin;
	}

	public int getBorneSup(){
		return borneSup;
	}

	public void setBorneMin(int inf){
		borneMin=inf;
	}

	public void setBorneSup(int max){
		borneSup=max;
	}

	public int genererNb(){
		return (borneMin + (int)(Math.random()*(borneSup-borneMin)));
	}
}
