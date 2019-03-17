package test.entity;

import entity.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

<<<<<<< .merge_file_a18328
/**
 * The type User test.
 */
=======
>>>>>>> .merge_file_a00860
public class UserTest {

    private User userUnderTest;

<<<<<<< .merge_file_a18328
    /**
     * Sets up.
     */
=======
>>>>>>> .merge_file_a00860
    @Before
    public void setUp() {
        userUnderTest = new User();
    }

<<<<<<< .merge_file_a18328
    /**
     * Test to string.
     */
=======
>>>>>>> .merge_file_a00860
    @Test
    public void testToString() {
        // Setup
        final String expectedResult = "result";

        // Run the test
        final String result = userUnderTest.toString();

        // Verify the results
        assertEquals(expectedResult, result);
    }
<<<<<<< .merge_file_a18328


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
=======
>>>>>>> .merge_file_a00860
}
