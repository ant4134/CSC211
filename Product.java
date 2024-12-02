package CSC211_Project;

import java.util.Random;

public class Product {
	// Product's class attributes. Product_ID to give each product an ID, and Price
	// is for the price of the product. Brand is for the brand of the product.
	// Rating is an integer between 1-5 showing how many stars the item gets.
	private int Product_ID;
	private int Price;
	private String Brand;
	private int Rating;

	// Default constructor for a product.
	public Product() {
		Product_ID = 0;
		Price = 0;
		Brand = "Default";
		// Giving rating an out of bounds value, to indicate the product is a default
		// product.
		Rating = 0;
	}

	// Random object rand, will be used in upcoming constructor.
	Random rand = new Random();

	// Parameter constructor for a product.
	public Product(int Price, String Brand, int Rating) {
		// Generate a random ID from 0 to 999.
		Product_ID = rand.nextInt(1000);
		this.Price = Price;
		this.Brand = Brand;
		this.Rating = Rating;
	}

	// Getters and setters for the class attributes Product_ID, Price and Brand.
	public int getProduct_ID() {
		return Product_ID;
	}

	public void setProduct_ID(int product_ID) {
		Product_ID = product_ID;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		this.Brand = brand;
	}

	public int getRating() {
		return Rating;
	}

	// The if statement makes it so you can only enter a value between 1 - 5.
	public void setRating(int rating) {
		if (rating >= 1 && rating <= 5) {
			Rating = rating;
		} else {
			System.out.println("invalid rating value. Please try again.");
		}
	}

	// Overriding the toString method so products can be printed.
	@Override
	public String toString() {
		return "Product ID: " + Product_ID + "\nBrand: " + Brand + "\nPrice: " + Price + "\nRating: " + Rating
				+ " out of 5 stars";
	}

}
