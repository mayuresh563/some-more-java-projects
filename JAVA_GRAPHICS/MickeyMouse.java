import java.awt.*;

public class MickeyMouse extends Frame {

    public void paint(Graphics g) {
        Color black = new Color(0,0,0);
        Color white = new Color(255,255,255);

        g.setColor(black);
        g.fillOval(100, 100, 80, 80);
        g.fillOval(145, 155, 110, 110);
        g.fillOval(221, 100, 80, 80);
        g.setColor(white);
        g.fillOval(165, 181, 20, 30);
        g.fillOval(210, 181, 20, 30);
    }
    public static void main(String[] args) {
     MickeyMouse m = new MickeyMouse();
     m.setSize(700, 700);
     m.setVisible(true);
 }
}