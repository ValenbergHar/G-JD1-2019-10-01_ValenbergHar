package patterns.pattern_observer.first;

public class JobSearch {

	public static void main(String[] args) {
JavaDevJavaSite site = new JavaDevJavaSite();
site.addVacancy("First Java Position");
site.addVacancy("Second Java Position");

Observer firstSubscriber = new Subscriber("Pucin");
Observer secondSubscriber = new Subscriber("Luka");

site.addObserver(firstSubscriber);
site.addObserver(secondSubscriber);

site.addVacancy("Third Java Position");
site.removeVacancy("First Java Position");
site.removeObserver(secondSubscriber);
site.addVacancy("Forth Java Position");



	}

}
