public class Drapeau{
	String nom;
	String chemin;

	public Drapeau(){
		nom=new String();
		chemin=new String();
	}

	public Drapeau(String nm, String chmn){
		nom = nm;
		chemin=chmn;
	}

	public String getNom(){
		return nom;
	}

	public String getChemin(){
		return chemin;
	}
}
