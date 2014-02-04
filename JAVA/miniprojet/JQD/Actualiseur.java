public class Actualiseur extends Thread
{
 VueJQD fenetre;
 ModelJQD model;

 public Actualiseur(VueJQD f,ModelJQD m)
 {
  fenetre = f;
  model = m ;
 }

 public void run()
 {
  while(fenetre.getDemarre())
  {
    fenetre.setCompteurDessinTemps(model.getCompteurTemps().toString());
    fenetre.repaintDessinTemps();
    if(model.getCompteurTemps().getStatut()==false)
    {
     fenetre.setDemarre(false);
     fenetre.setEnabledBoutonDemarrer(true);
    }
  }
  model.iniJeu();
  fenetre.iniJeu();
  fenetre.setEnabledSaisieReponse(false);
  fenetre.repaintDessinDrapeau();
  fenetre.repaintDessinTemps();
  fenetre.repaintZoneNotifPays();
 }


}
