import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class OutputView extends JPanel implements ActionListener{
   InputView input = new InputView();
   public static int time;
   private double distance;
   JButton nextSecond = new JButton("Next Second");
   JButton quit = new JButton("Quit");
   public OutputView(){
      
      JFrame frame = new JFrame("Auto");
      nextSecond.setBounds(0,0,400,30);
      quit.setBounds(0,30,400,30);
      
      nextSecond.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                time++;
                repaint();
            }
        });

      quit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
      
      frame.add(nextSecond);
      frame.add(quit);
      
      frame.setSize(400, 400);
      frame.getContentPane().add(this);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   } 
   
   @Override
   public void actionPerformed(ActionEvent a){
   }
   
   public void paintComponent(Graphics g){
      g.setColor(Color.black);
      switch(time){
         case 1 : 
            distance = input.returnDistance(time);
            g.drawString("------------------------------------------------------------------------------------------------", 0, 75);
            g.drawString("| " + time + " s ---- " + distance + " m |", 0 ,  70 + 20 * time);
            break;
         case 2 :
            distance = input.returnDistance(time);
            g.drawString("| " + time + " s -------- " + distance + " m |", 0 , 70 + 20 * time);
            break;
         case 3 :
            distance = input.returnDistance(time);
            g.drawString("| " + time + " s ------------ " + distance + " m |", 0 , 70 + 20 * time);
            break;
         case 4 :
            distance = input.returnDistance(time);
            g.drawString("| " + time + " s ---------------- " + distance + " m |", 0 , 70 + 20 * time);
            break;
         case 5 :
            distance = input.returnDistance(time);
            g.drawString("| " + time + " s -------------------- " + distance + " m |", 0 , 70 + 20 * time);
            break;
         case 6 :
            distance = input.returnDistance(time);
            g.drawString("| " + time + " s ------------------------ " + distance + " m |", 0 , 70 + 20 * time);
            break;
         case 7 :
            distance = input.returnDistance(time);
            g.drawString("| " + time + " s ---------------------------- " + distance + " m |", 0 , 70 + 20 * time);
            break;
         case 8 :
            distance = input.returnDistance(time);
            g.drawString("| " + time + " s -------------------------------- " + distance + " m |", 0 , 70 + 20 * time);
            break;
         case 9 :
            distance = input.returnDistance(time);
            g.drawString("| " + time + " s ------------------------------------ " + distance + " m |", 0 , 70 + 20 * time);
            break;
         case 10 :
            distance = input.returnDistance(time);
            g.drawString("| " + time + " s ---------------------------------------- " + distance + " m |", 0 , 70 + 20 * time);   
            break;
         case 11 :
            distance = input.returnDistance(time);
            g.drawString("| " + time + " s -------------------------------------------- " + distance + " m |", 0 , 70 + 20 * time);
            break;
         case 12 :
            distance = input.returnDistance(time);
            g.drawString("| " + time + " s ------------------------------------------------ " + distance + " m |", 0 , 70 + 20 * time);
            break;
         case 13 :
            distance = input.returnDistance(time);
            g.drawString("| " + time + " s ---------------------------------------------------- " + distance + " m |", 0 , 70 + 20 * time);
            break;
         case 14 :
            distance = input.returnDistance(time);
            g.drawString("| " + time + " s -------------------------------------------------------- " + distance + " m |", 0 , 70 + 20 * time);
            break;
      }        
   } 
}