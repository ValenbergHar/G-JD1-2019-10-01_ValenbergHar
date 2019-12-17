package by.academy.java.maskevich.homework.task4.task43;

public class TextBuilder {
	public static void main(String[] args) {
		Word word1 = new Word("header");
		Text text = new Text(word1);

		Word word2 = new Word("This");
		Word word3 = new Word("is");
		Word word4 = new Word("a");
		Word word5 = new Word("body");

		Sentence sentence = new Sentence();
		sentence.addWord(word2);
		sentence.addWord(word3);
		sentence.addWord(word4);
		sentence.addWord(word5);

		text.addBody(sentence);

		System.out.println("Head: " + text.getHeader());
		System.out.println("Body: " + text.getBody());

	}
}
