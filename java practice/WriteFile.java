import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) throws IOException
    {
        FileWriter fw=new FileWriter("D:\\test\\test2.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("Hello World");
        System.out.println("Executed");
        bw.close();
    }
}
