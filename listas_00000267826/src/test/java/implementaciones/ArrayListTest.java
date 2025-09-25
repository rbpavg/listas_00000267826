package implementaciones;

import java.util.Iterator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ren
 */
public class ArrayListTest {
    
    public ArrayListTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of set method, of class ArrayList.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        Object o = null;
        int i = 0;
        ArrayList instance = new ArrayList<>(Integer.class, 10);
        instance.set(o, i);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class ArrayList.
     */
    @Test
    public void testRemove_GenericType() {
        System.out.println("remove");
        Object o = null;
        ArrayList instance = new ArrayList<>(Integer.class, 10);
        boolean expResult = false;
        boolean result = instance.remove(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of indexOf method, of class ArrayList.
     */
    @Test
    public void testIndexOf() {
        System.out.println("indexOf");
        Object o = null;
        ArrayList instance = new ArrayList<>(Integer.class, 10);
        int expResult = 0;
        int result = instance.indexOf(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class ArrayList.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        ArrayList instance = new ArrayList<>(Integer.class, 10);
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of append method, of class ArrayList.
     */
    @Test
    public void testAppend() {
        System.out.println("append");
        Object o = null;
        ArrayList instance = new ArrayList<>(Integer.class, 10);
        instance.append(o);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class ArrayList.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Object o = null;
        int i = 0;
        ArrayList instance = new ArrayList<>(Integer.class, 10);
        instance.insert(o, i);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class ArrayList.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int i = 0;
        ArrayList instance = new ArrayList<>(Integer.class, 10);
        Object expResult = null;
        Object result = instance.get(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class ArrayList.
     */
    @Test
    public void testRemove_int() {
        System.out.println("remove");
        int i = 0;
        ArrayList instance = new ArrayList<>(Integer.class, 10);
        Object expResult = null;
        Object result = instance.remove(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of empty method, of class ArrayList.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        ArrayList instance = new ArrayList<>(Integer.class, 10);
        boolean expResult = true;
        boolean result = instance.empty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class ArrayList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ArrayList instance = new ArrayList<>(Integer.class, 10);
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ArrayList.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ArrayList instance = new ArrayList<>(Integer.class, 10);
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
