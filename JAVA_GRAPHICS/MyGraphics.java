import java.awt.*;

public class MyGraphics extends Frame
{
	public void paint(Graphics g)
	{
		Color c=new Color(255,0,0);
		g.setColor(c);
		g.drawLine(10,10,100,100);
		g.drawRect(20,30,100,50);
		
		Polygon p;
		int x[]={100,200,300,40};
		int y[]={100,200,300,40};
		p=new Polygon(x,y,4);
		g.fillPolygon(p);

		Font f=new Font("Courier",Font.BOLD,36);
		g.setFont(f);
		g.drawString("Hello World",30,100);
	}

	public static void main(String args[])
	{
		MyGraphics m= new MyGraphics();
		m.setSize(300,400);
		m.setVisible(true);
	}
}

// MyGraphics.java
// Displaying MyGraphics.java.