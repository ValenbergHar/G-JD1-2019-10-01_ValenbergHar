package by.academy.java.maskevich.homework.task4;
 
 
import java.util.Scanner;
public class AtmMachine {
    private static Scanner in;
    private static float balance = 0;
    private static int anotherTransaction;
    private static String storedPin = "1234";
    private static String userInputPin;
    public static void main(String args[]) {
        in = new Scanner(System.in);
        checkPIN();
    }
    
    private static void checkPIN1() {
        System.out.println("please enter PIN");
        userInputPin = in.nextLine();
    }
    private static void checkPIN() {
        for (int i = 2; i > 1; i--) {
            checkPIN1();
            if (!userInputPin.contentEquals(storedPin)) {
                System.out.printf("\nincorrect PIN! please, put right PIN. You have %d attempt(s)", i);
                checkPIN1();
                if (!userInputPin.contentEquals(storedPin)) {
                    continue;
                }
                
//                System.out.printf("\n Your card blocked!");
//                break;
            } else {
                transaction();
            }
        }
    }
    private static void transaction() {
        int choice;
        System.out.println("Please select an option");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Balance");
        choice = in.nextInt();
        switch (choice) {
        case 1:
            float amount;
            System.out.println("Please enter amount to withdraw: ");
            amount = in.nextFloat();
            if (amount > balance || amount == 0) {
                System.out.println("You have insufficient funds\n\n");
                anotherTransaction();
            } else {
                balance = balance - amount;
                System.out.println("You have withdrawn " + amount + " and your new balance is " + balance + "\n");
                anotherTransaction();
            }
            break;
        case 2:
            float deposit;
            System.out.println("Please enter amount you would wish to deposit: ");
            deposit = in.nextFloat();
            balance = deposit + balance;
            System.out.println("You have deposited " + deposit + " new balance is " + balance + "\n");
            anotherTransaction();
            break;
        case 3:
            System.out.println("Your balance is " + balance + "\n");
            anotherTransaction();
            break;
        default:
            System.out.println("Invalid option:\n\n");
            anotherTransaction();
            break;
        }
    }
    private static void anotherTransaction() {
        System.out.println("Do you want another transaction?\n\nPress 1 for another transaction\n2 To exit");
        anotherTransaction = in.nextInt();
        if (anotherTransaction == 1) {
            transaction();
        } else if (anotherTransaction == 2) {
            System.out.println("Thanks for choosing us. Good Bye!");
        } else {
            System.out.println("Invalid choice\n\n");
            anotherTransaction();
        }
    }
}
 