package CSC211_Project;

public class Electronic extends Product {
	// Electronic's class attributes. OS (Operating System) is to show what
	// operating system the electronic uses (if applicable). The speed attribute
	// shows how fast the electronic runs.
	private String OS;
	private int speed;

	// Default constructor for an electronic.
	public Electronic() {
		super();
		setOS("Default");
		setSpeed(0);
	}

	// Parameter constructor for an electronic, using product's class attributes and
	// methods.
	public Electronic(int Product_ID, int Price, String Brand, int Rating, String OS, int speed) {
		super.setProduct_ID(Product_ID);
		super.setPrice(Price);
		super.setBrand(Brand);
		super.setRating(Rating);
		this.setOS(OS);
		this.setSpeed(speed);
	}

	// Setters and getters for class attributes OS, and speed.
	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// Overriding the toString method so products can be printed.
	@Override
	public String toString() {
		return "Product ID: " + super.getProduct_ID() + "\nBrand: " + super.getBrand() + "\nPrice: " + super.getPrice()
				+ "\nRating: " + super.getRating() + " out of 5 stars"+"\nOperating System: "+OS+"\nSpeed: "+speed;
	}

}
