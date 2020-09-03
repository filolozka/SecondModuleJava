package lessonsExamples.lesson0109.hw0109;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class FunctionMakeListOnCondition implements BiFunction<List<Persona>, PredicateMissOneTypeOfAddress, List<Persona>> {

    @Override
    public List<Persona> apply(List<Persona> people, PredicateMissOneTypeOfAddress stringPredicate) {
        List<Persona> newList = new ArrayList<>();
        boolean isTheBillingInTheList = false;
        if (people == null) return newList;
        for (Persona persona : people) {
                for (PersonaAddress address : persona.getAddresses()) {
                    if (stringPredicate.test(address)) {
                        isTheBillingInTheList = true;
                        break;
                    }
                    else {
                        isTheBillingInTheList = false;
                    }
                }
                if (!isTheBillingInTheList){
                    newList.add(persona);
                }
        }
        return newList;
    }
}
