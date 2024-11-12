
public abstract class Building {
	private static int age;
	private static int yearBuilt;
	private static String name;

	// abstract method for what features the building has.
	public abstract void listBuildingFeatures();

	// regular methods for setters and getters.
	public static int getAge() {
		return age;
	}

	public static void setAge(int age) {
		Building.age = age;
	}

	public static int getYearBuilt() {
		return yearBuilt;
	}

	public static void setYearBuilt(int yearBuilt) {
		Building.yearBuilt = yearBuilt;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Building.name = name;
	}

}
