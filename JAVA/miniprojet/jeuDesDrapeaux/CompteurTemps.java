import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;

public class CompteurTemps extends Thread{
 private long temps;
 private long tempsMax;
 private boolean statut;
 

 public CompteurTemps(long t)
 {
  temps=0;
  tempsMax=t;
  statut=false;
 }

 public long getTemps()
 {
  return temps;
 }

 public boolean getStatut()
 {
  return statut;
 }

 public void setStatut(boolean b)
 {
  statut=b;
 } 

 public void run()
 {
  this.setStatut(true);
  long startTime=System.currentTimeMillis()+tempsMax;
  while(statut)
  {
   temps=startTime-System.currentTimeMillis();
   if(temps<0)
    this.setStatut(false);
   try
   {
    Thread.sleep(500);
   }
   catch (InterruptedException e)
   {
    e.printStackTrace();
   }
  }
 }

 public String toString()
 {
  int min;
  int sec;
  min = (int) temps/60000;
  sec = (int) temps/1000-min*60;
  return (String.valueOf(min)+":"+String.valueOf(sec));
 }

}
