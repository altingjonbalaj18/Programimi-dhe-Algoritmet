import javax.swing.*;

public class AutoInputFrame{
   public static double initialVelocity;
   public static double accerelation;
   public AutoInputFrame(){
      //While initialVelocity is <= 0, repeat.
      //initialVelocity is 0 (default value), program enters the loop.
      while(initialVelocity <= 0){
         String input1 = JOptionPane.showInputDialog("What's the Initial Velocity");
         //If user presses Cancel or Close.
         if(input1 == null){
            System.out.println("Application closed, for later use restart application.");
            System.exit(0);
         }
         else
            initialVelocity = new Double(input1).doubleValue();
      }
      //While accerelation is <= 0, repeat.
      //accerelation is 0 (accerelation is 0), program enters the loop.
      while(accerelation <= 0){
         String input2 = JOptionPane.showInputDialog("What's the Accerelation");
         //If user presses Cancel or Close.
         if(input2 == null){
            System.out.println("Application closed, for later use restart application.");
            System.exit(0);
         } 
         else
            accerelation = new Double(input2).doubleValue();
      }
   }
   
   public double returnDistance(int time){
      double distance = time * (initialVelocity + (1.0/2.0) * accerelation * time);
      return distance;
   }   
}