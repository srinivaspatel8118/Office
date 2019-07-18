package arrays;
/*
 * 5. Write java programs by following below steps:
                Step1 : Create employee class with following details:  class Name: Employee,  employee details:  emp_ID, emp_Name, emp_dept  and Initialize 
                				these three variables with parametrized constructor
                Step2:  Create one more class and declare single dimension array with data type is Employee, initialize it by passing employee objects.
                Step3:  print all employee detail by iterating this array.

 */
public class Question5 {

	
	
	
	public static void main(String[] args) {
	
		Employee emparry[]= new Employee[3];{
			
			emparry[0]=new Employee("Srinivas",1,1286);
			emparry[1]=new Employee("Srinivas1",2,1287);
			emparry[2]=new Employee("Srinivas2",3,1288);
			}
		/*for(int i=0;i<emparry.length;i++)
		{
			System.out.println("The employe name is "+emparry[i].empname+" and dept_id= "+emparry[i].dept_id+" and employee id= "+emparry[i].emp_id);
		}*/
		for(Employee e:emparry)
			System.out.println("The employe name is "+e.empname+" and dept_id= "+e.dept_id+" and employee id= "+e.emp_id);

	}

}

class Employee
{
	String empname;
	int emp_id,dept_id;
	
	Employee(String name,int deptid,int empid)
	{
		empname=name;
		emp_id=empid;
		dept_id=deptid;
	}
}