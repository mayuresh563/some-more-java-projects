import java.awt.*;

public class House extends Frame
{
     public void paint(Graphics g)
     {
          Color blue = new Color(128,128,255);
          Color brown = new Color(165,42,42);
          Color beige = new Color(255,255,170);
          Color green = new Color(0,255,20);
          
          Polygon base;
          int x[]={200,400,400,200};
          int y[]={200,200,400,400};
          base = new Polygon(x, y, 4);
          g.setColor(blue);
          g.fillPolygon(base);

          Polygon roof;
          int a[]={150,300,450};
          int b[]={200,85,200};
          roof = new Polygon(a, b, 3);
          g.setColor(brown);
          g.fillPolygon(roof);
          
          Polygon door;
          int c[]={250,350,350,250};
          int d[]={285,285,400,400};
          door = new Polygon(c, d, 4);
          g.setColor(beige);
          g.fillPolygon(door);

          Polygon plat;
          int e[]={100,500,500,100};
          int f[]={400,400,500,500};
          plat = new Polygon(e, f, 4);
          g.setColor(green);
          g.fillPolygon(plat);
     }
     public static void main(String[] args) {
          House h = new House();
          h.setSize(700,800);
          h.setVisible(true);
     }
}