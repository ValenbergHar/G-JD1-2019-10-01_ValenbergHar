public class task_1524_static {
    static {
        init();
    }
    public static void init() {
        System.out.println("static void init()");
    }
    static {
        System.out.println("Static block");
    }
    {
        System.out.println("Non-static block");
        printAllFields(this);
    }

    public int i = 6;
    public String name = "First name";
    public task_1524_static() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }
    public static void main(String[] args) {
        System.out.println("public static void main");
        task_1524_static s = new task_1524_static();
    }

    public static void printAllFields(task_1524_static obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.i);
        System.out.println(obj.name);

    }
}


