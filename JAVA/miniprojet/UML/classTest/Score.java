public class Score{
	private int scorePartie=0;

	public Score(){}

	public int getScore(){
		return scorePartie;
	}

	public void setScore(int i){
		scorePartie=i;
	}

	public void incrementerScore(){
		scorePartie++;
	}

	public void remettreAZero(){
		scorePartie=0;
	}
}