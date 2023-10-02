package OOPS;

class Pen{
	
	String colour;       // black, blue, green
	String type;         // ball, gel
	
	public void func() {
		System.out.println("Pen writes");
		
	}
	
	public void prop() {
		System.out.println(this.colour);    // this keyword tells the variable which object has called you 
		System.out.println(this.type);
		
	}
	
}
public class ClassesAndObjects {
	public static void main(String[] args) {
		
		Pen p1 = new Pen();
		
		p1.colour = "red";
		p1.type = "gel";
		
		Pen p2 = new Pen();
		p2.colour = "Blue";
		p2.type = "Ball";
		
		p1.func();
		
		p1.prop();
		
		p2.prop();
	}
	

}
