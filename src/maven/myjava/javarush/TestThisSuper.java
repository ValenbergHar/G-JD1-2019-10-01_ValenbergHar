package javarush;
class A{

    A(){
        System.out.println(" онструктор без аргументов класса A");
    }

    A(String args){
        System.out.println(" онструктор с одним аргументом класса A");
    }
}

class B extends A{

   B(){
        this(""); // вызов конструктора с одним аргументом класса B
        System.out.println(" онструктор без аргументов класса B");
    }

   B(String args){
	   super(); // вызов конструктора с одним аргументом класса A
        System.out.println(" онструктор с одним аргументом класса B");
    }
}

// “ест-класс и вывод
public class TestThisSuper {

    public static void main(String args[]) {
       B b = new B();
    }

}