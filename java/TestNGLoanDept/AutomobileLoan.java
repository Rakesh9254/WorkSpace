package TestNGLoanDept;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class AutomobileLoan {
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod() {
		System.out.println("Chutiyapaaappappaappa");
	}
	@Test(enabled = true)
	public void Automob() {
		System.out.println("Personal AutoMUB");
	}
	@Test(enabled = false)

	public void AutomobWEB() {
		System.out.println("Personal AutoMUB    WEb");
	}
	@Test

	public void AutomobAPI() {
		System.out.println("Personal AutoMUB API");
	}

}
