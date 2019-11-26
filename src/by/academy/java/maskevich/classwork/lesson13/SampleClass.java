package by.academy.java.maskevich.classwork.lesson13;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SampleClass {
	private static final SimpleDateFormat FORMATTER = new SimpleDateFormat("hh:mm:ss");

	private static String now() {
		return FORMATTER.format(new Date());
	}

	private static void pause5seconds(String methodName) {
		System.out.printf("%s %s start: %s\n", now(), Thread.currentThread().getName(), methodName);
		long currentTimeMillis = System.currentTimeMillis();
		
		while (true) {
			if (System.currentTimeMillis() - currentTimeMillis > 5000) {
				break;
			}
		}
		System.out.printf("%s %s end: %s\n", now(), Thread.currentThread().getName(), methodName);
	}

	public static void main(String[] args) throws InterruptedException {
		callMethodThenOthers(4); // try for all cases from 1 to 6 and investigate results
	}

	/**
	 * Runs 6 threads to execute all methods of the sample class. Specified (in
	 * parameter) method will be executed first with delay to be sure that it will
	 * acquire all necessary resources.
	 *
	 * @param firstMethodIndex
	 * @throws InterruptedException
	 */
	private static void callMethodThenOthers(int firstMethodIndex) throws InterruptedException {
		System.out.println("run test with first executed method test" + firstMethodIndex);
		SampleClass objectInstance = new SampleClass();
		runInNewThread(firstMethodIndex, objectInstance);
		Thread.sleep(1000);
		for (int j = 1; j <= 6; j++) {
			if (j == firstMethodIndex) {
				continue;
			}
			runInNewThread(j, objectInstance);
			Thread.sleep(1);
		}
	}

	/**
	 * Executes the specified method in new Thread.
	 *
	 * @param methodIndex    will be used to build the method name like
	 *                       test{methodIndex}
	 * @param objectInstance instance of the sample class to be used as execution
	 *                       context
	 */
	private static void runInNewThread(int methodIndex, SampleClass objectInstance) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				Method method;
				try {
					method = SampleClass.class.getMethod("test" + methodIndex);
					method.invoke(objectInstance);
				} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
						| InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}, "Thread" + methodIndex).start();
	}

	public void test1() {
		pause5seconds("test1[no sync]");
	}

	public static void test2() {
		pause5seconds("test2[no sync]");
	}

	public synchronized void test3() {
		pause5seconds("test3[sync non static method. monitor=this object]");
	}

	public synchronized static void test4() {
		pause5seconds("test4[sync static method. monitor=this class]"); // sync using monitor='this'
	}

	public void test5() {
		synchronized (this) {
			pause5seconds("test5[sync block. monitor=this object]");
		}
	}

	public void test6() {
		synchronized (getClass()) {
			pause5seconds("test6[sync block. monitor=this class]");
		}
	}
}