import java.awt.*;

public class Sun extends Frame
{
     public void paint(Graphics g)
     {
          Color yellow = new Color(255,242,0);

          g.setColor(yellow);
          g.fillOval(150, 150, 450, 450);
     }
     public static void main(String[] args) {
          Sun s = new Sun();
          s.setSize(700,700);
          s.setVisible(true);
     }
}
