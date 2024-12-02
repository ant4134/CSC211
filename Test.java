package CSC211_Project;

public class Test {

	public static void main(String[] args) {
		// Test class to test the classes and their methods.

		// Test the product method's default constructor.
		Product p1 = new Product();
		System.out.println("Testing toString for product:");
		System.out.println(p1.toString()+"\n");
		

		// Test the product method's default constructor.
		Product p2 = new Product(10, "PetSmart",4);
		System.out.println("Testing toString for product2: ");
		System.out.println(p2.toString()+"\n");
		
		// Test electronics class
		
		Electronic pc = new Electronic();
		System.out.println("Testing toString for electronic:");
		System.out.println(pc.toString()+"\n");
		

		// Test the product method's default constructor.
		Electronic PlayStation = new Electronic(100, 500, "Sony", 5, "PlayStation", 1000);
		System.out.println("Testing toString for PlayStation: ");
		System.out.println(PlayStation.toString()+"\n");
		
		// Test the user class with admin.
		User user1 = new User();
		System.out.println("Testing user's username and password: ");
		System.out.println(user1.getUsername());
		System.out.println(user1.getPassword()+"\n");
		
		User user2 = new User("BrianS","spanob");
		System.out.println("Testing user 2 unique username and password: ");
		System.out.println(user2.getUsername());
		System.out.println(user2.getPassword()+"\n");
		
		Admin admin1 = new Admin("StoreOwner101","SuperSecretPassword");
		System.out.println("Testing admin1 unique username and password: ");
		System.out.println(admin1.getUsername());
		System.out.println(admin1.getPassword()+"\n");

	}

}
