package lessonsExamples.lesson0109.hw0109;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Persona {
    private String name;
    private String secondName;
    private List<PersonaAddress> addresses;

    public Persona(String name, String secondName, List<PersonaAddress> addresses) {
        this.name = Objects.requireNonNull(name);
        this.secondName = Objects.requireNonNull(secondName);
        this.addresses = Objects.requireNonNull(addresses);
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public List<PersonaAddress> getAddresses(){
            List<PersonaAddress> res = new ArrayList<>();
            for (PersonaAddress address : addresses) {
                    res.add(address);
            }
            return res;
    }

    @Override
    public String toString() {
        return "Person{" + name + '\'' +
                " " + secondName + '\'' +
                ", addresses= [" + addresses +
                "]}";
    }
}
