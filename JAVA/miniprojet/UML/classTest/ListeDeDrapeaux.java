import java.util.ArrayList;

public class ListeDeDrapeaux{
	ArrayList<Drapeau> listeDrapeau = new ArrayList<Drapeau>();

	public ListeDeDrapeaux(String[] listePays, String[] listeChemin){
		for(int i=0; i<listePays.length; i++){
			try{
				listeDrapeau.add(new Drapeau(listePays[i],listeChemin[i]));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public Drapeau getDrapeau(int i){
		return listeDrapeau.get(i);
	}
}