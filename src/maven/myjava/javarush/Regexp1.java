package javarush;

public class Regexp1 {

	public static void main(String[] args) {
		/*
		 * 
		 * RegExLib.com
		 * 
		 * 
		 * \\d one digit 
		 * 
		 * + - 1 and else   
		 * 0 and else 
		 * ? - 0 or 1 symbols before ( | ) -
		 * 
		 * [a-zA-Z] = \\w- all english letters 
		 * [abc] = (a|b|c) 
		 * [0-9] - \\d 
		 * [^sd] - all english letters beside after ^
		 * . - any symbol
		 * {2} 2 amount before (\\d{2})
		 * {2, 4} from 2 to 4  before (\\d{2, })
		 */
		String a = "-54";
		String b = "54";
		String c = "+54";

		System.out.println(a.matches("(\\+|-)?\\d*"));
		System.out.println(b.matches("(\\+|-)?\\d*"));
		System.out.println(c.matches("(\\+|-)?\\d*"));

		String d = "+ghhhh2hh333hhh444hhhhh55581581";
		System.out.println(d.matches("(\\+|-)?[a-zA-Z\\d]+\\d*"));
		
		
		String e = "avs";
		System.out.println(e.matches("[^abc]"));
		
		String url = "http://www.google.by";
		System.out.println(url.matches("http://www\\..+\\.(com|by)"));
		
		String rString = "1555552";
		System.out.println(rString.matches("\\d{3,}"));
	}

}
