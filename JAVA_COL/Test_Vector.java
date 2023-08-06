class Vector{
     int i, j,k;
     Vector(){
          i = 0;
          j = 0;
          k = 0;
     }
     Vector(int x, int y, int z){
          i = x;
          j = y;
          k = z;
     }
     Vector(int x){
          i = x;
          j = x;
          k = x;
     }
     void display(){
         System.out.println("Value of i "+i); 
         System.out.println("Value of j "+j); 
         System.out.println("Value of k "+k); 
     }
}
class Test_Vector{
     public static void main(String[] args) {
          Vector v1 = new Vector(3,4,5);
          Vector v2 = new Vector(6);
          Vector v3 = new Vector();
          v1.display();
          v2.display();
          v3.display();
     }
}