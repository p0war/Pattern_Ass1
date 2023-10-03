import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        UserManager userManager = UserManager.getInstance();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name of the user:");
        String username = scanner.nextLine();

        System.out.print("Enter email of the user:");
        String email = scanner.nextLine();

        userManager.addUser(username, email);
        System.out.print("Enter the user's age:");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter name of your city:");
        String location = scanner.nextLine();

        userManager.addUserProfile(username, age, location);
        User user = userManager.getUser(username);
        UserProfile userProfile = userManager.getUserProfile(username);

        System.out.println("User: " + user.getUsername() + ", Email: " + user.getEmail());
        System.out.println("User's Profile: Age - " + userProfile.getAge() + ", City - " + userProfile.getLocation());
        scanner.close();
    }
}