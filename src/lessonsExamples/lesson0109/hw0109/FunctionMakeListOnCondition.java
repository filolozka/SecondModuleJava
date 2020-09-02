package lessonsExamples.lesson0109.hw0109;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class FunctionMakeListOnCondition implements BiFunction<List<Persona>, Predicate<PersonaAddress>, List<Persona>> {

    @Override
    public List<Persona> apply(List<Persona> people, Predicate<PersonaAddress> stringPredicate) {
        List<Persona> newList = new ArrayList<>();
        if (people == null) return newList;
        for (Persona persona : people) {
            for (PersonaAddress address : persona.getAddresses()){
                if (new PredicateMissOneTypeOfAddress().test(address)){
                    break;
                }
                else {
                    newList.add(persona);
                }
            }
        }
        return newList;
    }
}
