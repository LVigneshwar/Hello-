
public class C extends B {
public int i;
C()
{
	this(50);
	System.out.println("C");
}
C(int i)
{
	this.i=i;
	System.out.println("integer");
	}
public static void main(String[]args)
{
	C c1=new C();
	System.out.println("C main");
	System.out.println(c1.i);
}
}


