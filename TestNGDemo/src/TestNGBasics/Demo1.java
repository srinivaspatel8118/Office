package TestNGBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo1 {
	@Test
	void method1()
	{
		System.out.println("First MEthod ");
	}
	
	@BeforeSuite
	void method2()
	{
		System.out.println("BeforeSuite");
	}
	@AfterSuite
	void method3()
	{
		System.out.println("AfterSuite");
	}
	
	@BeforeMethod
	void method4()
	{
		System.out.println("BeforeMethod");
	}
	
	@AfterMethod
	void method5()
	{
		System.out.println("AfterMethod");
	}
	
	@AfterClass
	void method6()
	{
		System.out.println("AfterClass");
	}
	
	@BeforeClass
	void method7()
	{
		System.out.println("BeforeClass");
	}

}
