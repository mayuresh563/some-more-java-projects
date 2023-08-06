class Point3D{
     int x, y ,z;
     Point3D(){
          x = 0;
          y = 0;
          z = 0;
     }
     Point3D(int a, int b, int c){
          x = a;
          y = b;
          z = c;
     }
     Point3D(int a){
          x = a;
          y = a;
          z = a;
     }
     void display(){
          System.out.println("Position of Point X-axis "+x);
          System.out.println("Position of Point Y-axis "+y);
          System.out.println("Position of Point Z-axis "+z);
     }
}
class Test_Point3D{
     public static void main(String[] args) {
          Point3D p1 = new Point3D();
          Point3D p2 = new Point3D(2,3,4);
          Point3D p3 = new Point3D(1);
          p1.display();
          p2.display();
          p3.display();
     }
}