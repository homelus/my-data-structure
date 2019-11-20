package structure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AbstractMapTest {

    AbstractMap data = new AbstractMap();

    @BeforeEach
    void setUp() {
        data.add("jun");
        data.add("min");
        data.add("jun");
    }

    @Test
    void size() {
        assertEquals(data.size(), 2);
    }

    @Test
    void iterator() {
        Iterator iterator = data.iterator();
        List<String> names = new ArrayList<String>();

        while (iterator.hasNext()) {
            String name = (String) iterator.next();
            names.add(name);
        }

        java.util.HashMap map = new java.util.HashMap();

        assertEquals(2, names.size());
        assertTrue(names.contains("jun"));
        assertTrue(names.contains("min"));

    }


}
