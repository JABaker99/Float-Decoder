package edu.westga.cs3110.floatdecoder.test.floatdecoder;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import edu.westga.cs3110.floatdecoder.model.FloatDecoder;

public class TestIsPositive {

	@Test
	public void testZeroShouldBePositive() {
		assertTrue(FloatDecoder.isPositive(0));
	}
	
	@Test
	public void testOneAtLsbRestZeroesShouldBePositive() {
		assertTrue(FloatDecoder.isPositive(0x00000001));
	}
	
	@Test
	public void testAllOnesShouldBeNegative() {
		assertFalse(FloatDecoder.isPositive(0xffffffff));
	}

	@Test
	public void testOneAtMsbRestZeroesShouldBeNegative() {
		assertFalse(FloatDecoder.isPositive(0x80000000));
	}
	
	@Test
	public void testZeroAtMsbRestOnesShouldBePositive() {
		assertTrue(FloatDecoder.isPositive(0x7fffffff));
	}
}
