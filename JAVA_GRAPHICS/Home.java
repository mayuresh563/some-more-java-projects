import java.awt.*;

public class Home extends Frame {
     public void paint(Graphics window) {
        window.setColor(Color.BLUE);
        window.drawRect(250, 300, 50, 125);
        window.fillRect(350, 300, 50, 135);
        window.setColor(Color.PINK);
        window.drawRect(200, 150, 350, 300);
        window.fillRect(200, 150, 350, 300);
        window.setColor(Color.GREEN);
        Polygon poly = new Polygon();
        poly.addPoint(100, 200);
        poly.addPoint(200, 400);
        poly.addPoint(300, 200);
        window.fillPolygon(poly);
    }
    public static void main(String[] args) {
         Home h = new Home();
         h.setSize(700,800);
         h.setVisible(true);
    }
}