class Rectangle{
     int l;
     int b;
     Rectangle(){
         l = 0;
         b = 0;
     }
     Rectangle(int x){
         l = x;
         b = x;
     }
     Rectangle(int x, int y){
         l = x;
         b = y;
     }
     void display(){
         System.out.println("Length is "+l);
         System.out.println("Breadth is "+b);
     }
 }
 class Test_Rect{
     public static void main(String[] args) {
         Rectangle r1 = new Rectangle();
         Rectangle r2 = new Rectangle(3,4);
         Rectangle r3 = new Rectangle(5);
         r1.display();
         r2.display();
         r3.display();
     }
 }