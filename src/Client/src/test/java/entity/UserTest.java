package test.entity;

import entity.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * The type User test.
 */
public class UserTest {

    @Test
    public void test_Constructor() {
        User test = new User();
        assertNotNull(test);
    }

    @Test
    public void test_getId() {
        User test = new User();
        test.setId(1);
        assertEquals(test.getId(), 1);
    }

    @Test
    public void test_setId() {
        User test = new User();
        test.setId(1);
        assertEquals(test.getId(), 1);
        test.setId(5);
        assertEquals(test.getId(), 5);
    }

    @Test
    public void test_getUser_name() {
        User test = new User();
        test.setUser_name("Test");
        assertEquals(test.getUser_name(), "Test");
    }

    @Test
    public void test_setUser_name() {
        User test = new User();
        test.setUser_name("Test");
        assertEquals(test.getUser_name(), "Test");
        test.setUser_name("Passed");
        assertEquals(test.getUser_name(), "Passed");
    }

    @Test
    public void test_getPassword() {
        User test = new User();
        test.setPassword("Test");
        assertEquals(test.getPassword(), "Test");
    }

    @Test
    public void test_setPassword() {
        User test = new User();
        test.setPassword("Test");
        assertEquals(test.getPassword(), "Test");
        test.setPassword("Passed");
        assertEquals(test.getPassword(), "Passed");
    }

    @Test
    public void test_getVegetarian() {
        User test = new User();
        test.setVegetarian(100);
        assertEquals(test.getVegetarian(), 100);
    }

    @Test
    public void test_setVegetarian() {
        User test = new User();
        test.setVegetarian(100);
        assertEquals(test.getVegetarian(), 100);
        test.setVegetarian(50);
        assertEquals(test.getVegetarian(), 50);
    }

    @Test
    public void test_getProduce() {
        User test = new User();
        test.setProduce(100);
        assertEquals(test.getProduce(), 100);
    }

    @Test
    public void test_setProduce() {
        User test = new User();
        test.setProduce(100);
        assertEquals(test.getProduce(), 100);
        test.setProduce(50);
        assertEquals(test.getProduce(), 50);
    }


    @Test
    public void test_getTemperature() {
        User test = new User();
        test.setTemperature(100);
        assertEquals(test.getTemperature(), 100);
    }

    @Test
    public void test_setTemperature() {
        User test = new User();
        test.setTemperature(100);
        assertEquals(test.getTemperature(), 100);
        test.setTemperature(50);
        assertEquals(test.getTemperature(), 50);
    }

    @Test
    public void test_getSolar() {
        User test = new User();
        test.setSolar(100);
        assertEquals(test.getSolar(), 100);
    }

    @Test
    public void test_setSolar() {
        User test = new User();
        test.setSolar(100);
        assertEquals(test.getSolar(), 100);
        test.setSolar(50);
        assertEquals(test.getSolar(), 50);
    }
    
    @Test
    public void test_toString() {
    	User test = new User();
    	System.out.println(test.toString());
    	assertTrue(test.toString().equals("User [id=0, user_name=null, password=null, vegetarian=0, produce=0, transportation=0, temperature=0, solar=0]"));
    }
}
