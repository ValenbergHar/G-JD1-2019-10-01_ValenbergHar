package by.academy.java.maskevich.homework.task4.task43;
public class Sentence {
    private String sentence="";
    public void addWord(Word word) {
        sentence =  sentence+ " " + word.getWord();
    }
    public String getValue() {
        return sentence;
    }
}