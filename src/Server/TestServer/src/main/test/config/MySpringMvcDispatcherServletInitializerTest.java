package config;

import server.config.MySpringMvcDispatcherServletInitializer;
import org.junit.Before;
import org.junit.Test;

/**
 * The type My spring mvc dispatcher servlet initializer test.
 */
public class MySpringMvcDispatcherServletInitializerTest {

    private MySpringMvcDispatcherServletInitializer mySpringMvcDispatcherServletInitializerUnderTest;

    /**
     * Sets up.
     */
    @Before
    public void setUp() {
        mySpringMvcDispatcherServletInitializerUnderTest = new MySpringMvcDispatcherServletInitializer();
    }

    @Test
    public void testGetRootConfigClasses() {

    }

    @Test
    public void testGetServletConfigClasses() {

    }

    @Test
    public void testGetServletMappings() {
       }
}
