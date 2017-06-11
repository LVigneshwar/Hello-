package Thread;

public class Prog implements Runnable 
{

	@Override
	public void run() {
	for(int i=0;i<2000;i++)
	{
		System.out.println("New Thread:"+i);
	}
		
	}
	public static void main(String[] args) {
		Prog p1=new Prog();
		Thread t1=new Thread(p1);
		t1.start();
		for(int i=2000;i<4000;i++)
		{
			System.out.println("Main  Thread:"+i);
		}
	}

}
