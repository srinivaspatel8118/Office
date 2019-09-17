package dataprovidersdemo;


import org.testng.annotations.Test;

public class RegTest {

	@Test(dataProvider="testtype",dataProviderClass=DataProviderSource.class)
	public void regTest(String str)
	{
		System.out.println("Data from data source "+str);
	}
}
