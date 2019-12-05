package structure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

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



}
