import java.util.Scanner;

public class IntOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number : ");
        System.out.println(scan.hasNextInt());
        scan.close();
    }
}
