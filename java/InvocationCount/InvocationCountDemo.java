package InvocationCount;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class InvocationCountDemo {
	@Test(invocationCount = 5)
	public void Test1(ITestContext context) {
		int InvocationCount = context.getAllTestMethods()[1].getCurrentInvocationCount();
		System.out.println("Rakesh Roshan");
	}

	@Test(invocationCount = 3)
	public void Test2(ITestContext context) {
		int InvocationCount = context.getAllTestMethods()[0].getCurrentInvocationCount();
		System.out.println("Roshan Yadav");
	}

	@Test(invocationCount = 2)
	public void Test3(ITestContext context) {
		int InvocationCount = context.getAllTestMethods()[2].getCurrentInvocationCount();
		System.out.println("Rakesh Yadav");
	}

}
