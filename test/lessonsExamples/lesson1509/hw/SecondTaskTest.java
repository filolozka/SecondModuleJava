package lessonsExamples.lesson1509.hw;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SecondTaskTest {

    @Test
    void putNewListToMap_mapAndListWithDoubles_map() {
        List<String> listForChecking = new ArrayList<>();
        listForChecking.add("7648_s");
        listForChecking.add("7649_s");
        listForChecking.add("7650_s");

        Map<String, Integer> mapOfStringAndInt = new HashMap<>();
        mapOfStringAndInt.put("7648_s", 5);
        mapOfStringAndInt.put("7650_s", 4);
        mapOfStringAndInt.put("7646_s", 133);
        mapOfStringAndInt.put("7649_s", 6);

        Map<String, Integer> result = new HashMap<>();
        result.put("7648_s", 5);
        result.put("7650_s", 4);
        result.put("7646_s", 133);
        result.put("7649_s", 6);
        result.put("7648_s7649_s7650_s", 15);

        assertEquals(result, SecondTask.putNewListToMap(mapOfStringAndInt, listForChecking));
    }

    @Test
    void putNewListToMap_mapAndListWithoutDoubles_map() {
        List<String> listForChecking = new ArrayList<>();
        listForChecking.add("3356_s");
        listForChecking.add("4366_s");
        listForChecking.add("4345_s");

        Map<String, Integer> mapOfStringAndInt = new HashMap<>();
        mapOfStringAndInt.put("7648_s", 5);
        mapOfStringAndInt.put("7650_s", 4);
        mapOfStringAndInt.put("7646_s", 133);
        mapOfStringAndInt.put("7642_s", 129);
        mapOfStringAndInt.put("7641_s", 128);
        mapOfStringAndInt.put("7649_s", 6);

        Map<String, Integer> result = new HashMap<>(mapOfStringAndInt);

        assertEquals(result, SecondTask.putNewListToMap(mapOfStringAndInt, listForChecking));
    }

    @Test
    void putNewListToMap_emptyList_map() {
        List<String> listForChecking = new ArrayList<>();

        Map<String, Integer> mapOfStringAndInt = new HashMap<>();
        mapOfStringAndInt.put("7648_s", 5);
        mapOfStringAndInt.put("7650_s", 4);
        mapOfStringAndInt.put("7646_s", 133);
        mapOfStringAndInt.put("7642_s", 129);
        mapOfStringAndInt.put("7641_s", 128);
        mapOfStringAndInt.put("7649_s", 6);

        assertEquals(mapOfStringAndInt, SecondTask.putNewListToMap(mapOfStringAndInt, listForChecking));
    }

    @Test
    void putNewListToMap_emptyMap_map() {
        List<String> listForChecking = new ArrayList<>();
        listForChecking.add("3356_s");
        listForChecking.add("4366_s");
        listForChecking.add("4345_s");

        Map<String, Integer> mapOfStringAndInt = new HashMap<>();
        Map<String, Integer> result = new HashMap<>();

        assertEquals(result, SecondTask.putNewListToMap(mapOfStringAndInt, listForChecking));
    }

    @Test
    void putNewListToMap_mapAndNullList_map() {
        Map<String, Integer> mapOfStringAndInt = new HashMap<>();
        mapOfStringAndInt.put("7648_s", 5);
        mapOfStringAndInt.put("7650_s", 4);
        mapOfStringAndInt.put("7646_s", 133);
        mapOfStringAndInt.put("7642_s", 129);
        mapOfStringAndInt.put("7641_s", 128);
        mapOfStringAndInt.put("7649_s", 6);

        Map<String, Integer> result = new HashMap<>();
        result.put("7648_s", 5);
        result.put("7650_s", 4);
        result.put("7646_s", 133);
        result.put("7642_s", 129);
        result.put("7641_s", 128);
        result.put("7649_s", 6);

        assertEquals(result, SecondTask.putNewListToMap(mapOfStringAndInt, null));
    }

    @Test
    void putNewListToMap_nullMap_map() {
        List<String> listForChecking = new ArrayList<>();
        listForChecking.add("3356_s");
        listForChecking.add("4366_s");
        listForChecking.add("4345_s");

        Map<String, Integer> result = new HashMap<>();

        assertEquals(result, SecondTask.putNewListToMap(null, listForChecking));
    }

    @Test
    void checkListWithMap_listWithSameKeysMap_true() {
        List<String> listForChecking = new ArrayList<>();
        listForChecking.add("7648_s");
        listForChecking.add("7649_s");
        listForChecking.add("7650_s");

        Map<String, Integer> mapOfStringAndInt = new HashMap<>();
        mapOfStringAndInt.put("7648_s", 5);
        mapOfStringAndInt.put("7650_s", 4);
        mapOfStringAndInt.put("7646_s", 133);
        mapOfStringAndInt.put("7642_s", 129);
        mapOfStringAndInt.put("7649_s", 6);

        assertTrue(SecondTask.checkListWithMap(mapOfStringAndInt, listForChecking));
    }

    @Test
    void checkListWithMap_listDoNotHaveSameKeysAsInMap_false() {
        List<String> listForChecking = new ArrayList<>();
        listForChecking.add("7648_s");
        listForChecking.add("7649_s");
        listForChecking.add("7650_s");

        Map<String, Integer> mapOfStringAndInt = new HashMap<>();
        mapOfStringAndInt.put("7646_e", 133);
        mapOfStringAndInt.put("7642_d", 129);
        mapOfStringAndInt.put("7640_a", 130);

        assertFalse(SecondTask.checkListWithMap(mapOfStringAndInt, listForChecking));
    }

    @Test
    void checkListWithMap_emptyListMap_false() {
        List<String> listForChecking = new ArrayList<>();

        Map<String, Integer> mapOfStringAndInt = new HashMap<>();
        mapOfStringAndInt.put("7648_s", 5);
        mapOfStringAndInt.put("7650_s", 4);
        mapOfStringAndInt.put("7646_s", 133);
        mapOfStringAndInt.put("7642_s", 129);
        mapOfStringAndInt.put("7649_s", 6);

        assertFalse(SecondTask.checkListWithMap(mapOfStringAndInt, listForChecking));
    }

    @Test
    void checkListWithMap_listAndEmptyMap_false() {
        List<String> listForChecking = new ArrayList<>();
        listForChecking.add("7648_s");
        listForChecking.add("7649_s");
        listForChecking.add("7650_s");

        Map<String, Integer> mapOfStringAndInt = new HashMap<>();

        assertFalse(SecondTask.checkListWithMap(mapOfStringAndInt, listForChecking));
    }

    @Test
    void checkListWithMap_nullListAndMap_false() {
        Map<String, Integer> mapOfStringAndInt = new HashMap<>();
        mapOfStringAndInt.put("7648_s", 5);
        mapOfStringAndInt.put("7650_s", 4);
        mapOfStringAndInt.put("7646_s", 133);
        mapOfStringAndInt.put("7642_s", 129);
        mapOfStringAndInt.put("7649_s", 6);

        assertFalse(SecondTask.checkListWithMap(mapOfStringAndInt, null));
    }

    @Test
    void checkListWithMap_listAndNullMap_false() {
        List<String> listForChecking = new ArrayList<>();
        listForChecking.add("7648_s");
        listForChecking.add("7649_s");
        listForChecking.add("7650_s");

        assertFalse(SecondTask.checkListWithMap(null, listForChecking));
    }

    @Test
    void getSumKeysAndValues_listAndMap_mapWithSum() {
        List<String> listForChecking = new ArrayList<>();
        listForChecking.add("7648_s");
        listForChecking.add("7649_s");
        listForChecking.add("7650_s");

        Map<String, Integer> mapOfStringAndInt = new HashMap<>();
        mapOfStringAndInt.put("7648_s", 5);
        mapOfStringAndInt.put("7650_s", 4);
        mapOfStringAndInt.put("7646_s", 133);
        mapOfStringAndInt.put("7642_s", 129);
        mapOfStringAndInt.put("7641_s", 128);
        mapOfStringAndInt.put("7649_s", 6);

        Map<String, Integer> result = new HashMap<>();
        result.put("7648_s7649_s7650_s", 15);

        assertEquals(result, SecondTask.getSumKeysAndValues(mapOfStringAndInt, listForChecking));
    }
}