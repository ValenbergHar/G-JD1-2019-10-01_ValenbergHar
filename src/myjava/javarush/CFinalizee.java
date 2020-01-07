package javarush;
public class CFinalizee {
	//https://javarush.ru/groups/posts/1930-zhiznennihy-cikl-obhhekta-

   private String name;

   public CFinalizee(String name) {
       this.name = name;
   }

   public CFinalizee() {
   }

   public static void main(String[] args) throws Throwable {

       for (int i = 0 ; i < 1000000; i++) {

           CFinalizee cat = new CFinalizee();
           cat = null;//вот здесь первый объект становится доступен сборщику мусора
       }
   }

   @Override
   protected void finalize() throws Throwable {
       System.out.println("Объект Cat уничтожен!");
   }
}