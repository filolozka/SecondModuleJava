package lessonsExamples.lesson2509.hw2709.javaCollectionAssignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListsChecker {
    private List<Integer> list1toCheck;
    private List<Integer> list2toCheck;
    private List<String> resultsWithYesNo;

    public ListsChecker(List<Integer> list1, List<Integer> list2) {
        if (list1 != null && list2 != null) {
            this.list1toCheck = list1;
            this.list2toCheck = list2;
        }
        else {
            this.list1toCheck = new ArrayList<Integer>();
            this.list2toCheck = new ArrayList<Integer>();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListsChecker that = (ListsChecker) o;
        return Objects.equals(list1toCheck, that.list1toCheck) &&
                Objects.equals(list2toCheck, that.list2toCheck) &&
                Objects.equals(resultsWithYesNo, that.resultsWithYesNo);
    }

    public List<String> checkTwoLists() {
        this.resultsWithYesNo = new ArrayList<>();
        String yes = "Yes";
        String no = "No";
        if (list1toCheck.size() > 0 || list2toCheck.size() > 0) {
            for (int i = 0; i < list1toCheck.size(); i++) {
                if (list1toCheck.get(i).equals(list2toCheck.get(i))) {
                    resultsWithYesNo.add(yes);
                } else {
                    resultsWithYesNo.add(no);
                }
            }
        }
        return resultsWithYesNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(list1toCheck, list2toCheck);
    }

    public void setList1toCheck(List<Integer> list1toCheck) {
        this.list1toCheck = list1toCheck;
    }

    public void setList2toCheck(List<Integer> list2toCheck) {
        this.list2toCheck = list2toCheck;
    }

    @Override
    public String toString() {
        return "ListsChecker{" + resultsWithYesNo + '}';
    }
}
