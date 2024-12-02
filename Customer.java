package CSC211_Project;

import java.util.ArrayList;

public class Customer extends User {
	// Customer's class attributes. purchaseHistory is an ArrayList of Product's
	// that the Customer has bought.
	private ArrayList<Order> purchaseHistory;

	// Default constructor for a customer. No Parameter constructor for Customer
	// because the customer will not be able to work with/edit their purchase
	// history.
	public Customer() {
		purchaseHistory = new ArrayList<Order>();
	}

	public ArrayList<Order> getPurchaseHistory() {
		purchaseHistory.stream().forEach(System.out::print);
		return purchaseHistory;
	}
	
	// Allows the customer to make an Order of Products.
	public Order makeOrder(Product product) {
		Order order = new Order(product);
		return order;
	}
	
	// toString to print out the customers order.
	@Override
	public String toString() {
		return "Username: "+super.getUsername()+"\n Purchase History: "+getPurchaseHistory();
	}

}
