package fromtelusko;

public class Abstract_doubt {

	public static void main(String args[])
	{
		A obj=new B();
		hello(obj);
	}
	public static void hello(A a)
	{
	  a.call();	
	}
}
abstract class A{
	public abstract void call();
}
class B extends A
{
	public void call()
	{
		System.out.println("calling");
	}
}