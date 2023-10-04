package OOPS;

class Animals {
	void eat() {
		System.out.println("Animals Eat");
	}
}
	class Herbivores extends Animals  {
		void eat() {
			System.out.println("Herbivores Eat plants ");
		}
	}
		class Omnivores extends Animals {
			void eat() {
				System.out.println("Omnivores Eat Plant and Meat");
			}
		}
	

		class OverRiding {
			public static void main(String[] args) {
				Animals A = new Animals();
				Animals h = new Herbivores();  // upcasting
				Animals o = new Omnivores();	 // upcasting

							A.eat();
							h.eat();
							o.eat();
			}
		}
