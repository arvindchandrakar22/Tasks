package evaluation.codingquestions;

import java.util.ArrayList;
import java.util.List;

class User {
    private int userId;
    private String username;

    public User(int userId, String username) {
        this.userId = userId;
        this.username = username;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return userId + " " + username;
    }
}

public class UserManagement {

    public static List<User>[] CompareUsers(List<User> usersListInDB, List<User> newUsersList) {
        List<User> updatedUsers = new ArrayList<>();
        List<User> insertedUsers = new ArrayList<>();

        for (User newUser : newUsersList) {
            int userId = newUser.getUserId();
            if (userId == 0) {
                // New user, insert into the database
                insertedUsers.add(newUser);
            } else {
                // Existing user, check if it exists in the database
                boolean found = false;
                for (User dbUser : usersListInDB) {
                    if (dbUser.getUserId() == userId) {
                        // User exists, check for updates
                        if (!dbUser.getUsername().equals(newUser.getUsername())) {
                            // Username is different, update it
                            dbUser.setUsername(newUser.getUsername());
                            updatedUsers.add(dbUser);
                        }
                        found = true;
                        break;
                    }
                }

                // If not found in the database, treat it as a new user
                if (!found) {
                    insertedUsers.add(newUser);
                }
            }
        }

        List<User>[] result = new List[2];
        result[0] = updatedUsers;
        result[1] = insertedUsers;
        return result;
    }

    public static void main(String[] args) {
        List<User> usersListInDB = new ArrayList<>();
        usersListInDB.add(new User(1, "User1"));
        usersListInDB.add(new User(2, "User2"));

        List<User> newUsersList = new ArrayList<>();
        newUsersList.add(new User(1, "User4"));
        newUsersList.add(new User(0, "User5"));
        newUsersList.add(new User(2, "User2"));

        List<User>[] result = CompareUsers(usersListInDB, newUsersList);

        System.out.println("Updated Users:");
        for (User user : result[0]) {
            System.out.println(user);
        }

        System.out.println("Inserted Users:");
        for (User user : result[1]) {
            System.out.println(user);
        }
    }
}
