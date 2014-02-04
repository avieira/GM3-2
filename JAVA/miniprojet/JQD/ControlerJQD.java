import java.awt.*;
import javax.swing.*;
import java.lang.String.*;

public class ControlerJQD
{
/*-------------------------------------------------------------------------------
			Variables d'instances
-------------------------------------------------------------------------------*/
 ModelJQD model;
 VueJQD fenetre;

/*-------------------------------------------------------------------------------
			Constructeurs
-------------------------------------------------------------------------------*/
 public ControlerJQD(ModelJQD m)
 {
  model=m;
 } 

/*-------------------------------------------------------------------------------
				Méthodes
-------------------------------------------------------------------------------*/
 public void addFenetre(VueJQD f)
 {
  fenetre = f;
 }

 public void demarrer()
 {
  fenetre.setEnabledSaisieReponse(true);
  fenetre.setScoreDessinScore(0);
  fenetre.repaintDessinScore();
  String c;
  model.setMaxCompteurTemps(60000);
  fenetre.setCompteurDessinTemps(model.getCompteurTemps().toString());
  fenetre.repaintDessinTemps();
  model.lancerCompteurTemps();
  fenetre.setDemarre(true);
  c=model.getCheminDrapeauCourant();
  fenetre.setCheminDessinDrapeau(c);
  fenetre.repaintDessinDrapeau();
  fenetre.setEnabledBoutonDemarrer(false);
 }

 public void verif(String saisie)
 {
  saisie=saisie.toLowerCase();
  if(saisie.equals(model.getNomDrapeauCourant().toLowerCase()))
  {
   model.scorePlusUn(); 
   fenetre.setScoreDessinScore(model.getScore());
   fenetre.setForegroundZoneNotifPays(new Color(138,142,91));
   fenetre.setTextZoneNotifPays(model.getNomDrapeauCourant());
   fenetre.repaintZoneNotifPays();
  }
  else
  {
   fenetre.setForegroundZoneNotifPays(new Color(245,80,80));
   fenetre.setTextZoneNotifPays(model.getDrapeauCourant().getNom());
   fenetre.repaintZoneNotifPays();
  }
  model.changeDrapeauCourant();
  fenetre.setCheminDessinDrapeau(model.getDrapeauCourant().getChemin());
  fenetre.repaintDessinDrapeau();
  fenetre.repaintDessinScore();
 }
  
 public void actualiser()
 {
  Actualiseur actualiseur = new Actualiseur(fenetre,model);
  actualiseur.start();
 }
}
