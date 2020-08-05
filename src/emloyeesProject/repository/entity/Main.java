package emloyeesProject.repository.entity;

public class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager("vasya", 1000, 100);
        Manager m2 = new Manager("kasya", 1003, 101);
        ProgrammManager pm1 = new ProgrammManager("ibragim", 1001);

        Employee[] employees = {m1, m2, pm1};

        ManageAble[] emp = {m1, m2, pm1};
        emp[0].manage();

        ManageAble qwe = new Manager("m", 1212, 121);
        qwe.manage();
    }
}
