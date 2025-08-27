package edu.westga.cs3110.floatdecoder.test.floatdecoder;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import edu.westga.cs3110.floatdecoder.model.FloatDecoder;

public class TestIsInfinity {

	@Test
	public void testForPositiveInfinity() {
		int bits = Float.floatToRawIntBits(Float.POSITIVE_INFINITY);
		assertTrue(FloatDecoder.isInfinity(bits));
	}
	
	@Test
	public void testForNegativeInfinity() {
		int bits = Float.floatToRawIntBits(Float.NEGATIVE_INFINITY);
		assertTrue(FloatDecoder.isInfinity(bits));
	}

	@Test
	public void testForNotAnInfinity() {
		int bits = Float.floatToRawIntBits(3.14f);
		assertFalse(FloatDecoder.isInfinity(bits));
	}
}
