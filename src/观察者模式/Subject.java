package 观察者模式;

import java.util.ArrayList;

public class Subject {
	ArrayList<Observer> observerList = new ArrayList<Observer>();

	public void register(Observer observer) {
		observerList.add(observer);
	}

	public void remove(Observer observer) {
		observerList.remove(observer);
	}

	public void notify(String sth) {
		for (Observer observer : observerList) {
			observer.update(sth);
		}
	}

}
