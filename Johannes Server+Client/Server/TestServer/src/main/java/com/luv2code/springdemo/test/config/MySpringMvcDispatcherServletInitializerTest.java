package com.luv2code.springdemo.test.config;

import com.luv2code.springdemo.config.MySpringMvcDispatcherServletInitializer;
import org.junit.Before;

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
}
