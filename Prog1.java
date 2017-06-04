package Multithreading;

public class Prog1 extends Thread {

	public void run()
{
	for(int i=0;i<20;i++)
	{
		System.out.println("New Thread:"+i);
	}
}
	public static void main(String[]args)
	{
		Prog1 a=new Prog1();
		a.start();
		for(int i=2000;i<4000;i++)
		{
			System.out.println("Main  Thread:"+i);
		}
		}
	}
