package helper;

import static org.junit.Assert.*;

import org.junit.Test;

import helper.PointsMissing;

public class PointsMissingTest {
	
	final int result = 544;

	@Test
	public void testUnderThousand() {
		
		int pointsIn = 456;
		
		assertEquals( PointsMissing.determiningPoints(pointsIn), result );
	}
	
	@Test
	public void testAboveThousand() {
		
		int pointsIn = 12456;
		
		assertEquals( PointsMissing.determiningPoints(pointsIn), result );
	}

}
