package lessonsExamples.lesson2509.hwCollections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapTask2Test {
    Map<String, Boolean> mapOfResult = new HashMap<>();

    @Test
    void wordMultiple_arrayWithRepeats_mapTrueFalse() {
//wordMultiple(["c", "c", "c", "c"]) → {"c": true}
        String[] arrayToCheck = new String[]{"a", "b", "a", "c", "b"};
        mapOfResult.put("a", true);
        mapOfResult.put("b", true);
        mapOfResult.put("c", false);
        assertEquals(mapOfResult, MapTask2.wordMultiple(arrayToCheck));
    }

    @Test
    void wordMultiple_arrayWithoutRepeats_mapFalse() {
        String[] arrayToCheck = new String[]{"c", "b", "a"};
        mapOfResult.put("a", false);
        mapOfResult.put("b", false);
        mapOfResult.put("c", false);
        assertEquals(mapOfResult, MapTask2.wordMultiple(arrayToCheck));
    }

    @Test
    void wordMultiple_arrayWithOnlyRepeats_mapTrue() {
        String[] arrayToCheck = new String[]{"c", "c", "c", "c"};
        mapOfResult.put("c", true);
        assertEquals(mapOfResult, MapTask2.wordMultiple(arrayToCheck));
    }

    @Test
    void wordMultiple_null_emptyMap() {
        assertEquals(mapOfResult, MapTask2.wordMultiple(null));
    }
}