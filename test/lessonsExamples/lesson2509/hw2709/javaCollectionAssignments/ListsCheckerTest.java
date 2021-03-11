package lessonsExamples.lesson2509.hw2709.javaCollectionAssignments;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListsCheckerTest {

    @Test
    void checkTwoLists_listIntegerAndListInteger_listString() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(5, 2, 3, 8));
        List<String> result = new ArrayList<>(Arrays.asList("No", "Yes", "Yes", "No"));
        ListsChecker testChecker = new ListsChecker(list1, list2);
        assertEquals(result, testChecker.checkTwoLists());
    }

    @Test
    void checkTwoLists_listIntegerAndListIntegerWithSameNumbers_listOfYes() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<String> result = new ArrayList<>(Arrays.asList("Yes", "Yes", "Yes", "Yes"));
        ListsChecker testChecker = new ListsChecker(list1, list2);
        assertEquals(result, testChecker.checkTwoLists());
    }

    @Test
    void checkTwoLists_emptyList_emptyListOfString() {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<String> result = new ArrayList<>();
        ListsChecker testChecker = new ListsChecker(list1, list2);
        assertEquals(result, testChecker.checkTwoLists());
    }

    @Test
    void checkTwoLists_NullAndListIntegerWithSameNumbers_listOfYes() {
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<String> result = new ArrayList<>();
        ListsChecker testChecker = new ListsChecker(null, list2);
        assertEquals(result, testChecker.checkTwoLists());
    }
}