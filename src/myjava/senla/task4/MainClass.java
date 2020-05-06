package senla.task4;



import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Enter the integer: ");

        try {
        	Scanner in = new Scanner(System.in);
    		int k = in.nextInt();
            System.out.printf("Word %s is %s", k, Program.isPalindrome(k) ? "palindrome" : "not palindrome");

        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}
