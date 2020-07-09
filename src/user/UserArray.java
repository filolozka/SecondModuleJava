package user;

public class UserArray {
    public static boolean checkTheSame(User[] users) {
        for (int i = 1; i < users.length - 1; i++) {
            if (users[i].equals(users[i + 1])) {
                return true;
            }
        }
        return false;
    }

    public static int findTheUser(User user, User[] users) {
        int userIndex = 0;
        for (int i = 1; i < users.length; i++) {
            if (users[i].equals(user)) {
                userIndex = i;
            }
        }
        return userIndex;
    }
}
