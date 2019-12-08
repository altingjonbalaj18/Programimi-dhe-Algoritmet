package src;
import javax.swing.*;

class Username{
   public final void username(String username){
      if(username.equals("altingjonbalaj")){
         String password = JOptionPane.showInputDialog("Enter your password");
         Password p = new Password();
         p.password(password);
      }
      else
         JOptionPane.showMessageDialog(null,"Your username does not exist");
   }
}
