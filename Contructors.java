package OOPS;


class Practice {
	String name;
	int age;
	
	public void info(){
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
//	Practice (String name , int age){
//		this.name = name;
//		this.age = age;
//		
//	
//		
//	}
	
}
public class Contructors {
	public static void main(String[] args) {
		Practice obj = new Practice() ;
		obj.name = "Tanveer";
		obj.age= 22;
		
		obj.info();
	}

}

