import javax.swing.*;
import java.awt.*;
import java.util.*;

class TestPanel extends JPanel{
   public void paintComponent(Graphics g){
       GregorianCalendar time = new GregorianCalendar();
       int minute = 90 - time.get(Calendar.MINUTE)*6;
       int hour = 90 - (time.get(Calendar.HOUR_OF_DAY) + time.get(Calendar.MINUTE)/60) * 30;
       g.setColor(Color.white);
       g.fillRect(0,0,300,300);
       g.setColor(Color.black);
       g.drawOval(50, 50, 200 , 200);
       g.setColor(Color.red);
       g.fillArc(70,70,160,160,hour,8);
       g.setColor(Color.blue);
       g.fillArc(55,55,190,190,minute,-5);
   }
}

public class TestFrame {
    public static void  main(String[] a){
        JFrame frame = new JFrame();
        TestPanel panel = new TestPanel();
        frame.getContentPane().add(panel);
        int w = 300;
        frame.setSize(300,300);
        frame.setTitle("Ora");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
