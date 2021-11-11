package fromtelusko;

public class Lambda_FunctionalInterface_magic {
  public static void main(String args[])
  {
	  GG obj=()-> System.out.println("working!!");
	  obj.tell();
  }
}
@FunctionalInterface
interface GG
{
	void tell();
	
	default void add(){}
	default void add(int a){}
	default void add(double s){}
	
	static void sub() {}
	static void sub(int a) {}
	static void sub(double b) {}
}
