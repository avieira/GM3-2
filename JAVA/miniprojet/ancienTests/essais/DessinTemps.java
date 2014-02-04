import javax.swing.*;
import java.awt.*;

public class DessinTemps extends JPanel
{
 String compteur="1:00";
 
 public DessinTemps()
 {
  this.setPreferredSize(new Dimension(200,40));
 }


 public void paintComponent(Graphics g)
 {
  Font font = new Font("Courier", Font.BOLD, 20);
  g.setFont(font);
  g.setColor(Color.green);
  g.drawString(compteur, 120, 20);

 }

 public void setCompteur(String nouveauTemps)
 {
  compteur=nouveauTemps;
 }
} 
