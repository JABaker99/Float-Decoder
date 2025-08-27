package edu.westga.cs3110.floatdecoder.test.floatdecoder;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs3110.floatdecoder.model.FloatDecoder;

public class TestDecodeExponent {

	@Test
	public void testShouldHaveMinimumExponent() {
		assertEquals(-127, FloatDecoder.decodeExponent(0));
	}
	
	@Test
	public void testShouldHaveOneAboveMinimumExponent() {
		assertEquals(-126, FloatDecoder.decodeExponent(0b00000000100000000000000000000000));
	}
	
	@Test
	public void testShouldHaveAllOnesExponent() {
		assertEquals(128, FloatDecoder.decodeExponent(0b01111111100000000000000000000000));
	}

	@Test
	public void testShouldHaveMaximumExponent() {
		assertEquals(127, FloatDecoder.decodeExponent(0b01111111000000000000000000000000));
	}
	
	@Test
	public void testShouldHaveOneBelowMaximumExponent() {
		assertEquals(126, FloatDecoder.decodeExponent(0b01111110100000000000000000000000));
	}
	
	@Test
	public void testShouldDecodeExponent() {
		assertEquals(43, FloatDecoder.decodeExponent(0b01010101000000000000000000000000));
	}
}
