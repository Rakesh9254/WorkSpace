package TestNGFramework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

public class TestCase01 {
	@BeforeClass
	public void Beforeclass() {
		System.out.println("Beforeclass");
	}

	@AfterClass
	public void Afterclass() {
		System.out.println("Afterclass");
	}

	@BeforeClass
	public void AfterMethod() {
		System.out.println("AfterMethod");
	}

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("BeforeMethod");
	}

	@Test
	public void name() {
		System.out.println("Test Case 1");
	}

	@Test
	public void name1() {
		System.out.println("Test Case 2");
	}

}
