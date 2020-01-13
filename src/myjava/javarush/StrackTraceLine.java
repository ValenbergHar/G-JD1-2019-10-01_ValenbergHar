package javarush;

public class StrackTraceLine {
	public static void main(String[] args) throws Exception {
		method1();
	}

	public static int method1() {
		method2();
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		// line = stackTraceElements[2].getLineNumber();
		int l = 0;
		for (int i = 0; i < stackTraceElements.length; i++) {
			StackTraceElement element = stackTraceElements[i];
			int line = element.getLineNumber();
		    String className = element.getClassName();
		    String methodName = element.getMethodName();
		   String  message = className + ": " + methodName;
		   System.out.println(message + " " + line);
		}
		// System.out.println(line);
		return l;
	}

	public static int method2() {
		method3();
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		int l = 0;
		for (int i = 0; i < stackTraceElements.length; i++) {
			StackTraceElement element = stackTraceElements[i];
			int line = element.getLineNumber();
		    String className = element.getClassName();
		    String methodName = element.getMethodName();
		   String  message = className + ": " + methodName;
		   System.out.println(message + " " + line);
		}
		// System.out.println(line);
		return l;
	}

	public static int method3() {
		method4();
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		int l = 0;
		for (int i = 0; i < stackTraceElements.length; i++) {
			StackTraceElement element = stackTraceElements[i];
			int line = element.getLineNumber();
		    String className = element.getClassName();
		    String methodName = element.getMethodName();
		   String  message = className + ": " + methodName;
		   System.out.println(message + " " + line);
		}
		// System.out.println(line);
		return l;
	}

	public static int method4() {
		method5();
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		int l = 0;
		for (int i = 0; i < stackTraceElements.length; i++) {
			StackTraceElement element = stackTraceElements[i];
			int line = element.getLineNumber();
		    String className = element.getClassName();
		    String methodName = element.getMethodName();
		   String  message = className + ": " + methodName;
		   System.out.println(message + " " + line);
		}
		// System.out.println(line);
		return l;
	}

	public static int method5() {
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		int l = 0;
		for (int i = 0; i < stackTraceElements.length; i++) {
			StackTraceElement element = stackTraceElements[i];
			int line = element.getLineNumber();
		    String className = element.getClassName();
		    String methodName = element.getMethodName();
		   String  message = className + ": " + methodName;
		   System.out.println(message + " " + line);
		}
		// System.out.println(line);
		return l;
	}
}