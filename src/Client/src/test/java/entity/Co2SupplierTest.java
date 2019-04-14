package entity;

import entity.Co2Supplier;

import org.junit.Test;
import static org.junit.Assert.*;
/** the supplier test. */
public class Co2SupplierTest {
    
	/** test constructor*/
	@Test
	public void testConstructor() {
		
		Co2Supplier Ardy = new Co2Supplier();
		
		assertNotNull(Ardy);
	}
	
	/** test bike. */
    @Test
    public final void testBikeNegative() {
        int km = -10;
        assertEquals(
                "a negative value gives no saved co2",
                Co2Supplier.bike(km),
                0.0, 0);
    }
    /** test bike. */
    @Test
    public final void testBikePositive() {
        int km = 10;
        assertEquals(
                "the km value should be multiplied by .016",
                Co2Supplier.bike(km),
                km * .016, 0);
    }
    /** test car. */
    @Test
    public final void testCarNegative() {
        int km = -10;
        assertEquals(
                "Negative numbers should just return 0",
                Co2Supplier.car(km),
                0, 0);
    }
    /** test car. */
    @Test
    public final void testCarPostive() {
        int km = 10;
        assertEquals(
                "km should be multiplied by .271",
                Co2Supplier.car(km),
                km * .271, 0);
    }
    /** test public transport. */
    @Test
    public final void testPublicTransportNegative() {
        int km = -10;
        assertEquals(
                "negative should return 0",
                Co2Supplier.publicTransport(km),
                0, 0);
    }
    /** test public transport. */
    @Test
    public final void testPublicTransportPositive() {
        int km = 10;
        assertEquals(
                "km should return multiplied by .101",
                Co2Supplier.publicTransport(km),
                km * .101, 0);
    }
    /** test bike vs car. */
    @Test
    public final void testBikeVsCarNegative() {
        int km = -10;
        assertEquals(
                "the difference should be 0",
                Co2Supplier.bikeVsCar(km),
                0, 0);
    }
    /** test bike vs car. */
    @Test
    public final void testBikeVsCarPositive() {
        int km = 10;
        double difference = 2.55;
        assertEquals(
                "difference should be km * .271 - km * .016",
                Co2Supplier.bikeVsCar(km),
                difference, 0);
    }
    /** test public transport vs car. */
    @Test
    public final void testPublicTransportVsCarNegative() {
        int km = -10;
        double difference = 0;
        assertEquals(
                "negative km's should return 0",
                Co2Supplier.publicTransportVsCar(km),
                0, 0);
    }
    /** test public transport vs car. */
    @Test
    public final void testPublicTransportVsCarPositive() {
        int km = 10;
        double difference = 1.7;
        assertEquals(
                "difference should be .271 * 10 - .101 * 10",
                Co2Supplier.publicTransportVsCar(km),
                difference, 0);
    }
    /** test public transport vs bike. */
    @Test
    public final void testBikeVsPublicTransportNegative() {
        int km = -10;
        assertEquals("negative input should return 0",
                Co2Supplier.bikeVsPublicTransport(km),
                0, 0);
    }
    /** test public transport vs bike. */
    @Test
    public final void testBikeVsPublicTransportPositive() {
        int km = 10;
        double difference = .85;
        assertEquals("should return .101*10 - .016*10",
                Co2Supplier.bikeVsPublicTransport(km),
                difference, 0);
    }
    /** test local vegetarian. */
    @Test
    public final void testLocalVegetarianMeal() {
        double CO2 = 1.2065;
        assertEquals("Should return 1.2065",
                Co2Supplier.meal(
                        true, true),
                CO2, 0);
    }
    /** test normal meal. */
    @Test
    public final void testNormalMeal() {
        double CO2 = 1.8748;
        assertEquals(
                "should return 1.9749, since that "
                         + "is how much a normal mael costs",
                Co2Supplier.meal(
                        false, false),
                CO2, 0);
    }
    /** test meal difference. */
    @Test
    public final void testMealDifference() {
        double difference = 1.8748 - 1.2065;
        assertEquals(
                "mealDifference should return a "
                         + "double equal to the difference variable",
                Co2Supplier.mealDifference(
                        true, true),
                difference, 0);
    }
    /** test solar panel. */
    @Test
    public final void testSolarpanelNegative() {
        int solarpanels = -5;
        assertEquals(
                "negative amount of panels should return 0",
                Co2Supplier.solarPanel(solarpanels),
                0, 0);
    }
    /** test solar panel. */
    @Test
    public final void testSolarpanelPositive() {
        int solarpanels = 5;
        double difference = 4.5 * solarpanels * .3 * .558;
        assertEquals(
                "should return difference",
                Co2Supplier.solarPanel(solarpanels),
                difference, 0);
    }
    /** test Temperature. */
    @Test
    public final void testTemperatureNegativeInhabitants() {
        assertEquals(
                "Negative inhabitants returns 0",
                Co2Supplier.temperature(-5, 1),
                0, 0);
    }
    /** test Temperature. */
    @Test
    public final void testTemperatureNegativeDegrees() {
        assertEquals(
                "should return 0",
                Co2Supplier.temperature(1, -1),
                0, 0);
    }
    /** test Temperature. */
    @Test
    public final void testTemperatureOneDegree() {
        assertEquals("sadf", Co2Supplier.temperature(2, 1), .35467, .0001);
    }
    /** test Temperature. */
    @Test
    public final void testTemperatureMultipleDegrees() {
        double result = ((4000.0 / 365.0)
                - (4000.0 / 365.0) * .92 * .92 * .92) * .558;
        assertEquals("test whether it works with multiple degrees difference",
                Co2Supplier.temperature(3, 3),
                result, .0001);
    }
    /** test Temperature. */
    @Test
    public final void testUsedTemperatureOneDegree() {
        double result = (2900.0 / 365.0) * .92 * .558;
        assertEquals("it should return the amount of CO2 saved",
                Co2Supplier.usedTemperature(2, 1),
                result, 0.001);
    }
    /** test Temperature. */
    @Test
    public final void testUsedTemperatureMultipleDegrees() {
        double result = (2900.0 / 365.0) * .92 * .92 * .558;
        assertEquals("it should return the amount of CO2 saved",
                Co2Supplier.usedTemperature(2, 2),
                result, 0.001);
    }
    /** test KWH. */
    @Test
    public final void testGetKWHNoInhabitants() {
        double result = 0;
        assertEquals("no inhabitants, no used KWH",
                Co2Supplier.getKWH(
                        0, 0),
                0, 0);
    }
    /** test KWH. */
    @Test
    public final void testGetKWHSevenInhabitants() {
        double result = 5300.0 / 365.0;
        assertEquals("should return result",
                Co2Supplier.getKWH(7, 0),
                result, 0);
    }
    
    /** test KWH. */
    @Test
    public final void testGetKWHFourInhabitants() {
        double result = 4600.0 / 365.0;
        assertEquals("should return result",
                Co2Supplier.getKWH(4, 0),
                result, 0);
    }
    
    /** test solar panel. */
    @Test
    public final void testSolarPanelUsed() {
        double result = 2900.0 / 365.0 * .558 -  4.5 * 2 * 0.300 * 0.558;
        assertEquals("The solare panels should have saved result amount",
                Co2Supplier.solarPanelUsed(2, 2),
                result, 0);
    }
    
    /** test solar panel. */
    @Test
    public final void testSolarPanelUsedSmallZero() {
        double result = 0.0;
        assertEquals("The solare panels should have saved result amount",
                Co2Supplier.solarPanelUsed(-12, 2),
                result, 0);
    }
}
