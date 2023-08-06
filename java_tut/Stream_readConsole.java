import java.io.*;
public class Stream_readConsole {
    public static void main(String[] args) throws IOException {
        InputStreamReader cin = null;
        try {
            cin = new InputStreamReader(System.in);
            System.out.println("Enter characters, 'q' to quit.");
            char c;
            do{
                c = (char) cin.read();
                System.out.println(c);
            }while(c != 'q');
        }finally{
            if (cin != null){
                cin.close();
            }
        }
    }
}
