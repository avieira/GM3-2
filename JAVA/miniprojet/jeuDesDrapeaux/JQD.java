public class JQD
{
 public static void main(String args[])
 {
  ModelJQD modele = new ModelJQD();
  ControlerJQD controleur = new ControlerJQD(modele);
  VueJQD fenetre= new VueJQD(controleur);
  controleur.addFenetre(fenetre);
 }
}
