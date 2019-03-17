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
    }

    @Test
    public void getUser_name() {
        User test = new User();
        test.setUser_name("Test");
        assertEquals(test.getId(), "Test");
    }

    @Test
    public void setUser_name() {
    }

    @Test
    public void getPassword() {
    }

    @Test
    public void setPassword() {
    }

    @Test
    public void getVegetarian() {
    }

    @Test
    public void setVegetarian() {
    }

    @Test
    public void getProduce() {
    }

    @Test
    public void setProduce() {
    }

    @Test
    public void getTransportation() {
    }

    @Test
    public void setTransportation() {
    }

    @Test
    public void getTemperature() {
    }

    @Test
    public void setTemperature() {
    }

    @Test
    public void getSolar() {
    }

    @Test
    public void setSolar() {
    }
}
