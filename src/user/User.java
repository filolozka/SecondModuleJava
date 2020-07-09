package user;

import java.util.Objects;

public class User {
    private String firstName;
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;

    }

    protected void hello() {
        System.out.println(login + ", welcome to our page!");
    }

    @Override
    public boolean equals(Object o) {
        User user = (User) o;
        return Objects.equals(login, user.login) &&
                Objects.equals(password, user.password);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
