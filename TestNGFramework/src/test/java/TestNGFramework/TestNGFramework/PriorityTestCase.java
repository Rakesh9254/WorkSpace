package TestNGFramework.TestNGFramework;

import org.testng.annotations.*;

public class PriorityTestCase {

	@Test(priority = 4)
	public void testCase1() {
		System.out.println("Test Case 1");
	}

	@Test(priority = 1)
	public void testCase2() {
		System.out.println("Test Case 2");
	}

	@Test(priority = 0)
	public void testCase4() {
		System.out.println("Test Case 6");
	}
}
