package eu.benschroeder.testdata;

import eu.benschroeder.testdata.statics.RandomNumbers;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Provides the random {@link Number}s of {@link RandomNumbers} as an interface.
 *
 * @author Benjamin Schröder
 **/
public interface WithRandomNumbers {

    /**
     * Random double.
     *
     * @see RandomNumbers#randomDouble()
     **/
    default double randomDouble() {
        return RandomNumbers.randomDouble();
    }

    /**
     * Random double between min (inclusive) and max (exclusive).
     *
     * @param min minimum value (inclusive)
     * @param max maximum value (exclusive)
     * @throws IllegalArgumentException if {@code min > max} or if {@code min} is negative
     * @see RandomNumbers#randomDouble(double, double)
     */
    default double randomDouble(final double min, final double max) {
        return RandomNumbers.randomDouble(min, max);
    }

    /**
     * Random float.
     *
     * @see RandomNumbers#randomFloat()
     **/
    default float randomFloat() {
        return RandomNumbers.randomFloat();
    }

    /**
     * Random float between min (inclusive) and max (exclusive).
     *
     * @param min minimum value (inclusive)
     * @param max maximum value (exclusive)
     * @throws IllegalArgumentException if {@code min > max} or if {@code min} is negative
     * @see RandomNumbers#randomFloat(float, float)
     */
    default float randomFloat(final float min, final float max) {
        return RandomNumbers.randomFloat(min, max);
    }

    /**
     * Random int.
     *
     * @see RandomNumbers#randomInt()
     **/
    default int randomInt() {
        return RandomNumbers.randomInt();
    }

    /**
     * Random int between min (inclusive) and max (exclusive).
     *
     * @param min minimum value (inclusive)
     * @param max maximum value (exclusive)
     * @throws IllegalArgumentException if {@code min > max} or if {@code min} is negative
     * @see RandomNumbers#randomInt(int, int)
     */
    default int randomInt(final int min, final int max) {
        return RandomNumbers.randomInt(min, max);
    }

    /**
     * Random long.
     *
     * @see RandomNumbers#randomLong()
     **/
    default long randomLong() {
        return RandomNumbers.randomLong();
    }

    /**
     * Random long between min (inclusive) and max (exclusive).
     *
     * @param min minimum value (inclusive)
     * @param max maximum value (exclusive)
     * @throws IllegalArgumentException if {@code min > max} or if {@code min} is negative
     * @see RandomNumbers#randomLong(long, long)
     */
    default long randomLong(final long min, final long max) {
        return RandomNumbers.randomLong(min, max);
    }


    /**
     * Random {@link java.math.BigDecimal} within 0 - Double.MAX_VALUE.
     *
     * @see RandomNumbers#randomBigDecimal()
     **/
    default BigDecimal randomBigDecimal() {
        return RandomNumbers.randomBigDecimal();
    }

    /**
     * Random {@link java.math.BigInteger} within 0 - Long.MAX_VALUE.
     *
     * @see RandomNumbers#randomBigInteger()
     **/
    default BigInteger randomBigInteger() {
        return RandomNumbers.randomBigInteger();
    }

}
