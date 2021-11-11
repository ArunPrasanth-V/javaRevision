package fromtelusko;

public class AnonymousClass_interface_magic {
	RR obj=new RR()
			{
				public void define()
				{
					System.out.println("We Can do This wa aswell");
				}
			};
			
	CC obj2=new CC()
			{
		      public void hey()
		      {
		    	  System.out.println("we done abstract as well");
		      }
			};
}
interface RR
{
	void define();
}

abstract class CC
{
	abstract void hey();
}
