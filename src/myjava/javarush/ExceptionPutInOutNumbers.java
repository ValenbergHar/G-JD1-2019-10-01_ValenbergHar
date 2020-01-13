package javarush;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPutInOutNumbers {
    public static void main(String[] args) {
     
            readData();
    }
 public static void readData() {
    //напишите тут ваш код
    ArrayList<Integer> list = new ArrayList<Integer>();
    Scanner scanner = new Scanner(System.in);
    try {
        while (true){
        list.add(scanner.nextInt());
        }
    } catch (InputMismatchException ex) {
        for ( int n : list )
        {
            System.out.println( n );
        }
    }
}
}