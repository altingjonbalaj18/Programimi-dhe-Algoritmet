import javax.swing.*;

public class Auto{
   public static void main(String[] args){
      String input = JOptionPane.showInputDialog("What's the initial velocity");
      double v0 = new Double(input).doubleValue();
      input = JOptionPane.showInputDialog("What's the acceleration");
      double a = new Double(input).doubleValue();
      int t = 0;
      double distance = distance(v0,a,t);
      
      String[] options = {"Next second", "Quit"};  
      int x = JOptionPane.showOptionDialog(null, "Total distance for " + t + " seconds is " + distance,
                "Click a button", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
      if(x == 1){
         System.exit(0);
      }
      
      while(x == 0){
         distance = distance(v0,a,++t);
         x = JOptionPane.showOptionDialog(null, "Total distance for " + t + " seconds is " + distance, 
         "Click a button", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
      }  
   }
   public static double distance(double v0, double a, int t){
      double distance = v0*t + (1.0/2.0)*Math.pow(t,2)*a;
      return distance;
   }
}
