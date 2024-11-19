import java.util.ArrayList;
import java.util.List;

class User {
    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{username='" + username + "', email='" + email + "'}";
    }
}

class RegisteredUser {
    private List<User> listOfUsers;

    public RegisteredUser() {
        listOfUsers = new ArrayList<>();
    }

    public void addUser(User user) {
        listOfUsers.add(user);
        System.out.println(user.getUsername() + " added successfully.");
    }

    public void removeUser(User user) {
        if (listOfUsers.remove(user)) {
            System.out.println(user.getUsername() + " removed successfully.");
        } else {
            System.out.println(user.getUsername() + " not found.");
        }
    }

    public void displayUsers() {
        if (listOfUsers.isEmpty()) {
            System.out.println("No registered users.");
        } else {
            System.out.println("Registered users:");
            for (User user : listOfUsers) {
                System.out.println(user);
            }
        }
    }
}
