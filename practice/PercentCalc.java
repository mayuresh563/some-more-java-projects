import java.util.Scanner;
public class PercentCalc{
    public static void main(String[] args) {
        System.out.println("Welcome to the program to calculate percentage of score");
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your marks of 1st sub: ");
        int sub1 = scan.nextInt();
        System.out.println("Enter your marks of 2nd sub: ");
        int sub2 = scan.nextInt();
        System.out.println("Enter your marks of 3rd sub: ");
        int sub3 = scan.nextInt();
        System.out.println("Enter your marks of 4th sub: ");
        int sub4 = scan.nextInt();
        System.out.println("Enter your marks of 5th sub: ");
        int sub5 = scan.nextInt();
        int totalMarks = sub1+sub2+sub3+sub4+sub5;
        System.out.println("The total marks in all subjects: "+totalMarks);
        float percent = 100*totalMarks/500;
        System.out.println("The percentage is : "+percent);
        scan.close();
    }
}
