package edu.westga.cs3110.floatdecoder.test.floatdecoder;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs3110.floatdecoder.model.FloatDecoder;

public class TestDecodeAsFloat {

	private static final float TOL = 0.0001f;
	
	@Test
	public void testShouldDecodePositiveNumber() {
		int bits = 0b01100000010000011100000100000000;
		assertEquals(Float.intBitsToFloat(bits), FloatDecoder.decodeAsFloat(bits), TOL);
	}
	
	@Test
	public void testShouldDecodeNegativeNumber() {
		int bits = 0b11101100010000001000000000010000;
		assertEquals(Float.intBitsToFloat(bits), FloatDecoder.decodeAsFloat(bits), TOL);
	}

}
