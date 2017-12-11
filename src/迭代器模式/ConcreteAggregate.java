package 迭代器模式;

import java.util.ArrayList;

public class ConcreteAggregate extends Aggregate {

	private ArrayList<String> ArrayList = null;

	public ArrayList<String> getArrayList() {
		return ArrayList;
	}

	public void setArrayList(final ArrayList<String> ArrayList) {
		this.ArrayList = ArrayList;
	}

	public ConcreteAggregate() {
		ArrayList = new ArrayList<String>();
		ArrayList.add("No.1");
		ArrayList.add("No.2");
	}

	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(ArrayList);
	}
}
