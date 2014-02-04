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
    fenetre.dessinTemps.setCompteur(model.getCompteurTemps().toString());
    fenetre.dessinTemps.repaint();
    if(model.getCompteurTemps().getStatut()==false)
    {
     fenetre.setDemarre(false);
     fenetre.boutonDemarrer.setEnabled(true);
    }
  }
  model.iniJeu();
  fenetre.iniJeu();
  fenetre.zoneSaisieReponse.setEnabled(false);
  fenetre.dessinDrapeau.repaint();
  fenetre.dessinTemps.repaint();
  fenetre.zoneNotifPays.repaint();
 }


}
