package dataprovidersdemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderdemo2 {

	@Test(dataProvider="getdata")
	public void intanceDataProvider(String str1, String str2)
	{
		System.out.println("The DataProvider Values are "+str1+"  "+str2);
	}
	
	@DataProvider(name="getdata")
	public Object[][] data()
	{
		/*Object[][] obj=new Object[1][2];
		obj[0][0]="Srinivas";
		obj[0][1]="Patel";
				*/
		
		return new Object[][]{{"patel1@xeno.com","Test@123"},{"patel2@xeno.com","xeno@111"},{"patel3@xeno.com","X+g@321"}};
		
	}
}
