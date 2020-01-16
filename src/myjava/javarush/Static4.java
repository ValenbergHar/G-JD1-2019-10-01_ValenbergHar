package javarush;
public class Static4
{
    public int A = 5;
    public static int B = 5;
    public static int C = 5;
    public static int D = 5;

    public static void main(String[] args)
    {
        Static4 solution = new Static4();
        solution.A = 5;
        solution.B = 5 * B;
        solution.C = 5 * C * D;
        Static4.D = 5 * D * C;

        Static4.D = 5;
    }

    public int getA()
    {
        return A;
    }

}
