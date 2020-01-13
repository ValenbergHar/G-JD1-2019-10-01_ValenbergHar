package javarush;
public class StackTrace2 {
    public static void main(String[] args) {
        method1();
    }

    public static String method1()
    {
        method2();
        //Напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[0].getMethodName();
        
        return name;
    }

    public static String method2()
    {
        method3();
        //Напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        
        return name;
    }

    public static String method3()
    {
        method4();
        //Напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        
        return name;
    }

    public static String method4()
    {
        method5();
        //        Напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        
        return name;
    }

    public static String method5()
    {
        //Напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            String name = stackTraceElements[2].getMethodName();
        
        return name;


    }
}

//[2] потому что:
//[0] - трейс
//[1] - сам метод
//[2] - метод вызвавший метод с индексом [1]
//[3] - метод вызвавший метод с индексом [2], который вызвал метод с индексом [1] и т.д.


//Для тех, кто как и я в начале ничего не понял=)
//StackTrace нужен для отыскивания ошибки в коде.
//Обратимся к строчке по созданию StackTrace и разберем ее поэлементно:
//StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//
//*StackTraceElement[]* - указание на тип массива(помните ранее мы уже проходили массивы типа int[], 
//		String[], вот тут тоже самое ).
//*stackTraceElements* - имя массива, может быть любым с учетом общих правил наименования на работу 
//эту не влияет (в начале нельзя ставить цифры, из специфических символов только $ and ~ и т.д.)
//*Thread.currentThread()* - получение ссылки на текущий поток, в котором выполняются методы, которые 
//мы хотим отследить(не думаю, что это важно на данном этапе, просто нужно запомнить, как пишется)
//*getStackTrace()* - получаем весь стэк вызываемых методов(аналогично, не думаю, что это важно на 
//		данном этапе, просто нужно запомнить, как пишется)
//
//После исполнения этой строки у нас появится массив типа StackTraceElement[] с именем StackTraceElement, 
//давайте посмотрим на его содержимое, если мы запустим его в методе main - 0 элементом будет сам StackTrace, 
//а 1 элементом метод мэйн. Стэктрейс всегда будет нулевым так как он запустился последним. 
//Для понимания этой части нужно при помощи методов .getClassName() и .getMethodName() 
//(о них я расскажу в абзаце ниже)поиграться в компиляторе с первой задачей, вы все поймете.
//Теперь посмотрим, чем нам может быть полезен созданный массив. Мы понимаем, что в массиве 
//хранится инфа о выполненных методах. При помощи конструкции StackTrace[0].getClassName() 
//мы узнаем в каком классе был запущен, а при помощи StackTrace[0].getMethodName() мы получим
//имя метода, хранящегося в 0 массиве StackTrace и мы получим getStackTrace. Есть и другие 
//методы для элементов массива, например StackTrace[0].getLineNumber() для получения номера
//строки метода, ссылка на который хранится в нулевом элементе массива.