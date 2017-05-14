
public class Argument {
	void test()
	{
		System.out.println("without arg");
	}
	
	void test(int i)
	{
		System.out.println("one int arg");
	}
	void test(int i,int j)
	{
		System.out.println("two int arg");
	}
	void test(double i)
	{
		System.out.println("double arg");
	}
	public static void main(String[] args)
	{
		Argument a1=new Argument();
		a1.test(12.78);
		Argument a2=new Argument();
		a2.test(12);
	}
	
}
