package 空对象;

public class Client {
	
	public static void main(String[] args) {
		Source s1 = new Normal(); // s1应从其他方法中返回的返回值

		if (s1.isNull())
			System.out.println("Null: " + s1.getCost()); // getCost只是举例的方法
		else
			System.out.println("Nomal: " + s1.getCost());
	}

}
