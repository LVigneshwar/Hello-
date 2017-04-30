import java.*;
import java.util.Scanner;
public class Area_Scan {
	
	public static void main(String[]args)
	{
		Area_Scan a= new Area_Scan();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter length");
		 int l=sc.nextInt();
		System.out.println("enter breadth");
		 int b=sc.nextInt();
		int area=l*b;
		System.out.println("Area of rectangle ="+area);
		System.out.println("enter side of square");
		int s=sc.nextInt();
		int area1=s*s;
		System.out.println("Area of square ="+area1);
		System.out.println("enter radius of circle");
		float r=sc.nextFloat();
		float area2=(float) (3.14*r*r);
		System.out.println("Area of circle ="+area2);
		System.out.println("enter base of triangle");
		double b1=sc.nextDouble();
		System.out.println("enter height of a triangle");
		double h=sc.nextDouble();
		double area3=0.5*b1*h;
		System.out.println("the area of a triangle ="+area3);
		
		
		
		
	}
}
