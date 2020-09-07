import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class task_3119_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("txt.txt"));
        String c;
        while((c=reader.readLine())!=null){
            System.out.println(c);
        }
    }
}
