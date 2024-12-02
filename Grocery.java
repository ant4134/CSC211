package CSC211_Project;

public class Grocery extends Product {
	// Class attributes for Grocery. Size is for the size of the grocery item, and
	// experation date is the date the food expires. If no experiation date, the
	// String will be "NA".
	private String size;
	private String expirationDate;

	// Default constructor for Grocery.
	public Grocery() {
		super();
		size = "Default";
		expirationDate = "Default";
	}

	// Parameter constructor for Grocery.
	public Grocery(int Product_ID, int Price, String Brand, int Rating, String size, String expirationDate) {
		super.setProduct_ID(Product_ID);
		super.setPrice(Price);
		super.setBrand(Brand);
		super.setRating(Rating);
		setSize(size);
		setExpirationDate(expirationDate);

	}

	// Setters and getters for class attributes Size, and ExpirationDate.
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	// Overriding the toString method so products can be printed.
	@Override
	public String toString() {
		return "Product ID: " + super.getProduct_ID() + "\nBrand: " + super.getBrand() + "\nPrice: " + super.getPrice()
				+ "\nRating: " + super.getRating() + " out of 5 stars" + "\nSize: " + size + "\nExpires: "
				+ expirationDate;
	}

}
