
public class Area {
void circle()//without argument and without return
{
	int r=5;
	double area=3.14*r*r;
	System.out.println("Area of circle ="+area);
}
void square(int a)//with argument and without return
{
int area=a*a;
System.out.println("Area of square ="+area);
}
int rectangle()//without argument and with return
{
	int l=10;
	int b=5;
	int area=l*b;
	return area;
}
double triangle(int b, int h)//with argument and with return
{
	double area=0.5*b*h;
	return area;
}
public static void main(String[]args)
{
Area a1=new Area();
a1.circle();
a1.square(10);
int a=a1.rectangle();
System.out.println("Area of rectangle ="+a);
double b=a1.triangle(6, 5);
System.out.println("Area of triangle ="+b);
}
}
