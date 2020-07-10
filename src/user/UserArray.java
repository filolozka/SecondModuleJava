package user;

public class UserArray {
    User[] users;

    public UserArray(User[] users) {
        this.users = users;
    }

    public boolean checkTheSame() {
        for (int i = 0; i < users.length; i++) {
            for (int j = i + 1; j < users.length; j++) {
                if (users[i].equals(users[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    public int findTheUser(User user) { //проверить еще раз, почему не работает корректно
        int userIndex = 0;
        for (int i = 0; i < users.length; i++) {
            if (user.equals(users[i])) {
                userIndex = i;
            }
        }
        return userIndex;
    }

    protected void hello(String login, String password) {
        for (int i = 0; i < users.length; i++) {
            String uLogin = users[i].getLogin();
            String uPassword = users[i].getPassword();
            if (uLogin.equals(login) && uPassword.equals(password)) {
                System.out.println("Hello " + users[i].getFirstName() + ", welcome to our page!");
                return;
            }
        }
        System.out.println("Sorry, there are no users with this login and password");
    }
}
