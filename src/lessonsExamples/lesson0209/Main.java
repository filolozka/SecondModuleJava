package lessonsExamples.lesson0209;

public class Main {
    public static void main(String[] args) {
        PersonaAddress p1 = null;
        PersonaAddress p2 = null;
        PersonaAddress p3 = null;
        try {
            p1 = new PersonaAddress(AddressType.EMAIL, "dsfgdfh");
        } catch (Exception ex){
            System.out.println("ooops");
        }
        try {
            p2 = new PersonaAddress("email", "dsfgdfh");
        } catch (Exception ex){
            System.out.println("ooops");
        }
        try {
            p3 = new PersonaAddress("DELIVERY", "dsfgdfh");
        } catch (Exception ex){
            System.out.println("ooops");
        }

        //System.out.println(p1.getType() == AddressType.valueOf("EMAIL"));
        //System.out.println(p1.getType() == AddressType.valueOf("Email"));

        System.out.println("--------");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println("---------");

        System.out.println(p1.getType().test());
        System.out.println(p1.getType());

        System.out.println("---------------");
        p1.getType().send();
    }
}
