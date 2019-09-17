package dataprovidersdemo;

import org.testng.annotations.Test;

public class StaticDataProviderDemo1 {

	
	@Test(dataProvider="DataSource1", dataProviderClass=DataProviderSource.class)
	public void staticDataProvider1(String str1)
	{
		System.out.println("Static Data Provider values are "+str1);
	}
	
	@Test(dataProvider="DataSource2", dataProviderClass=DataProviderSource.class)
	public void staticDataProvider2(String str1)
	{
		System.out.println("Static Data Provider values are"+str1);
	}
}
