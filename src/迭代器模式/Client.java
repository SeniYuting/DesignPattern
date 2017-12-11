package 迭代器模式;

public class Client {

	public static void main(String[] args) {

		Aggregate myList = new ConcreteAggregate();
		Iterator iterator = myList.createIterator();
		System.out.println(iterator.first());
		while (!iterator.isDone()) {
			System.out.println(iterator.next());
		}

	}
}
