package TestNGEx;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNG {
	
	
	@BeforeSuite
	void BeforeSuite()
	{
		System.out.println("First TestNG  Before Suite");
	}
	@AfterSuite
	void AfterSuite()
	{
		System.out.println("First TestNG After Suite  ");
	}
	
	@BeforeClass
	void BeforeClass()
	{
		System.out.println("First TestNG  BeforeClass");
	}
	@AfterClass
	void AfterClass()
	{
		System.out.println("First TestNG AfterClass");
	}
	@BeforeMethod
	void BeforeMethod()
	{
		System.out.println("First TestNG  BeforeMethod");
	}
	@AfterMethod
	void AfterMethod()
	{
		System.out.println("First TestNG AfterMethod");
	}
	@BeforeTest
	void BeforeTest()
	{
		System.out.println("First TestNG  BeforeTest");
	}
	@AfterTest
	void AfterTest()
	{
		System.out.println("First TestNG  AfterTest");
	}

	@Test
	void amethod1()
	{
		System.out.println("First TestNG method1");
	}
	@Test
	void amethod2()
	{
		System.out.println("First TestNG method2");
	}
}
