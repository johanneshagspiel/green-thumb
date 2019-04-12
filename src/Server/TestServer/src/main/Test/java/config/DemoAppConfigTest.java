package Server.test.java.config;

import Server.config.DemoAppConfig;
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

/**
 * The type Demo app config test.
 */
public class DemoAppConfigTest {

    @Mock
    private Environment mockEnv;

    @InjectMocks
    private DemoAppConfig demoAppConfigUnderTest;

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
