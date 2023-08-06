import java.awt.*;

public class Fish extends Frame
{
     public void paint(Graphics g)
     {
          Color orange = new Color(255,127,40);
          Color blue = new Color(100,100,255);
          Color white = new Color(255,255,255);
          Color black = new Color(0,0,0);
          
          Polygon tailfin;
          int a[]={550,640,640};
          int b[]={280,200,360};
          tailfin= new Polygon(a, b, 3);
          g.setColor(blue);
          g.fillPolygon(tailfin);
          
          Polygon fin;
          int c[]={425,425,300};
          int d[]={125,425,280};
          fin= new Polygon(c, d, 3);
          g.setColor(blue);
          g.fillPolygon(fin);
          
          // Body
          g.setColor(orange);
          g.fillOval(200, 200, 400, 160);
          
          // Eyes
          g.setColor(black);
          g.fillOval(260, 236, 18, 18);

          Polygon mouth;
          int e[]={180,280,180};
          int f[]={250,275,300};
          mouth = new Polygon(e, f,3);
          g.setColor(white);
          g.fillPolygon(mouth);
     }
     public static void main(String[] args) {
          Fish f = new Fish();
          f.setSize(700,700);
          f.setVisible(true);
     }
}
