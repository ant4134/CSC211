package CSC211_Project;

public class Admin extends User {
	// Parameter constructor for Admin. No default constructor because the admin
	// must have a different username or password, or someone could login to the
	// admin account if they know the default username and password.
	public Admin(String username, String password) {
		super.setUsername(username);
		super.setPassword(password);
		System.out.println(
				"Make sure your username and password are unique and strong. Please redo your account information if not.");
	}

	// Admin command to create a product. Takes in all the parameters and calls the
	// Product constructor to create a new Product.
	public Product CreateProduct(int Product_ID, int Price, String Brand, int Rating) {
		Product newProduct = new Product();
		newProduct.setProduct_ID(Product_ID);
		newProduct.setPrice(Price);
		newProduct.setBrand(Brand);
		newProduct.setRating(Rating);
		return newProduct;
	}
}
