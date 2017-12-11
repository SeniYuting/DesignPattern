package 工厂方法;

public class MyApplication extends Application {

	public Document createDocument() {
		return new MyDocument();
	}

}
