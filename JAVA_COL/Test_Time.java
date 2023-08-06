class Time {
     int h, m, s;
     Time(){
          h = 0;
          m = 0;
          s = 0;
     }
     Time(int a, int b, int c){
          h = a;
          m = b;
          s = c;
     }
     Time(int a){
          h = a;
          m = a;
          s = a;
     }
     void display(){
          System.out.println("Hours "+h);
          System.out.println("Minutes "+m);
          System.out.println("Seconds "+s);
     }
}
class Test_Time{
     public static void main(String[] args) {
          Time t1 = new Time(5,6,7);
          Time t2 = new Time(6);
          Time t3 = new Time();
          t1.display();
          t2.display();
          t3.display();
     }
}