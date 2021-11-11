package fromtelusko;

public class InnerOuterClassMagic {
	//static Magic
	public static void main(String args[]) {
		//Inner oo=new Inner();
		Inner.hell();
		int j=Inner.i;
		System.out.println(j);
	}
	
}
class Inner
{
	static int i=5;
	int k=5;
	public static void hell()
	{
		System.out.println("hello");
	}
	
	public void check()
	{
		i=i;
	}
}
