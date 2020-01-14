package javarush;
public class IntegersDifferentThings {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        float c =  (float) ((a*1.0) / b);
        double d = a * 1e-3 + c;
        System.out.println(c);
        
        int m = (byte)(b + a*8+3);
        System.out.println(d);
        System.out.println(m);
        
        short number = 9;
        char zero = '0';
        int nine = (zero+number);
        int nine1 = (zero+number);
        
        System.out.println(nine);
        System.out.println((char)nine1);
        
        int a1 = (byte) 44;
        int b1 = (byte) 300;
        short c1 = (byte) (b1 - a1);
        System.out.println(c1);
        
         int a2 = (byte)44;
        int b2 = (short)300;
        short c2 = (short) (b2 - a2);
        System.out.println(c2);
        
        System.out.println("____________");
        
        long l = (byte) 1234_564_890L;
        int x = (byte) 0b1000_1100_1010;
        double h = (byte) 110_987_654_6299.123_34;
        float f = (byte) l++ + 10 + ++x - (float) h;
        l = (long) f / 1000;
        System.out.println(l);
        
        
    }
}
