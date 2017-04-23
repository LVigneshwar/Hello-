
public class Constructor {
int accno;
int age;
public Constructor(int accno,int age)
{
	this.accno=accno;
	this.age=age;
	}
public static void main(String[]args)
{
	Constructor c1=new Constructor(125,20);
	Constructor c2=new Constructor(721,25);
	System .out.println("Customer 1: AccountNo.="+c1.accno+"Age="+c1.age);
	System .out.println("Customer 2: AccountNo.="+c2.accno+"Age="+c2.age);
}
}
