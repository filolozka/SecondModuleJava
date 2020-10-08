package lessonsExamples.lesson2509.hwCollections;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MapTask4Test {

    @Test
    void countOfRepeats_listWithRepeats_int() {
        List<String> listOfNames = new ArrayList<>(Arrays.asList(
                "Luke", "Mary", "Kate", "Ivan", "Mark", "Luke", "Mary", "Lisa", "Mary", "Luke"));
        assertEquals(3, MapTask4.countOfRepeats(listOfNames, "Mary"));
    }

    @Test
    void countOfRepeats_listNoRepeat_int() {
        List<String> listOfNames = new ArrayList<>(Arrays.asList(
                "Luke", "Kate", "Ivan", "Mark", "Luke", "Lisa", "Mary", "Luke"));
        assertEquals(1, MapTask4.countOfRepeats(listOfNames, "Mary"));
    }

    @Test
    void countOfRepeats_nullAndString_0() {
        assertEquals(0, MapTask4.countOfRepeats(null, "Mary"));
    }

    @Test
    void countOfRepeats_listAndNull_int() {
        List<String> listOfNames = new ArrayList<>(Arrays.asList(
                "Luke", "Kate", "Ivan", "Mark", "Luke", "Lisa", "Mary", "Luke"));
        assertEquals(0, MapTask4.countOfRepeats(listOfNames, null));
    }
}