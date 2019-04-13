package config;

import Server.config.DemoAppConfig;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;

import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * The type Demo app config test.
 */
@RunWith(MockitoJUnitRunner.class)
public class DemoAppConfigTest {

    @Mock
    private Environment mockEnv;

    @InjectMocks
    private DemoAppConfig demoAppConfigUnderTest;
    private Logger loggerTest;

    /**
     * Sets up.
     */
    @Before
    public void setUp() {
        initMocks(this);
    }

    /**
     * Test my data source.
     */
    @Test
    public void testMyDataSource() {
        // Setup
        final DataSource expectedResult = null;

        // Run the test
        final DataSource result = demoAppConfigUnderTest.myDataSource();

        // Verify the results
        assertEquals(expectedResult, result);

//        when(demoAppConfigUnderTest.myDataSource().se).thenReturn(expectedResult);
//        assertEquals(expectedResult, friendDAOImplUnderTest.getFriends());
    }

    /**
     * Test session factory.
     */
    @Test
    public void testSessionFactory() {
        // Setup
        final LocalSessionFactoryBean expectedResult = null;

        // Run the test
        final LocalSessionFactoryBean result = demoAppConfigUnderTest.sessionFactory();

        // Verify the results
        assertEquals(expectedResult, result);
    }

    /**
     * Test transaction manager.
     */
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
