package javarush;
public class Overriden {
    public static void main(String[] args) throws Exception {
        System.out.println(SimpleObject.NAME);
        System.out.println(Button.NAME);
    }

    interface SimpleObject {
        String NAME = "SimpleObject";

        void onPress();
    }

    interface Button extends SimpleObject {
    	String NAME = "Simct";

        String onPress(Object o);
      

       

    }
}