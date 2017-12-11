package 迭代器模式;

import java.util.ArrayList;

public class ConcreteIterator extends Iterator {
	private int currentIndex = 0;
	private ArrayList<String> ArrayList = null;

	public ConcreteIterator(final ArrayList<String> ArrayList) {
		this.ArrayList = ArrayList;
	}

	@Override
	public Object first() {
		currentIndex = 0;
		return ArrayList.get(currentIndex);
	}

	@Override
	public Object next() {
		currentIndex++;
		return ArrayList.get(currentIndex);
	}

	@Override
	public boolean isDone() {
		if (currentIndex >= this.ArrayList.size() - 1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object currentItem() {
		return ArrayList.get(currentIndex);
	}

}
