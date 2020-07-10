package user;

public class Main {
    public static void main(String[] args) {
        User[] userArray = new User[]{
                new User("veronika", "lucky9", "Veronika"),
                new User("vasya", "brown8", "Vasya"),
                new User("user3", "qwertdf5", "User3"),
                new User("ruzena", "shopna", "Ruzena"),
                new User("ruzena", "shopna", "Ruzena"),
        };

        User veronika = new User("veronika", "lucky9", "Veronika");

        //System.out.println("Is user veronika parted userArray array: " + findTheUser(veronika, userArray));
        //System.out.println("Is the array userArray has same users: "+ checkTheSame(userArray));

        UserArray userArray1 = new UserArray(userArray);
        System.out.println(userArray1.checkTheSame());
        System.out.println(userArray1.findTheUser(veronika));
        userArray1.hello("ruzena", "shopna");
    }
}
