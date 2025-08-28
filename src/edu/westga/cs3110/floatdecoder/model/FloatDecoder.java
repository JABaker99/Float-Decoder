package edu.westga.cs3110.floatdecoder.model;

/**
 * Decodes a 32-bit int as a 32-bit floating point value 
 * bit-for-bit.
 * 
 * @author Jacob Baker
 *  @version Fall 2025
 */
public class FloatDecoder {
	private static final int NEGATIVE_ZERO = 0b10000000000000000000000000000000;
	private static final int POSITIVE_ZERO = 0b00000000000000000000000000000000;
	private static final int NEGATIVE_INFINITY = 0b11111111100000000000000000000000;
	private static final int POSITIVE_INFINITY = 0b01111111100000000000000000000000;
	
	/**
	 * Indicates if the given 32-bit value represents a
	 * positive floating-point value.
	 * 
	 * @param value a 32-bit value
	 * @return true if value represents a positive floating point number; false otherwise
	 */
	public static boolean isPositive(int value) {
		int mostSigBit = value & NEGATIVE_ZERO;
		return (mostSigBit == POSITIVE_ZERO);
	}

	/**
	 * Determines if the 32-bit value is one of the valid zero representations.
	 * 
	 * @param value a 32-bit value
	 * @return true if positive or negative zero; false otherwise
	 */
	public static boolean isZero(int value) {
		return (value == NEGATIVE_ZERO || value == POSITIVE_ZERO);
	}
	
	/**
	 * Determines if the 32-bit value is one of the infinities.
	 * 
	 * @param value a 32-bit value
	 * @return true if +Infinity or -Infinity; false otherwise
	 */
	public static boolean isInfinity(int value) {
		return (value == POSITIVE_INFINITY || value == NEGATIVE_INFINITY);
	}
	
	/**
	 * Decodes the floating-point exponent portion of the 32-bit value.
	 * 
	 * @param value a 32-bit value
	 * @return the properly-biased exponent
	 */
	public static int decodeExponent(int value) {
		throw new UnsupportedOperationException("not implemented");
	}
	
	/**
	 * Determines if the 32-bit value represents Not-A-Number.
	 * 
	 * @param value a 32-bit value
	 * @return true if NaN; false otherwise
	 */
	public static boolean isNaN(int value) {
		throw new UnsupportedOperationException("not implemented");
	}

	/**
	 * Decodes the significant-digits portion of the 32-bit value.
	 * 
	 * @param value a 32-bit value
	 * @return the significant-digits of the value, as a float. Note this float represents ONLY
	 * the significant digits portion, i.e., it will be "x2^0"
	 */
	public static float decodeSignificantDigits(int value) {
		throw new UnsupportedOperationException("not implemented");
	}
	
	/**
	 * Creates a float from the given 32-bit integer value.
	 * 
	 * @param value a 32-bit value
	 * @return the float value from the 32-bit integer provided
	 */
	public static float decodeAsFloat(int value) {
		throw new UnsupportedOperationException("not implemented");
	}

}
