class Point {
     int x, y;
     Point(){
          x = 0;
          y = 0;
     }
     Point(int a, int b){
          x = a;
          y = b;
     }
     Point(int a){
          x = a;
          y = a;
     }
     void display(){
          System.out.println("Position of Point X-axis "+x);
          System.out.println("Position of Point Y-axis "+y);
     }
}
class Test_Point{
     public static void main(String[] args) {
          Point p1 = new Point();
          Point p2 = new Point(2,3);
          Point p3 = new Point(1);
          p1.display();
          p2.display();
          p3.display();
     }
}