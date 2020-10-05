import java.io.*;

public class task_1826_encryption {
    public static void encryption(String fileRead, String fileReadEnc) throws IOException{
        byte b = 1;
        FileInputStream fis = new FileInputStream(fileRead);
        FileOutputStream fos = new FileOutputStream(fileReadEnc);
        while (fis.available() > 0) {
            byte[] fisb = new byte[fis.available()];
            byte[] fisbw = new byte[fisb.length];
            fis.read(fisb);

            for (int i = 0; i < fisb.length; i++) {
                fisbw[i] = (byte) (fisb[i] + b);
            }
            fos.write(fisbw);
        }
        fis.close();
        fos.close();

    }

    public static void decryption (String fileReadEnc, String fileWrite) throws IOException{
        byte b = 1;
        FileInputStream fis = new FileInputStream(fileReadEnc);
        FileOutputStream fos = new FileOutputStream(fileWrite);
        while (fis.available() > 0) {
            byte[] fisb = new byte[fis.available()];
            byte[] fisbw = new byte[fisb.length];
            fis.read(fisb);

            for (int i = 0; i < fisb.length; i++) {
                fisbw[i] = (byte) (fisb[i] - b);
            }
            fos.write(fisbw);
        }
        fis.close();
        fos.close();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String fileRead = bf.readLine();
        String fileReadEnc = bf.readLine();
        String fileWrite = bf.readLine();
        encryption(fileRead, fileReadEnc);
        decryption(fileReadEnc, fileWrite);
    }
}
