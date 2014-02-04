import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.imageio.*;


public class DessinDrapeau extends JPanel
{
 String chemin="regles.jpg";
 
 public DessinDrapeau()
 {
  this.setPreferredSize(new Dimension(400,200));
 }

 public void paintComponent(Graphics g)
 {
  g.setColor(new Color(58,95,133));
  g.fillRect(0,0,700,300);
  try
  {
   Image img=ImageIO.read(new File(chemin));
   g.drawImage(img,225,87,this);
  }
  catch(IOException e)
  {
   e.printStackTrace();
  }
 }

 public void setChemin(String nouveauChemin)
 {
  chemin=nouveauChemin;
 }
} 
