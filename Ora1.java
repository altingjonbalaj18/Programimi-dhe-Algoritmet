import javax.swing.*;
import java.awt.*;
import java.util.*; 

public class Ora1 extends JPanel{
   public Ora1(){
        JFrame frame = new JFrame();
        int w = 300;
        frame.setSize(300,300);
        frame.setTitle("Ora");
        frame.setVisible(true);
        frame.getContentPane().add(this);
    }
    public void paintComponent(Graphics g){
       g.setColor(Color.white);
       g.fillRect(0,0,300,300);
       g.setColor(Color.black);
       g.drawOval(50, 50, 200 , 200);
       g.setColor(Color.red);
       g.fillArc(55,55,190,190,150,5);
       g.setColor(Color.blue);
       g.fillArc(70,70,160,160,90,5); 
    }public static void main(String [] a){
      new Ora1();
    }
}
