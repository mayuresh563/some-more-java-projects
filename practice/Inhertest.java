class Room {
          int l,b;
          Room(int x, int y){
               l = x;
               b = y;
          }
          int area(){
               return (l*b);
          }
     }
     class BedRoom extends Room{
          int h;
          BedRoom(int x,int y,int z){
               super(x, y);
               h = z;
          }
          int volume(){
               return (l * b * h);
          }
     }
     class Inhertest{
     public static void main(String[] args) {
          BedRoom room1 = new BedRoom(14, 12, 10);
          int area1 = room1.area();
          int volume1 = room1.volume();
          System.out.println("Area1 = "+ area1);
          System.out.println("Volume1 = "+ volume1);
     }
}