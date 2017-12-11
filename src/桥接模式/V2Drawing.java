package 桥接模式;

public class V2Drawing extends Drawing {

	@Override
	public void drawRectangle(int width, int height) {
		System.out.println("Use V2 to draw a Rectangle");
		System.out.println("Width: " + width + " Height: " + height);
	}

	@Override
	public void drawTriangle(int rows) {
		System.out.println("Use V2 to draw a Triangle");
		System.out.println("Rows: " + rows);
	}

}
