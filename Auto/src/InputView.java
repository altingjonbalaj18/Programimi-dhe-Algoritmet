import javax.swing.*;

public class InputView{
   public static double initialVelocity;
   public static double accerelation;
   public InputView(){
      while(initialVelocity <= 0){
         String input1 = JOptionPane.showInputDialog("What's the Initial Velocity");
         
         if(input1 == null){
            System.out.println("Application closed, for later use restart application");
            System.exit(0);
         }
         else
            initialVelocity = new Double(input1).doubleValue();
      }
      while(accerelation <= 0){
         String input2 = JOptionPane.showInputDialog("What's the Accerelation");
         if(input2 == null){
            System.out.println("Application closed, for later use restart application");
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