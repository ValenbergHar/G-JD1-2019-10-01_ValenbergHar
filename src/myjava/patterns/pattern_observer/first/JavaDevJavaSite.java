package patterns.pattern_observer.first;

import java.util.ArrayList;
import java.util.List;

public class JavaDevJavaSite implements Observed {
	List<String> vacanties = new ArrayList<String>();
	List<Observer> subscribers = new ArrayList<Observer>();

	public void addVacancy(String vacancy) {
		vacanties.add(vacancy);
		notifyObservers();
	}

	public void removeVacancy(String vacancy) {
		this.vacanties.remove(vacancy);
		notifyObservers();
	}

	@Override
	public void addObserver(Observer observer) {
		this.subscribers.add(observer);
		notifyObservers();
	}

	@Override
	public void removeObserver(Observer observer) {
		this.subscribers.remove(observer);

	}

	@Override
	public void notifyObservers() {
		for (Observer observer : subscribers) {
			observer.handleEvent(this.vacanties);
		}
	}

}
