package src;
import javax.swing.*;

class Password{
   protected void password(String password){
      if(password.equals("altingjonbalaj"))
         JOptionPane.showMessageDialog(null, "Access Granted");
      else
         JOptionPane.showMessageDialog(null, "Wrong password");
      
   }
}
         