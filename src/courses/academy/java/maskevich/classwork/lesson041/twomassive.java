package by.academy.java.maskevich.classwork.lesson041;

public class twomassive {

	public static void main(String[] args) {
		int[][]regular = new int [10] [20];
		regular [4][5] = 10;
		
		int[][] irregular = new int[][] {{1},{2,3},{4,5,6}};
		System.out.println("irregular [0][0]=" +irregular[0][0]);
		System.out.println("irregular [1][1]=" +irregular[1][1]);
		//System.out.println("irregular [1][2]=" +irregular[1][2]);
	}

}
