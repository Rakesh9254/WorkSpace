package RevisionJavaProgram;

public class VariableShadowing {
	int age = 24;
	String name = "Rakesh";

	void VariableShadowing() {
		int age = 26;
		String name = "Roshan";
		System.out.println(age);
		System.out.println(name);
	}

	public static void main(String[] args) {
		VariableShadowing scShadowing = new VariableShadowing();
		scShadowing.VariableShadowing();

	}

}
