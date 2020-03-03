package by.academy.java.maskevich.homework.task4.task43;
public class Text {
    private String header;
    private String body = "";
    public Text(Word word) {
        header = word.getWord();
    }
    public String getHeader() {
        return header;
    }
    public void addBody(Sentence sentence) {
        body = body + " " + sentence.getValue();
    }
    public String getBody() {
        return body;
    }
}