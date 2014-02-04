import java.awt.*;
import javax.swing.*;
import java.lang.String.*;

public class ControlerJQD
{
 //Attributs
 ModelJQD model;
 VueJQD fenetre;
 Actualiseur actualiseur;

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
  fenetre.zoneSaisieReponse.setEnabled(true);
  fenetre.dessinScore.setScore(0);
  fenetre.dessinScore.repaint();
  String c;
  model.setMaxCompteurTemps(60000);
  fenetre.dessinTemps.compteur=model.getCompteurTemps().toString();
  fenetre.dessinTemps.repaint();
  model.unCompteurTemps.start();
  fenetre.setDemarre(true);
  c=model.getDrapeauCourant().getChemin();
  fenetre.dessinDrapeau.setChemin(c);
  fenetre.dessinDrapeau.repaint();
  fenetre.boutonDemarrer.setEnabled(false);
 }

 public void verif(String saisie)
 {
  saisie=saisie.toLowerCase();
  if(saisie.equals(model.getDrapeauCourant().getNom().toLowerCase()))
  {
   model.scorePlusUn(); 
   fenetre.dessinScore.setScore(model.getScore());
   fenetre.zoneNotifPays.setForeground(new Color(138,142,91));
   fenetre.zoneNotifPays.setText(model.getDrapeauCourant().getNom());
   fenetre.zoneNotifPays.repaint();
  }
  else
  {
   fenetre.zoneNotifPays.setForeground(new Color(245,80,80));
   fenetre.zoneNotifPays.setText(model.getDrapeauCourant().getNom());
   fenetre.zoneNotifPays.repaint();
  }
  model.changeDrapeauCourant();
  fenetre.dessinDrapeau.chemin=model.getDrapeauCourant().getChemin();
  fenetre.dessinDrapeau.repaint();
  fenetre.dessinScore.repaint();
 }
  
 public void actualiser()
 {
  Actualiseur actualiseur = new Actualiseur(fenetre,model);
  actualiseur.start();
 }


}
