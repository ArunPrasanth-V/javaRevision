package fromtelusko;
//non static 
public class CreatingInnerClassObject {
	public static void main(String args[])
	{
		outer outobj=new outer();
		outer.inner obj= outobj.new inner();
	}
}

class outer{
	int a=5;
	int b=10;
	class inner
	{
		inner()
		{
			System.out.println("inner class object is created");
		}
	}
}
