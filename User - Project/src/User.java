package src;
import javax.swing.*;

class User{
   public static void main(String[] a){
      String input = JOptionPane.showInputDialog("Username:");
      Username e = new Username();
      e.username(input);
   }
}