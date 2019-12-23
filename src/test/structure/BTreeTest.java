package structure;

import org.junit.Test;

/**
 * @author playjun
 * @since 2019 12 23
 */
public class BTreeTest {

    @Test
    public void add() {
        BTree<String, String> st = new BTree<>();
        st.put("jun", "seoul");
        st.put("min", "seoul");
        st.put("sub", "busan");
        st.put("hong", "seoul");
        st.put("jun", "busan");
        st.put("kang", "jeju");
        st.put("bae", "seoul");

        System.out.println(st.get("jun"));
        System.out.println(st.get("sub"));
        System.out.println(st.get("kang"));

        System.out.println("size: " + st.size());
        System.out.println("height: " + st.height());
        System.out.println(st);


    }

}
