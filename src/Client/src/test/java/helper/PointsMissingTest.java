package helper;

import static org.junit.Assert.*;

import org.junit.Test;

import helper.PointsMissing;

public class PointsMissingTest {
	
	final int result = 544;
	final int thousand = 1000;
	final int minusresult = 1456;

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
	
	@Test
	public void testEqualThousand() {
		
		int pointsIn = 1000;
		
		assertEquals( PointsMissing.determiningPoints(pointsIn), thousand );
	}
	
	@Test
	public void testEqualZero() {
		
		int pointsIn = 0;
		
		assertEquals( PointsMissing.determiningPoints(pointsIn), thousand );
	}
	
	@Test
	public void testUnderMinusThousand() {
		
		int pointsIn = -456;
		
		assertEquals( PointsMissing.determiningPoints(pointsIn), minusresult );
	}
	
	@Test
	public void testAboveMinusThousand() {
		
		int pointsIn = -12456;
		
		assertEquals( PointsMissing.determiningPoints(pointsIn), minusresult );
	}
	
	@Test
	public void testEqualMinusThousand() {
		
		int pointsIn = -1000;
		
		assertEquals( PointsMissing.determiningPoints(pointsIn), thousand );
	}
	
//	@Test
//	public void testNull() {
//		
//		int pointsIn = (Integer) null;
//		
//		assertEquals( PointsMissing.determiningPoints(pointsIn), thousand );
//	}

}
