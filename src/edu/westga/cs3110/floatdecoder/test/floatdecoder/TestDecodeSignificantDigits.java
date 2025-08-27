package edu.westga.cs3110.floatdecoder.test.floatdecoder;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs3110.floatdecoder.model.FloatDecoder;

public class TestDecodeSignificantDigits {

	private static final float TOL = 0.0001f;
	
	@Test
	public void testWhenAllZeroes() {
		assertEquals(1, FloatDecoder.decodeSignificantDigits(0));
	}
	
	@Test
	public void testWhenAllOnes() {
		int bits = 0b00000000011111111111111111111111;
		int bitsWithExpoentZero = 0b00111111111111111111111111111111;
		assertEquals(Float.intBitsToFloat(bitsWithExpoentZero), FloatDecoder.decodeSignificantDigits(bits), TOL);
	}

	@Test
	public void testWhenMsbOfSignificantDigitsIsOneRestZeroes() {
		int bits = 0b00000000010000000000000000000000;
		int bitsWithExpoentZero = 0b00111111110000000000000000000000;
		assertEquals(Float.intBitsToFloat(bitsWithExpoentZero), FloatDecoder.decodeSignificantDigits(bits), TOL);
	}
	
	@Test
	public void testWhenLsbOfSignificantDigitsIsOneRestZeroes() {
		int bits = 0b00000000000000000000000000000001;
		int bitsWithExpoentZero = 0b00111111100000000000000000000001;
		assertEquals(Float.intBitsToFloat(bitsWithExpoentZero), FloatDecoder.decodeSignificantDigits(bits), TOL);
	}
	
	@Test
	public void testWhenSomeBitsOneSomeZero() {
		int bits = 0b00000000010101000000000000000000;
		assertEquals(1 + 1./2. + 1./8. + 1./32., FloatDecoder.decodeSignificantDigits(bits), TOL);
	}
}
