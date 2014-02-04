import java.awt.*;
import javax.swing.*;
import java.lang.String.*;

public class ControlerJQD
{
 //Attributs
 ModelJQD model;
 VueJQD fenetre;

 //Constructeur
 public ControlerJQD(ModelJQD m)
 {
  model=m;
 } 

 //Methodes
 public void addFenetre(VueJQD f)
 {
  fenetre = f;
 }

 public void demarrer()
 {
  String c;

  //model.lancerCompteur();
  c=model.getDrapeauCourant().getChemin();
  fenetre.dessinDrapeau.setChemin(c);
  fenetre.dessinDrapeau.repaint();
  fenetre.boutonDemarrer.setEnabled(false);
 }

 public void verif(String saisie)
 {
  saisie=saisie.toLowerCase();
  if(saisie.equals(model.getNomDrapCour()))
  {
   model.scorePlusUn(); 
   fenetre.setScore(model.getScore());
  }
   model.changeDrapeauCourant();
   fenetre.setCheminDrapeau(model.getCheminDrapCour());
   fenetre.repaintDrapeau();
   fenetre.repaintScore();
 }

}
