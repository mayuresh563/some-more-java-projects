import java.util.Scanner;
public class NumberToWords1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();
        int tem;
        int m;
        int i;
        int count = 0;
        m = n;
        while(m != 0)
        {
             count++;
             m = m/10;
        }
        String name[] = new String[count];
        i = 0;
        while(n != 0){
            tem = n % 10;
            n = n/10;
        switch(tem){
            case 0 : name[i] = "Zero";
                break;
            case 1 : name[i] = "One";
                break;
            case 2 : name[i] = "Two";
                break;
            case 3 : name[i] = "Three";
                break;
            case 4 : name[i] = "Four";
                break;
            case 5 : name[i] = "Five";
                break;
            case 6 : name[i] = "Six";
                break;
            case 7 : name[i] = "Seven";
                break;
            case 8 : name[i] = "Eight";
                break;
            case 9 : name[i] = "Nine";
                break;   
               }
               i++;
        scan.close();
          }
          for (i=count; i>=0; i--){
               System.out.println(name[i]+"\t");
          }
     }
}