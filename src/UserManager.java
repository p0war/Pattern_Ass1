import java.util.HashMap;
import java.util.Map;

public class UserManager {
    private static UserManager instance;
    private Map<String, User> users;
    private Map<String, UserProfile> profiles;

    private UserManager() {
        users = new HashMap<>();
        profiles = new HashMap<>();
    }
    public static UserManager getInstance() {
        if (instance == null) {
            instance = new UserManager();
        }
        return instance;
    }
    public void addUser(String username, String email) {
        User user = new User(username, email);
        users.put(username, user);
    }
    public void addUserProfile(String username, int age, String location) {
        UserProfile userProfile = new UserProfile(age, location);
        profiles.put(username, userProfile);
    }
    public User getUser(String username) {
        return users.get(username);
    }
    public UserProfile getUserProfile(String username) {
        return profiles.get(username);
    }
}
