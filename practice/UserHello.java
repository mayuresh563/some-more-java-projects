import java.util.Scanner;

public class UserHello{
    public static void main(String[] args) {
        System.out.println("What is your name : ");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello "+name+" have a good day!");
        scan.close();
    }
}