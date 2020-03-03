package javarush;

import java.util.ArrayList;

public class ArrayListWithArray {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<int[]>();

        list.add(new int[]{ 1, 2, 3, 4, 5});
        list.add(new int[]{6, 7});
        list.add(new int[]{8, 9, 10, 11});
        list.add(new int[]{12, 13, 14, 15, 16, 17, 18});
        list.add(new int[0]);

        return list;

    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
