package inhertenceConcept;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Delegation del=new Delegation();
		del.m2();
	}

}

class ActualPart
{
	void m1()
	{
		System.out.println("ActualPart method");
	}
}

class Delegation
{
	void m2()
	{
		ActualPart ap=new ActualPart();
		ap.m1();
	}
}