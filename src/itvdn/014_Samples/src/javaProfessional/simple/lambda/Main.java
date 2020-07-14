package javaProfessional.simple.lambda;

/**
 * Created by Yevhenii Tykhonov.
 */
public class Main {
    static int i = 20;
    public static void main(String[] args) {
        int i = 30;
        User user1 = new User() {
            @Override
            public void print(int i) {
//                int i = 20;
                System.out.println(i);
            }
        };

//        User user2 = (i) -> {
//            {
//                int i = 30;
                System.out.println(i);
//            }
//        };

//        long l1 = System.nanoTime();
//        User user1 = new User() {
//            @Override
//            public void print() {
//                System.out.println("Hello");
//            }
//        };
//        long l2 = System.nanoTime();
//
//        long l3 = System.nanoTime();
//        User user2 = () -> System.out.println("Hello");
//        long l4 = System.nanoTime();
//
//        System.out.println(l2 - l1);
//        System.out.println(l4 - l3);
//
//        System.out.println(user1);
//        System.out.println(user2);
    }
}

@FunctionalInterface
interface User {
    void print(int i);
}

