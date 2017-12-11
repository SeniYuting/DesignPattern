package 单例;

public class Singleton2 {
	final static int NUM = 3;
	private static Singleton2 singleton2;
	private static int count;

	public static Singleton2 getInstance() {
		if (count < NUM) {
			singleton2 = new Singleton2();
			count++;
		} else {
			System.out.println("Have " + NUM + " Objects");
		}
		return singleton2;
	}

	private Singleton2() {
		System.out.println("an Object");
	}
}
