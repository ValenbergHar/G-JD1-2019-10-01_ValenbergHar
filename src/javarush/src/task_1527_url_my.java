<<<<<<< HEAD
import java.util.LinkedHashMap;
import java.util.Scanner;

public class task_1527_url_my {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();

        String param = url.substring(url.indexOf("?")+1);
        System.out.println(param);

        String[] kv = param.split("&");

        LinkedHashMap<String, String> parametrs = new LinkedHashMap<>();
        for(int i =0; i<kv.length; i++){
            int equals = kv[i].indexOf("=");
            if(equals<0){
                parametrs.put(kv[i], null);
                continue;
            }

            String key = kv[i].substring(0, equals);
            String value = kv[i].substring(equals+1);
            parametrs.put(key, value);

        }

    }

=======
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
>>>>>>> dce3f196f66f3675a9824cf0452c6eec4bb2bbef
}
