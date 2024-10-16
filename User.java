public class User {
    // Attributes
    private String userID;
    private String password;
    private String email;
    private String userType;

    // Constructor
    public User(String userID, String password, String email, String userType) {
        this.userID = userID;
        this.password = password;
        this.email = email;
        this.userType = userType;
    }

    // Method to create a user (register)
    public static User createUser(String userID, String password, String email, String userType) {
        return new User(userID, password, email, userType);
    }

    // Method to reset the password
    public void resetPassword(String newPassword) {
        this.password = newPassword;
    }

    // Getters and Setters
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    // toString method
    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                ", email='" + email + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }

    // Main method
    public static void main(String[] args) {
        // Create a new user
        User user = User.createUser("doanminhnhut", "123", "nhut.doan.cit20@eiu.edu.vn", "admin");

        // Display user information
        System.out.println(user);

        // Reset password
        user.resetPassword("456");
        System.out.println("Password reset successfully.");

        user.setEmail("nhoksoma2013@gmail.com");
        System.out.println("Your Email reset successfully.");

        // Display updated user information
        System.out.println(user);
    }
}
