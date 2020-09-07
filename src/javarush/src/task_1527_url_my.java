import java.util.HashMap;
import java.util.Scanner;

public class task_1527_url_my {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sc = scanner.nextLine();
        String scvut = sc.substring(sc.indexOf("?") + 1);
        System.out.println(scvut);

        String[] par = scvut.split("&");

        HashMap<String, String> kv = new HashMap<String, String>();
        for (int i = 0; i < par.length; i++) {
            int equals = par[i].indexOf("=");
            if (equals < 0) {
                kv.put(par[i], null);
                continue;
            }
            System.out.println(kv);
            String key = par[i].substring(0, equals);
            String value = par[i].substring(equals + 1);
            kv.put(key, value);
        }
        System.out.println(kv);
        
    }
}
