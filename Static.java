
public class Static {
static int i=10;//static variable
int j=20;//Non-static variable(global scope)
public static void main(String[]args)
{
	int k=25;//Non-static variable(local scope)
	System.out.println("k="+k);
	System.out.println("i="+i);
	Static s=new Static();
	System.out.println("j="+s.j);
	s.j=30;
	System.out.println("j="+s.j);
	
}
}
