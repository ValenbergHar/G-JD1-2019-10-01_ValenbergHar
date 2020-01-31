package javarush;
public class AbstractWithStatic {
    public static void main(String[] args) throws Exception {
        EnglishTranslator englishTranslator = new EnglishTranslator();
        System.out.println(englishTranslator.translate());
    }
    
    public static class EnglishTranslator extends Translator{
        public  String getLanguage(){
            return "английского";
        }
    }

    public static abstract class Translator {
        public abstract String getLanguage();

        public String translate() {
            return "Я переводчик с " + getLanguage();
        }
    }

}