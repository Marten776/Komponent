/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package komponenty;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JButton;
import javax.swing.JPanel;
        
/**
 *
 * @author Adam
 */
public class Komponent extends JPanel {
 int x = 0, y = 100;
 String str="ZOSTAŃ W DOMU";
 Font czcionka = new Font("Arial", Font.BOLD,100);
 private JButton button;

 public void paint(Graphics g) { 

 super.paint(g);
 Graphics2D g2 = (Graphics2D) g;
 g2.setFont(czcionka);
 g2.setColor(Color.red);
 g2.drawString(str,x,y);

 try {
  Thread.sleep(100);
} catch(Exception ex) {
}
 x+=10;
 if(x>this.getWidth()) {
   x=-800;
}
 repaint();
}

}