import java.util.HashSet;
import java.util.Set;

public class Observable {
	protected HashSet<Observer> observers;
	public Observable() {
		this.observers = new HashSet<Observer>();
	}

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void die(Unit owner) {
		for ( Observer observer : observers) {
			observer.heal(owner);
		}
	} 
}