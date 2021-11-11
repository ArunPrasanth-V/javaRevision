package fromtelusko;

import fromtelusko.outer.inner;

public class Creating_static_InnerClassObject {
/*if the inner class is object we don't need to 
  create object for outter class like 
  
	outer outobj=new outer();
	outer.inner obj= outobj.new inner();
	
*/
	Outer.Inner obj=new Outer.Inner();
}
class Outer
{
	static class Inner
	{
		Inner()
		{
			System.out.println("Object is created in inner class with static aswell");
		}
	}
}
