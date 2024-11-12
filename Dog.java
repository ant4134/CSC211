
public class Dog implements Animal {
	public Dog() {
		
	}

	// Overriding the methods implemented via the Animal interface.
	@Override
	public void angrySound() {
		System.out.println("BARK!");

	}

	@Override
	public void happySound() {
		System.out.println("Woof");

	}

	@Override
	public void run() {
		System.out.println("Starts running!");

	}

	// Test out in main that the methods work.
	public static void main(String[] args) {
		Dog Molly = new Dog();
		Molly.angrySound();
		Molly.happySound();
		Molly.run();
	}

}
