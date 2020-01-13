package javarush;

public class Static {
	public static int A = 5;
	public static int B = 2 * A;
	public int C = A * B;
	public static int D = A * B;

	public static void main(String[] args) {
		Static room = new Static();
		room.A = 5;

		Static.D = 5;
	}

	public int getA() {
		return A;
	}

}