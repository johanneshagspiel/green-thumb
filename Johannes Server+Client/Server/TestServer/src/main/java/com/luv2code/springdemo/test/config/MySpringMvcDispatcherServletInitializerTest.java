package com.luv2code.springdemo.test.config;

import com.luv2code.springdemo.config.MySpringMvcDispatcherServletInitializer;
import org.junit.Before;

public class MySpringMvcDispatcherServletInitializerTest {

    private MySpringMvcDispatcherServletInitializer mySpringMvcDispatcherServletInitializerUnderTest;

    @Before
    public void setUp() {
        mySpringMvcDispatcherServletInitializerUnderTest = new MySpringMvcDispatcherServletInitializer();
    }
}
