abstract class Abs
{
	Abs(int p)
	{
		System.out.println("Abstract class constractor called");
	}
	abstract void meth();   // not implimented class need abstract keyword of method in abstract class.
	void meth1()
	{
		System.out.println("Abstract class called");
	}
}
 class AbsInheritage extends Abs
 {
	AbsInheritage(int p)  
	{
		super(p);   // Directly not called abstract class constractor bcoz not object create of abstract class.
	}
	 
	 int a=2,b=3;
	 void meth()    // impliment method of abstract class method.
	 {
		 System.out.println(a+b);
	 }
	 void meth1()
	{
		System.out.println("child class called");
	}
 }
public class AbstractClass 
{
	public static void main(String[] args) 
	{
		Abs ai= new AbsInheritage(3);  //abstract class variable(not object) ai point to child class AbsInheritage.  Bcoz abstract classnot create object.
	  //AbsInheritage ai = new AbsInheritage(3);  // child class AbsInheritage create object is ai.
		ai.meth();
		ai.meth1();
	}

}
