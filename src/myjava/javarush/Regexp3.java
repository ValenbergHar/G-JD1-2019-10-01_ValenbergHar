package javarush;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp3 {

	public static void main(String[] args) {
		String textString = "dxgbxfgb dfsgbfsdg ghgh dfgs@gmail.com zdfgdfggh fhjfgj dfsd@tut.by zsdfdsaf gfjfhj";
		Pattern email = Pattern.compile("(\\w+)@(gmail|tut)\\.(com|by)");
		Matcher matcher = email.matcher(textString);
		
		while(matcher.find()) {
			System.out.println(matcher.group(1));
		}
	}

}
