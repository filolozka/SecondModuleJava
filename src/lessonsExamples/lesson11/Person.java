package lessonsExamples.lesson11;

public class Person {
    private String secondName; //идея в том, что любой объект состоит из 3 полей, но в некоторых случаях значение одного из полей = ""
    private String firstName;
    private String patronymic;

    public Person(String firstName, String secondName, String patronymic) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    public Person(String firstName, String secondName) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.patronymic = ""; //так надо, чтобы не получать null там, где нет значений
    }

    public Person(String secondName) {
        this.firstName = "";
        this.secondName = secondName;
        this.patronymic = "";
    }

//    //моё творчество
//    public Person(String[] name) {
//        this.firstName = name[0];
//        this.secondName = name[1];
//        this.patronymic = name[2];
//    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }

    public String toShortName() {
        return secondName + " " + ((firstName.length() >= 1) ? firstName.substring(0, 1) + "." : firstName) +   //здесь можно использовать charAt
                ((patronymic.length() >= 1) ? patronymic.substring(0, 1) + "." : patronymic);
    }
}
