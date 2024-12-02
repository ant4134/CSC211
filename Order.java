package CSC211_Project;

import java.util.ArrayList;
import java.util.Random;

public class Order {
	// Order's class attributes. total_Price is the total price of the order, and
	// Order_ID is the ID associated with the specific order.
	private ArrayList<Product> OrderProducts;
	private int total_Price;
	private int Order_ID;

	// Create a random object Rand, will be used in upcoming constructor.
	Random rand = new Random();

	// Parameter constructor for order class. No default constructor for order
	// class, because every order needs to have a order ID.
	public Order(Product product) {
		// Calculate the price of the order, using the method calcPrice.
		total_Price = calcPrice();
		// Randomizes the order's ID between 0 and 999.
		Order_ID = rand.nextInt(1000);
	}
	// Adds a product to OrderProducts list.
	public void addItem(Product p) {
		this.OrderProducts.add(p);
	}

	// Calculate the price of the order.
	public int calcPrice() {
		int price = 0;
		for (Product p : this.OrderProducts) {
			price += p.getPrice();
		}
		return price;
	}

	// Getters for Price and ID. No setters because we don't want customers to be
	// able to change the price and order ID.
	public int getTotal_Price() {
		return total_Price;
	}

	public int getOrder_ID() {
		return Order_ID;
	}

	// toString method to print out each product in an order.
	@Override
	public String toString() {
		Customer customer = new Customer();
		return customer.toString();
	}

	// Getter to return the order's products
	public ArrayList<Product> getOrderProducts() {
		return OrderProducts;
	}

}
