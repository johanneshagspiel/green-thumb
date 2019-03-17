package com.luv2code.springdemo.test.config;

import com.luv2code.springdemo.config.DemoAppConfig;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

<<<<<<< .merge_file_a05528
/**
 * The type Demo app config test.
 */
=======
>>>>>>> .merge_file_a02896
public class DemoAppConfigTest {

    @Mock
    private Environment mockEnv;

    @InjectMocks
    private DemoAppConfig demoAppConfigUnderTest;

<<<<<<< .merge_file_a05528
    /**
     * Sets up.
     */
=======
>>>>>>> .merge_file_a02896
    @Before
    public void setUp() {
        initMocks(this);
    }

<<<<<<< .merge_file_a05528
    /**
     * Test my data source.
     */
=======
>>>>>>> .merge_file_a02896
    @Test
    public void testMyDataSource() {
        // Setup
        final DataSource expectedResult = null;

        // Run the test
        final DataSource result = demoAppConfigUnderTest.myDataSource();

        // Verify the results
        assertEquals(expectedResult, result);
    }

<<<<<<< .merge_file_a05528
    /**
     * Test session factory.
     */
=======
>>>>>>> .merge_file_a02896
    @Test
    public void testSessionFactory() {
        // Setup
        final LocalSessionFactoryBean expectedResult = null;

        // Run the test
        final LocalSessionFactoryBean result = demoAppConfigUnderTest.sessionFactory();

        // Verify the results
        assertEquals(expectedResult, result);
    }

<<<<<<< .merge_file_a05528
    /**
     * Test transaction manager.
     */
=======
>>>>>>> .merge_file_a02896
    @Test
    public void testTransactionManager() {
        // Setup
        final SessionFactory sessionFactory = null;
        final HibernateTransactionManager expectedResult = null;

        // Run the test
        final HibernateTransactionManager result = demoAppConfigUnderTest.transactionManager(sessionFactory);

        // Verify the results
        assertEquals(expectedResult, result);
    }
}
