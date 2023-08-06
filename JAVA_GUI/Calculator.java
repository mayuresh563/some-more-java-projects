import java.awt.*;

public class Calculator extends Frame
{
     Label l1,l2,l3;
     TextField t1,t2,t3;
     Button b1,b2,b3,b4,b5;

     Calculator()
     {
          l1 = new Label("1st No.");
          l2 = new Label("2nd No.");
          l3 = new Label("3rd No.");
          t1 = new TextField(10);
          t2 = new TextField(10);
          t3 = new TextField(10);
          b1 = new Button("+");
          b2 = new Button("-");
          b3 = new Button("*");
          b4 = new Button("/");
          b5 = new Button("Clear");

          setLayout(new GridLayout(6,2));

          add(l1);
          add(t1);
          add(l2);
          add(t2);
          add(l3);
          add(t3);
          add(b1);
          add(b2);
          add(b3);
          add(b4);
          add(b5);
          setSize(400,400);
          setVisible(true);
     }
     public static void main(String[] args) 
     {
          Calculator cal = new Calculator();
     }
}