import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.imageio.*;


public class DessinDrapeau extends JPanel
{
 String chemin="img.jpg";
 
 public DessinDrapeau()
 {
  this.setPreferredSize(new Dimension(250,125));
 }

 public void paintComponent(Graphics g)
 {
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
