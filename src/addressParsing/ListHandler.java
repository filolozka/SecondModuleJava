package addressParsing;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ListHandler {
    List<PersonP1> list;
    Predicate<String> predicate;
    List<String> emailsAndNamesList;

    public ListHandler(List<PersonP1> list, Predicate<String> predicate) {
        this.list = list;
        this.predicate = predicate;
    }

    public List<String> toHandTheListWithEmails() {
        StringBuilder temp = new StringBuilder();

        for (PersonP1 s : this.list) {
            if (s.getAddresses() != null & s.getName() != null) {
                if (this.emailsAndNamesList != null) {
                    if (this.predicate.test(s.getAddresses().getEmail())) {
                        temp.append(s.getName() + " " + s.getAddresses().getEmail());
                        this.emailsAndNamesList.add(temp.toString());
                    }
                } else {
                    this.emailsAndNamesList = new ArrayList<>();
                }

            } else return null;
        }
        return this.emailsAndNamesList;
    }

    @Override
    public String toString() {
        return "List{" +
                emailsAndNamesList +
                '}';
    }
}
