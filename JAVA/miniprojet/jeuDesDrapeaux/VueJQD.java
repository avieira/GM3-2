import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class VueJQD extends JFrame 
{

  //Attributs 
  //-Parametres de la fenetre
  private String titre;
  private int largeur;
  private int hauteur;
  private boolean demarre=false;
  public DessinDrapeau dessinDrapeau = new DessinDrapeau();
  public DessinScore dessinScore = new DessinScore();
  public DessinTemps dessinTemps = new DessinTemps();
  //-Zones de la fenetre
  //--Le conteneur principal
  private JPanel container = new JPanel();
  //--Le nom du jeu
  public JLabel enTete = new JLabel();
  //--La zone d'affichage du drapeau
  public JPanel zoneImage = new JPanel();
  //--La zone de reponse
  public JPanel zoneReponse = new JPanel();
  //---La zone de saisie de la reponse
  public JTextField zoneSaisieReponse = new JTextField("");
  //--La zone de score, de temps et pour lancer le jeu
  public JPanel piedDePage = new JPanel(); 
  //---Le bouton demarrer
  public JButton boutonDemarrer = new JButton();
  //--La zone de notification du nom du pays
  public JLabel zoneNotifPays = new JLabel();
  //Le controleur
  public ControlerJQD controler;



 //Constructeur
 public VueJQD(ControlerJQD ctrl)
 {
  controler=ctrl;
  
  //Initialisation des attributs
  //this.initAttr();
  largeur=700;
  hauteur=500;
  titre="Jeu des Drapeaux";
  this.setTitle("Jeu drapeaux");
  //Configuration des differentes zones
  container.setLayout(new FlowLayout());
  container.setBackground(new Color(58,95,133));
  
  Font police = new Font("Comic Sans MS", Font.TYPE1_FONT, 30);
  enTete.setFont(police);
  enTete.setHorizontalAlignment(JLabel.CENTER);
  enTete.setPreferredSize(new Dimension(largeur,40));
  enTete.setBackground(new Color(58,95,133));
  enTete.setForeground(Color.white);
  enTete.setText(titre);

  zoneImage.setPreferredSize(new Dimension(largeur,300));
  zoneImage.setBackground(new Color(58,95,133));
  zoneImage.setLayout(new BorderLayout());
  zoneImage.add(dessinDrapeau,BorderLayout.CENTER);

  zoneReponse.setPreferredSize(new Dimension(largeur,40));
  zoneReponse.setBackground(new Color(58,95,133));
  zoneReponse.setLayout(new FlowLayout());
  zoneReponse.add(zoneSaisieReponse);
  zoneSaisieReponse.setEnabled(false);
  zoneSaisieReponse.addKeyListener(new SaisieListener());
  zoneSaisieReponse.setPreferredSize(new Dimension(150, 20));

  zoneNotifPays.setPreferredSize(new Dimension(largeur,20));
  Font police2 = new Font("Comic Sans MS", Font.TYPE1_FONT, 16);
  zoneNotifPays.setFont(police2);
  zoneNotifPays.setHorizontalAlignment(JLabel.CENTER);
  zoneNotifPays.setBackground(new Color(58,95,133));

  boutonDemarrer = new JButton("Demarrer");
  boutonDemarrer.addActionListener(new DemarrerListener());
  piedDePage.setPreferredSize(new Dimension(largeur,70));
  piedDePage.setBackground(new Color(58,95,133));
  piedDePage.setLayout(new FlowLayout());
  piedDePage.add(dessinScore);
  piedDePage.add(boutonDemarrer);
  piedDePage.add(dessinTemps);

  container.add(enTete);
  container.add(zoneImage);
  container.add(zoneNotifPays);
  container.add(zoneReponse);
  container.add(piedDePage);

  //Configuration de la fenetre
  this.setSize(largeur,hauteur);
  this.setLocationRelativeTo(null);
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setResizable(false);

  this.setContentPane(container);
  this.setVisible(true);
 }

 
 class DemarrerListener implements ActionListener
 {
  public void actionPerformed(ActionEvent event)
  {
   controler.demarrer();
   controler.actualiser();
  }
 }

 class SaisieListener implements KeyListener
 {

  public void keyPressed(KeyEvent event){}

  public void keyReleased(KeyEvent event)
  {
   if(event.getKeyCode()==10)
   {
    controler.verif(zoneSaisieReponse.getText());
    zoneSaisieReponse.setText("");
   }
  }

  public void keyTyped(KeyEvent event)
  {
  }
 }

 public String getTitre()
 {
  return this.titre;
 }

 public void setDemarre(boolean b)
 {
  demarre=b;
 }

 public void iniJeu()
 {
  dessinTemps.setCompteur("Temps : ");
  dessinDrapeau.setChemin("regles.jpg");
  zoneNotifPays.setText("");
 }

 public boolean getDemarre()
 {
  return demarre;
 } 
}
