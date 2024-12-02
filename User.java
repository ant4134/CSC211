package CSC211_Project;

public class User {
	// User's class attributes. Username and password will be used to login to their
	// account.
	private String username;
	private String password;

	// Default constructor for user.
	public User() {
		setUsername("Default");
		setPassword("password");

	}

	// Parameter constructor for user.
	public User(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
