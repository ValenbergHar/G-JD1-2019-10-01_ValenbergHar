package by.academy.java.maskevich.classwork.lesson05;

public class StaticTest {
private static int staticField;
private int nonStaticField;

public static void main(String[] args) {
doStatic();
// doNonStatic();

System.out.println(staticField);
// System.out.println(nonStaticField);


StaticTest objectInstance = new StaticTest();
System.out.println(objectInstance.nonStaticField);
System.out.println(objectInstance.staticField);
objectInstance.doStatic();
objectInstance.doNonStatic();
}

private static void doStatic() {
}

private void doNonStatic() {
}
}


