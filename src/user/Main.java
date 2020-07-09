package user;

import static user.UserArray.checkTheSame;
import static user.UserArray.findTheUser;

public class Main {
    public static void main(String[] args) {
        User[] userArray = new User[]{
                new User("veronika", "lucky9"),
                new User("vasya", "brown8"),
                new User("user3", "qwertdf5"),
                new User("ruzena", "shopna"),
                new User("ruzena", "shopna"),
        };

        User veronika = new User("veronika", "lucky9");

        veronika.hello();
        System.out.println("Is user veronika parted userArray array: " + findTheUser(veronika, userArray));
        System.out.println("Is the array userArray has same users: "+ checkTheSame(userArray));

    }
}
