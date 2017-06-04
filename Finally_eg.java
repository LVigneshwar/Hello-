package pack1;

public class Finally_eg {
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
			System.out.println("Catch");
		}
		finally
		{
			System.out.println("finally");
		}
}
}

