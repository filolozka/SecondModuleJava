package lessonsExamples.lesson0809;

import java.util.function.Function;

public class ParserString implements Function<String, Account> {

    @Override
    public Account apply(String s) {
        if (checkString(s)){
            String[] ownerAndIban = s.split(" Iban:");
            String[] typeAndName = ownerAndIban[0].split(":");
            Owner owner = null;
            if (typeAndName[0].isEmpty()){
                //create Person
                String[] names = typeAndName[1].split(" ");
                owner = new Person(names[0], names[1]);
            }
            else {
                //create Company
                owner = new Company(typeAndName[1], TypeOfOwnership.getTypeStringByString(typeAndName[0]));
            }
            return new Account(owner, ownerAndIban[1]);
        }
        return null;
    }

    private boolean checkString(String s) {

        return true;
    }
}
