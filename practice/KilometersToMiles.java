import java.util.Scanner;

public class KilometersToMiles {
    public static void main(String[] args) {
        System.out.println("Enter the distance in kilometers : ");
        Scanner scan = new Scanner(System.in);
        double kilometers = scan.nextDouble();
        double miles = kilometers*0.621371;
        System.out.println("The distance in miles is: "+miles);
        scan.close();
    }
}
