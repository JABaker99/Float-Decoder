package edu.westga.cs3110.floatdecoder.test.floatdecoder;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import edu.westga.cs3110.floatdecoder.model.FloatDecoder;

public class TestIsNaN {

	@Test
	public void testShouldBeNaN() {
		int bits = Float.floatToRawIntBits(Float.NaN);
		assertTrue(FloatDecoder.isNaN(bits));
	}
	
	@Test
	public void testShouldNotBeNaN() {
		int bits = Float.floatToRawIntBits(3.14f);
		assertFalse(FloatDecoder.isNaN(bits));
	}

}
