
public class Overidding_two extends Overriding {
	public void test()
	{
		System.out.println("test-b");
	}
	public static void main(String[] args)// signature
	{
		Overriding b1 = new Overriding();
		b1.test();
	}
}
