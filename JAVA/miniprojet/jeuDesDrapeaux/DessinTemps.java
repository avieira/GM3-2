import javax.swing.*;
import java.awt.*;

public class DessinTemps extends JPanel
{
 String compteur="Temps : ";
 
 public DessinTemps()
 {
  this.setPreferredSize(new Dimension(280,40));
 }


 public void paintComponent(Graphics g)
 {
  g.setColor(new Color(58,95,133));
  g.fillRect(0, 0, 280, 40);
  Font font = new Font("Courier", Font.BOLD, 20);
  g.setFont(font);
  g.setColor(Color.white);
  g.drawString(compteur, 120, 20);

 }

 public void setCompteur(String nouveauTemps)
 {
  compteur=nouveauTemps;
 }
} 
