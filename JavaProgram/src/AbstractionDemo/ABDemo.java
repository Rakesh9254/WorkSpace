package AbstractionDemo;

abstract class Keyword{
	String name;
	int price;
	public void Keyword(String name,int price) {
		this.name = name;
		this.price= price;
	}
	void Press_P() {
		System.out.println("Print P");
	}
	abstract void Press_Enter();
}
public class ABDemo extends Keyword {
	void Press_Enter() {
		System.out.println("Open-Image");
	}
	public static void main(String[] args) {
//		Keyword scAbDemo = new 
		
	}

}
