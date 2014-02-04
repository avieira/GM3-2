import javax.swing.*;
import java.awt.*;

public class DessinScore extends JPanel
{
 public int score=0;
 
 public DessinScore()
 {
  this.setPreferredSize(new Dimension(300,40));
 }


 public void paintComponent(Graphics g)
 {
  g.setColor(Color.red);
  g.fillRect(0, 0, 300, 40);
  Font font = new Font("Courier", Font.BOLD, 20);
  g.setFont(font);
  g.setColor(Color.blue);
  g.drawString("Score: "+String.valueOf(score)+" points", 0, 20);
 }

 public void setScore(int nouveauScore)
 {
  score=nouveauScore;
 }
} 
