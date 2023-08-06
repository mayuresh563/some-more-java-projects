import java.awt.*;

public class Line extends Frame
{
     public void paint(Graphics paint)
     {
          paint.drawLine(20, 20, 100, 100);
     }
     public static void main(String[] args) {
          Line l = new Line();
          l.setSize(500,600);
          l.setVisible(true);
     }
}
