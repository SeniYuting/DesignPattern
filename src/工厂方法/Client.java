package 工厂方法;

public class Client {

	public static void main(String[] args) {
		Application application = new MyApplication();
		application.newDocument();
	}

}
