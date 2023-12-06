package InterviewQuestion;

interface A {
	void MethodA();
}

interface B {
	void MethodB();
}

class C implements A, B {
	public void MethodA() {
		System.out.println("Method A implementation in class C");
	}

	public void MethodB() {
		System.out.println("Method B implementation in class C");
	}

}

class IIC {
	public static void main(String[] args) {

		C c = new C();
		c.MethodA();
		c.MethodB();

	}
}