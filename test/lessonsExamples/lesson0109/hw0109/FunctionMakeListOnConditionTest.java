package lessonsExamples.lesson0109.hw0109;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FunctionMakeListOnConditionTest {

    @Test
    public void apply_inputPersonaList_PredicateAddress_outStringList() {
        List<PersonaAddress> p1adress = new ArrayList();
        p1adress.add(new PersonaAddress(AddressType.EMAIL, "dsfsd@dsfsd"));
        p1adress.add(new PersonaAddress(AddressType.BILLING, "Berlin, Schwarzcopf, 65"));

        List<PersonaAddress> p2adress = new ArrayList();
        p2adress.add(new PersonaAddress(AddressType.EMAIL, "qwer@dsfsd"));

        List<PersonaAddress> p3adress = new ArrayList();
        p3adress.add(new PersonaAddress(AddressType.EMAIL, "mwkfp@dsfsd"));
        p3adress.add(new PersonaAddress(AddressType.DELIVERY, "Korolyev, Lenina, 5"));

        List<PersonaAddress> p4adress = new ArrayList();
        p4adress.add(new PersonaAddress(AddressType.BILLING, "Serpuchov, Lenina, 5"));
        p4adress.add(new PersonaAddress(AddressType.DELIVERY, "Serpuchov, Lenina, 5"));


        Persona p1 = new Persona(
                "Ivan", "Ivanov", p1adress);
        Persona p2 = new Persona(
                "Petra", "Schmidt", p2adress);
        Persona p3 = new Persona(
                "Andrea", "Schwarz", p3adress);
        Persona p4 = new Persona(
                "Paul", "Petroff", p4adress);

        List<Persona> input = new ArrayList<>();
        input.add(p1);
        input.add(p2);
        input.add(p3);
        input.add(p4);
        FunctionMakeListOnCondition function = new FunctionMakeListOnCondition();
        PredicateMissOneTypeOfAddress predicate = new PredicateMissOneTypeOfAddress();
        List<Persona> output = new ArrayList<>();
        output.add(p2);
        output.add(p3);
        assertEquals(function.apply(input, predicate), output);
    }

    @Test
    public void apply_null_PredicateAddress_StringList() {
        FunctionMakeListOnCondition function = new FunctionMakeListOnCondition();
        PredicateMissOneTypeOfAddress predicate = new PredicateMissOneTypeOfAddress();
        List<Persona> output = new ArrayList<>();
        assertEquals(function.apply(null, predicate), output);
    }

    @Test
    public void apply_emptyPersonaList_StringList() {
        FunctionMakeListOnCondition function = new FunctionMakeListOnCondition();
        PredicateMissOneTypeOfAddress predicate = new PredicateMissOneTypeOfAddress();
        List<Persona> output = new ArrayList<>();
        List<Persona> input = new ArrayList<>();
        assertEquals(function.apply(input, predicate), output);
    }
}