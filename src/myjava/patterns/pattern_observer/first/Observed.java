package patterns.pattern_observer.first;

public interface Observed {
	public void addObserver(Observer observer);
	public void removeObserver (Observer observer);
	public void notifyObservers();

}
