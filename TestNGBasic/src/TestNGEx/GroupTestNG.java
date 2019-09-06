package TestNGEx;

import org.testng.annotations.Test;

public class GroupTestNG {

	@Test(groups={"Reg"})
	void method1()
	{
		System.out.println("First Method");
	}
	@Test(groups={"Reg"})
	void method2()
	{
		System.out.println("second Method");
	}
	@Test(groups={"san"})
	void method3()
	{
		System.out.println("3rd Method");
	}
	@Test(groups={"san"})
	void method4()
	{
		System.out.println("4th Method");
	}
	@Test(groups={"Reg"})
	void method5()
	{
		System.out.println("5th Method");
	}
}
