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

}
