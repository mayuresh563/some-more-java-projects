import java.io.*;
public class FileStream_ByteArrayOutput {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream bOutput = new ByteArrayOutputStream(12);
        while (bOutput.size() != 10){
            bOutput.write(System.in.read());
        }
        byte b[] = bOutput.toByteArray();
        System.out.println("Print the content");
        for (int x = 0; x < b.length; x++){
            System.out.println((char)b[x] + "  ");
        }
        System.out.println("  ");
        int c;
        ByteArrayInputStream bInput = new ByteArrayInputStream(b);
        System.out.println("Converting character to Upper Case ");
        for (int y = 0; y < 1; y++){
            while((c=bInput.read())!= -1){
                System.out.println(Character.toUpperCase((char)c));
            }
            bInput.reset();
        }
    }
}
