import java.io.*;

public class task_1319 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = null;

            name = reader.readLine();

        BufferedWriter writer = null;
        BufferedReader reader1;
        try {
            writer = new BufferedWriter(new FileWriter(name));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            while (true) {
                String text = reader.readLine();
                if (text.equals("exit")) {
                    //writer.write(text);
                   reader1=new BufferedReader(new FileReader(name));
                    String c;
                    while ((c=reader1.readLine())!=null){
                          System.out.println(c);
                    }
                   reader1.close();
                    break;
                }
                writer.write(text);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            reader.close();
            writer.close();


        }
    }


}

