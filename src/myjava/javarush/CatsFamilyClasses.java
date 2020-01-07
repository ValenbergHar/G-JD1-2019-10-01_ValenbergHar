package javarush;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class CatsFamilyClasses {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String ded = reader.readLine();
        Cat catded = new Cat(ded,null, null);

        String bab = reader.readLine();
        Cat catbab = new Cat(bab,null, null);

        String papa = reader.readLine();
        Cat catpapa = new Cat(papa,null, catded);

        String mama = reader.readLine();
        Cat catmama = new Cat(mama, catbab, null);

        String sin = reader.readLine();
        Cat catsin = new Cat(sin,catmama, catpapa);

        String doci = reader.readLine();
        Cat catdoci = new Cat(doci,catmama, catpapa);


        System.out.println(catded);
        System.out.println(catbab);
        System.out.println(catpapa);
        System.out.println(catmama);
        System.out.println(catsin);
        System.out.println(catdoci);
    }

    public static class Cat {
        private String name;
        private Cat mama;
        private Cat papa;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mama, Cat papa) {
            this.name = name;
            this.mama = mama;
            this.papa = papa;
        }

        @Override
        public String toString() {
            return "The cat's name is " + name + ", " +
                    (mama != null ? "mother is " + mama.name : "no mother") + ", " +
                    (papa != null ? "father is " + papa.name : "no father");
        }
    }

}
