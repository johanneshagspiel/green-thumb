package test.entity;

import entity.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * The type User test.
 */
public class UserTest {

    private User userUnderTest;

    /**
     * Sets up.
     */
    @Before
    public void setUp() {
        userUnderTest = new User();
    }

    /**
     * Test to string.
     */
    @Test
    public void testToString() {
        // Setup
        final String expectedResult = "result";

        // Run the test
        final String result = userUnderTest.toString();

        // Verify the results
        assertEquals(expectedResult, result);
    }


    @Test
    public void getId() {
        User test = new User();
        test.setId(1);
        assertEquals(test.getId(), 1);
    }

    @Test
    public void setId() {
        User test = new User();
        test.setId(1);
        assertEquals(test.getId(), 1);
    }

    @Test
    public void getUser_name() {
        User test = new User();
        test.setUser_name("Test");
        assertEquals(test.getUser_name(), "Test");
    }

    @Test
    public void setUser_name() {
        User test = new User();
        test.setUser_name("Test");
        assertEquals(test.getUser_name(), "Test");
    }

    @Test
    public void getPassword() {
        User test = new User();
        test.setPassword("Test");
        assertEquals(test.getPassword(), "Test");
    }

    @Test
    public void setPassword() {
        User test = new User();
        test.setPassword("Test");
        assertEquals(test.getPassword(), "Test");
    }

    @Test
    public void getVegetarian() {
        User test = new User();
        test.setVegetarian(100);
        assertEquals(test.getVegetarian(), 100);
    }

    @Test
    public void setVegetarian() {
        User test = new User();
        test.setVegetarian(100);
        assertEquals(test.getVegetarian(), 100);
    }

    @Test
    public void getProduce() {
        User test = new User();
        test.setProduce(100);
        assertEquals(test.getProduce(), 100);
    }

    @Test
    public void setProduce() {
        User test = new User();
        test.setProduce(100);
        assertEquals(test.getProduce(), 100);
    }

    @Test
    public void getTransportation() {
        User test = new User();
        test.setTransportation(100);
        assertEquals(test.getTransportation(), 100);
    }

    @Test
    public void setTransportation() {
        User test = new User();
        test.setTransportation(100);
        assertEquals(test.getTransportation(), 100);
    }

    @Test
    public void getTemperature() {
        User test = new User();
        test.setTemperature(100);
        assertEquals(test.getTemperature(), 100);
    }

    @Test
    public void setTemperature() {
        User test = new User();
        test.setTemperature(100);
        assertEquals(test.getTemperature(), 100);
    }

    @Test
    public void getSolar() {
        User test = new User();
        test.setSolar(100);
        assertEquals(test.getSolar(), 100);
    }

    @Test
    public void setSolar() {
        User test = new User();
        test.setSolar(100);
        assertEquals(test.getSolar(), 100);
    }
}
