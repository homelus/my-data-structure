package structure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import structure.map.HashMap;
import structure.map.Map;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author playjun
 * @since 2019 12 05
 */
public class HashMapTest {

    HashMap<Integer, String> intToStr;

    @BeforeEach
    void setUp() {
        intToStr = new HashMap<>();
        intToStr.put(1, "1");
        intToStr.put(2, "2");
        intToStr.put(3, "3");
        intToStr.put(4, "4");
    }

    @Test
    void sizeAndGet() {
        assertEquals(intToStr.size(), 4);
        assertEquals(intToStr.get(1), "1");
        assertEquals(intToStr.get(2), "2");
        assertEquals(intToStr.get(3), "3");
        assertEquals(intToStr.get(4), "4");
    }

    @Test
    void putAll() {
        HashMap<Integer, String> updatedMap = new HashMap<>();
        updatedMap.put(5, "5");
        updatedMap.put(6, "6");
        updatedMap.put(7, "7");

        intToStr.putAll(updatedMap);
        assertEquals(intToStr.size(), 7);
        assertEquals(intToStr.get(5), "5");
        assertEquals(intToStr.get(6), "6");
        assertEquals(intToStr.get(7), "7");
    }

    @Test
    void clear() {
        assertFalse(intToStr.isEmpty());
        intToStr.clear();
        assertTrue(intToStr.isEmpty());
    }

    @Test
    void defaultMethodTest() {
        intToStr.compute(1, (k, v) -> k + v + "!");
        assertEquals(intToStr.get(1), "11!");
        intToStr.computeIfAbsent(2, k -> k + "!");
        assertEquals(intToStr.get(2), "2");
        intToStr.computeIfAbsent(5, k -> k + "!");
        assertEquals(intToStr.get(5), "5!");
        intToStr.computeIfPresent(3, (k, v) -> k + v + "!");
        assertEquals(intToStr.get(3), "33!");
        intToStr.merge(4, "4", (k, v) -> k + v + "!");
        assertEquals(intToStr.get(4), "44!");
        intToStr.merge(6, "6", (k, v) -> k + v + "!");
        assertEquals(intToStr.get(6), "6");
    }

    @Test
    void spliterator() {
        Set<Map.Entry<Integer, String>> entries = intToStr.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

}
