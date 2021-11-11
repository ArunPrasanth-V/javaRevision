package fromtelusko;

public class OverridingPurpose_AnonymousClass {
	
public static void main (String args[])
{
	AA obj=new AA(){
	            	public  void show()
	          	     {
				      	System.out.println("Hi");
				      	say();
				     }
	            	public void say()
	            	{
	            		System.out.println("Hello");
	            	}
	            };
	     obj.show();
	    // obj.say(); not possible 
	    
}
}
class AA
{
  public  void show()
  {
	  System.out.println("hello");
  }
}

