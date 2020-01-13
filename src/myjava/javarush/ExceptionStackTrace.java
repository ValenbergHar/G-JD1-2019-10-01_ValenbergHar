package javarush;
public class ExceptionStackTrace {
    
    public static void divideByZero()  throws ArithmeticException{
    System.out.println(5 / 0);
    }
    

    public static void main(String[] args) {
        try
        {
            divideByZero(); 
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();
        }
    }
}