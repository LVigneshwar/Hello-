package Multithreading;

public class Prog3 extends Thread{
	public void run()
	{
		for(int i=0;i<2000;i++)
		{
			System.out.println("New Thread:"+i);
		}
	}
	public static void main(String[]args) throws InterruptedException
	{
		Prog3 a=new Prog3();
		a.start();
		for(int i=10;i<20;i++)
		{
			Thread.sleep(2000);
			System.out.println("Main  Thread:"+i);
		}
	}
}
