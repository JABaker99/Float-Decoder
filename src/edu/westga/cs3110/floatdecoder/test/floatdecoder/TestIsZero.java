package edu.westga.cs3110.floatdecoder.test.floatdecoder;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import edu.westga.cs3110.floatdecoder.model.FloatDecoder;

public class TestIsZero {
	
	@Test
	public void testWhenPositiveZero() {
		float value = Float.intBitsToFloat(0);
		assertTrue(FloatDecoder.isZero(Float.floatToRawIntBits(value)));
	}
	
	@Test
	public void testWhenNegativeZero() {
		float value = Float.intBitsToFloat(0x80000000);
		assertTrue(FloatDecoder.isZero(Float.floatToRawIntBits(value)));
	}

	@Test
	public void testWhenNotZero() {
		float value = Float.intBitsToFloat(0x88886666);
		assertFalse(FloatDecoder.isZero(Float.floatToRawIntBits(value)));
	}
}
