package addressParsing;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ListHandler {
    List<PersonP> list;
    Predicate<String> predicate;
    List<String> emailsAndNamesList;

    public ListHandler(List<PersonP> list, Predicate<String> predicate) {
        this.list = list;
        this.predicate = predicate;
    }

    public List<String> toHandTheListWithEmails() {
        StringBuilder temp = new StringBuilder();

        for (PersonP s : this.list) {
            if (s.getAddresses() != null & s.getName() != null) {
                if (this.predicate.test(s.getAddresses().getEmail())) {
                    temp.append(s.getName() + " " + s.getAddresses().getEmail());
                    if ((temp.toString()).length() > 0) {
                        this.emailsAndNamesList.add(temp.toString());
                    }
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
