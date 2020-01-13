package javarush;

import java.util.ArrayList;

public class ObjectFairyTail {
    public static LittleRedRidingHood hood = new LittleRedRidingHood();
    public static Grandmother grandmother = new Grandmother();
    public static Patty patty = new Patty();
    public static Woodman woodman = new Woodman();
    public static Wolf wolf = new Wolf();

    public static void main(String[] args) {
        // напишите тут ваш код
       wolf.ate.add(grandmother); 
       wolf.ate.add(hood);
       woodman.killed.add(wolf);   
       grandmother.ate.add(patty);

        // напишите тут ваш код
    }

    //красная шапочка
    public static class LittleRedRidingHood extends StoryItem {
    }

    //бабушка
    public static class Grandmother extends StoryItem {
    }

    //пирожек
    public static class Patty extends StoryItem {
    }

    //дровосек
    public static class Woodman extends StoryItem {
    }

    //волк
    public static class Wolf extends StoryItem {
    }

    public static abstract class StoryItem {
        public ArrayList<StoryItem> killed = new ArrayList<StoryItem>();
        public ArrayList<StoryItem> ate = new ArrayList<StoryItem>();
    }
}