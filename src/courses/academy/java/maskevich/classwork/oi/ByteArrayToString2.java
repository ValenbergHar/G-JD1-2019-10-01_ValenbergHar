package by.academy.java.maskevich.classwork.oi;

public class ByteArrayToString2 {

	public static void main(String[] args) {
		final byte[] byteArray = { 0x48, 0x65, 0x6C, 0x6C, 0x6F, 0x2C, 0x77,0x6F, 0x72, 0x6C, 0x64, 0x21 };
		final String strIntegers = new String(byteArray);
		System.out.println(strIntegers);

	}

}
