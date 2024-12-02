package CSC211_Project;

public class Clothing extends Product {
	// Clothing's class attributes. Material is for what the clothing is made of,
	// and isWashable is a boolean for if the clothing can be washed in the washing
	// machine or not.
	private String Material;
	private boolean isWashable;

	// Default constructor for Clothing.
	public Clothing() {
		super();
		setMaterial("Default");
		setWashable(false);
	}

	// Parameter constructor for Clothing.
	public Clothing(int Product_ID, int Price, String Brand, int Rating, String Material, boolean isWashable) {
		super.setProduct_ID(Product_ID);
		super.setPrice(Price);
		super.setBrand(Brand);
		super.setRating(Rating);
		setMaterial(Material);
		setWashable(isWashable);

	}

	// Setter and getters for class attributes Material, and isWashable.
	public String getMaterial() {
		return Material;
	}

	public void setMaterial(String material) {
		Material = material;
	}

	public boolean isWashable() {
		return isWashable;
	}

	public void setWashable(boolean isWashable) {
		this.isWashable = isWashable;
	}

	// Overriding the toString method so products can be printed.
	@Override
	public String toString() {
		return "Product ID: " + super.getProduct_ID() + "\nBrand: " + super.getBrand() + "\nPrice: " + super.getPrice()
				+ "\nRating: " + super.getRating() + " out of 5 stars" + "\nMaterial: " + Material + "\nisWashable: "
				+ isWashable;
	}
}
