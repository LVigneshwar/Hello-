package Multithreading;

public class Prog2 extends Thread {
	public void run()
	{
		for(int i=0;i<2000;i++)
		{
			System.out.println("New Thread:"+i);
		}
	}
		public static void main(String[]args) throws InterruptedException
		{
			Prog2 a=new Prog2();
			a.setDaemon(true);
			a.start();
			a.join();
			for(int i=10;i<20;i++)
			{
				System.out.println("Main  Thread:"+i);
			}
			}
}
