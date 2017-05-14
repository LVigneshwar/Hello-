package polymorphism;

public class Show {
	public static void display(Vehicle d1) {
		System.out.println("Vehicle: "+d1.getType());
		System.out.println("Name: "+d1.getname());
		System.out.println("Rate: "+d1.getRate());
		System.out.println("Speed: "+d1.getSpeed());
		System.out.println("_____________________________________________________");
		
	}
	public static void main(String[] args) {
	
		Show.display(new Two_wheeler());
		Show.display(new Three_wheeler());
		Show.display(new Four_wheeler());
	}
	

}
