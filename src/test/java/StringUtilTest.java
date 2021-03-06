import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by mehdi on 1/19/16.
 */
public class StringUtilTest {
    StringUtil util;

    @Before
    public void setUp() throws Exception {
        util = new StringUtilImpl();
    }

    @Test
    public void testIsEmpty() throws Exception {
        assertTrue(util.isEmpty(null));
        assertTrue(util.isEmpty(""));
        assertTrue(util.isEmpty("   "));
        assertFalse(util.isEmpty("1"));
        assertFalse(util.isEmpty(" 1 "));
    }

    @Test
    public void testEquality(){
        String sample = "    ABC  ";
        String origin = new String(sample);
        util.isEmpty(sample);
        assertEquals(sample, origin);
    }
}
