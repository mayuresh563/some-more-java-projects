import java.util.Scanner;

public class Calc3Nums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int num1 = scan.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = scan.nextInt();
        System.out.println("Enter number 3 : ");
        int num3 = scan.nextInt();
        int sum = num1+num2+num3;
        System.out.println("The sum of the input numbers is : "+sum);
        scan.close();
    }
}
