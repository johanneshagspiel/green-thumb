package test.entity;
import entity.CO2_Supplier;

import org.junit.Test;
import static org.junit.Assert.*;

public class CO2_supplierTest {
    @Test
    public void testBikeNegative(){
        int km = -10;
        assertEquals("a negative value gives no saved co2", CO2_Supplier.bike(km), 0.0, 0);
    }

    @Test
    public void testBikePositive(){
        int km = 10;
        assertEquals("the km value should be multiplied by .016", CO2_Supplier.bike(km), km * .016, 0);
    }

    @Test
    public void testCarNegative(){
        int km = -10;
        assertEquals("Negative numbers should just return 0", CO2_Supplier.car(km), 0, 0);
    }

    @Test
    public void testCarPostive(){
        int km = 10;
        assertEquals("km should be multiplied by .271", CO2_Supplier.car(km), km * .271, 0);
    }

    @Test
    public void testPublicTransportNegative(){
        int km = -10;
        assertEquals("negative should return 0", CO2_Supplier.publicTransport(km), 0, 0);
    }

    @Test
    public void testPublicTransportPositive(){
        int km = 10;
        assertEquals("km should return multiplied by .101", CO2_Supplier.publicTransport(km), km * .101, 0);
    }
}
