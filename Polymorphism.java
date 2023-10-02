package OOPS;

class Poly{
	String name;
	String post;
	int age;
	
	public void info (String name){
		System.out.println(name);
	}
	public  void mor ( String post) {
		System.out.println(post);
	}
	public void info(int age) {
		System.out.println(age);
	}
	public void info (String name, String post, int age) {
		System.out.println(name+ post+ age);
	}
	
}

public class Polymorphism {
	public static void main(String[] args) {
		
		Poly py = new Poly();
		
		py.name = "Tanveer";
		py.post = "Engineer";
		py.age = 22;
		
		
		py.info(py.name);
		py.mor(py.post);
		py.info(py.age);
	}

}
