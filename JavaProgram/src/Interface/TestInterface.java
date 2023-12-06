package Interface;

interface Drawable {
	void draw();
}

class Rectangle implements Drawable {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

class Circle implements Drawable {
	public void draw() {
		System.out.println("drawing circle");
	}
}

public class TestInterface {

	public static void main(String[] args) {
		Drawable drawable = new Rectangle();
		drawable.draw();

	}

}
