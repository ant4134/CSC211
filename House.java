public class House extends Building {
	private static int numberOfResidents;

	// Constructor for house class.
	public House(int residents) {
		numberOfResidents = residents;
	}

	// Overrided the abstract method from Building superclass and implements a body
	// for the method.
	@Override
	public void listBuildingFeatures() {
		System.out.print("A house has the following features:\nKitchen, Living room, Bedroom, and Bathroom.");
	}

	// Setters and getters for numberOfResidents
	public static int getNumberOfResidents() {
		return numberOfResidents;
	}

	public static void setNumberOfResidents(int numberOfResidents) {
		House.numberOfResidents = numberOfResidents;
	}

	public static void main(String[] args) {
		House myHome = new House(4);
		myHome.listBuildingFeatures();
	}

}
