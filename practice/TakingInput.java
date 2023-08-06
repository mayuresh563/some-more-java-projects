import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input : ");
        Scanner scan = new Scanner(System.in);
        // System.out.println("Enter number 1: ");
        // int a = scan.nextInt();
        // float a = scan.nextFloat();
        // System.out.println("Enter number 2: ");
        // // int b = scan.nextInt();
        // float b = scan.nextFloat();
        // // int sum = a + b;
        // float sum = a + b;
        // System.out.println("The sum of the numbers is : ");
        // System.out.println(sum);
        
        // boolean b1 = scan.hasNextInt();
        // System.out.println(b1);
        // String str = scan.next();
        String str = scan.nextLine();
        System.out.println(str);
        scan.close();
    }
}