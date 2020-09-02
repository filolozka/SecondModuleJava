package lessonsExamples.lesson0109.hw0109;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateMissOneTypeOfAddress implements Predicate<PersonaAddress> {
    @Override
    public boolean test(PersonaAddress address) {
        if (address != null) {
            return address.getType().equals(AddressType.BILLING);
        }
        else return false;
    }
}
