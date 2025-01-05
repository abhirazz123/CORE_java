package DIC_28;
import java.util.function.Predicate;
import java.util.function.Supplier;

class User {
    private String username;
    private boolean isSubscribed;

    public User(String username, boolean isSubscribed) {
        this.username = username;
        this.isSubscribed = isSubscribed;
    }

    @Override
    public String toString() {
        return "User{ " +
                "username='" + username + '\'' +
                ", isSubscribed=" + isSubscribed +
                " }";
    }

    public boolean isSubscribed() {
        return isSubscribed;
    }
}

public class SubscriptionChecker {

    private static User generateUser() {
        Supplier<User> userSupplier = () -> new User("Abhi", true);
        return userSupplier.get();
    }

    private static boolean checkSubscriptionStatus(User user) {
        Predicate<User> subscriptionChecker = User::isSubscribed;
        return subscriptionChecker.test(user);
    }

    private static void printUserInformation(User user) {
        System.out.println(user.toString());
    }

    private static void printSubscriptionStatus(User user) {
        String status = checkSubscriptionStatus(user) ? "subscribed" : "not subscribed";
        System.out.println("The user is " + status);
    }

    public static void main(String[] args) {
        User user = generateUser();
        printUserInformation(user);
        printSubscriptionStatus(user);
    }
}
