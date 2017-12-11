package 工厂方法;

public abstract class Application {

	public abstract Document createDocument();

	public void newDocument() {
		Document doc = createDocument();
		doc.print();
	}

}
