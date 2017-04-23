
public class Copy {
public int i;
Copy(int i)
{
	this.i=i;
}
public static void main(String[] args) {
	Copy c1=new Copy(65);
	System.out.println("C1="+c1.i);
	Copy c2=c1;
	System.out.println("C2="+c2.i);
	c2.i=100;
	System.out.println("C1="+c1.i);
}
}
