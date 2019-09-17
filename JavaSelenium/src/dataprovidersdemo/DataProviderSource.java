package dataprovidersdemo;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

public class DataProviderSource {

	
	/**
	 * @return static data provider of object array
	 */
	@DataProvider(name="DataSource1")
	public static Object[][]  dataSource1()
	{
		
		return new Object[][]{{"Patel"},{"Balu"},{"Gowtham"}};
		
	}
	@DataProvider(name="DataSource2")
	public static Object[][]  dataSource2()
	{
		
		return new Object[][]{{"DataSource2-Patel"},{"DataSource2-Balu"},{"DataSource2-Gowtham"}};
		
	}
	
	@DataProvider(name="testtype")
	 public static Object[][] getTestTypeData(ITestContext context) 
	{
		String Testingtype=context.getName();
		if("RegTest".equals(Testingtype))
		{
			return new Object[][]{{"Reg Test Data"}};
		}
		else if ("SanityTest".equals(Testingtype))
		{
			return new Object[][]{{"Sanity Tesst"}};
		}
		
		else
		{
		  return new Object[][]{{"no Data"}};
		}
	}
}
