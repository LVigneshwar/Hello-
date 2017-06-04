package pack1;

public class Try_eg {
	public static void main(String[]args)
	{
		System.out.println("Main 1");
		try
		{
			System.out.println("try");
			int i=10/0;
		}
		catch (ArithmeticException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("Main 2");
	}
}
