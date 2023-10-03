package OOPS;


class Avej{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class Encapsulation {
	public static void main(String[] args) {
		
		Avej veg = new Avej();
		veg.setName("biryani");
		System.out.println(veg.getName());
		


	}
	

}
