package TestNGBasics;

import org.testng.annotations.Test;

public class TestNGGroup {

	@Test(groups= {"default"})
	void SanityGroup()
	{
		System.out.println("default group first method");
	}
	@Test(groups= {"Sanity","Reg"})
	void SanityGroup1()
	{
		System.out.println("Sanity/Reg group first method");
	}
	
	@Test(groups= {"Sanity"})
	void regGroup()
	{
		System.out.println("Sanity group first method");
	}
	@Test(groups= {"Reg"})
	void regGroup1()
	{
		System.out.println("Reg group first method");
	}
	
	@Test(groups = {"endtoend"})
    public void tc_Groups_05() {
        System.out.println("tc_Groups_05 belonging to endtoend group.");
    }
    @Test(groups = {"endtoend"})
    public void tc_Groups_06() {
        System.out.println("tc_Groups_06 belonging to endtoend group.");
    }
    @Test(groups = {"volumetest"})
    public void tc_Groups_07() {
        System.out.println("tc_Groups_07 belonging to volumetest group.");
    }
	
    @Test(dependsOnGroups = {"sanity"})
    public void tc_Groups_08() {
        System.out.println("tc_Groups_05 method executes if all test cases belonging to sanity group are passed.");
    }
	
}
