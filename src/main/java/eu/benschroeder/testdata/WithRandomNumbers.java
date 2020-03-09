package eu.benschroeder.testdata;

import org.apache.commons.lang3.RandomUtils;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Provides random {@link Number}s for testing. Based on {@link RandomUtils}.
 *
 * @author Benjamin Schröder
 **/
public interface WithRandomNumbers {

    /**
     * Random double.
     *
     * @see RandomUtils#nextDouble()
     **/
    default double randomDouble() {
        return RandomUtils.nextDouble();
    }

    /**
     * Random double between min (inclusive) and max (exclusive).
     *
     * @param min minimum value (inclusive)
     * @param max maximum value (exclusive)
     * @see RandomUtils#nextDouble(double, double)
     */
    default double randomDouble(final double min, final double max) {
        return RandomUtils.nextDouble(min, max);
    }

    /**
     * Random float.
     *
     * @see RandomUtils#nextFloat()
     **/
    default float randomFloat() {
        return RandomUtils.nextFloat();
    }

    /**
     * Random float between min (inclusive) and max (exclusive).
     *
     * @param min minimum value (inclusive)
     * @param max maximum value (exclusive)
     * @see RandomUtils#nextFloat(float, float)
     */
    default float randomFloat(final float min, final float max) {
        return RandomUtils.nextFloat(min, max);
    }

    /**
     * Random int.
     *
     * @see RandomUtils#nextInt()
     **/
    default int randomInt() {
        return RandomUtils.nextInt();
    }

    /**
     * Random int between min (inclusive) and max (exclusive).
     *
     * @param min minimum value (inclusive)
     * @param max maximum value (exclusive)
     * @see RandomUtils#nextInt(int, int)
     */
    default int randomInt(final int min, final int max) {
        return RandomUtils.nextInt(min, max);
    }

    /**
     * Random long.
     *
     * @see RandomUtils#nextLong()
     **/
    default long randomLong() {
        return RandomUtils.nextLong();
    }

    /**
     * Random long between min (inclusive) and max (exclusive).
     *
     * @param min minimum value (inclusive)
     * @param max maximum value (exclusive)
     * @see RandomUtils#nextLong(long, long)
     */
    default long randomLong(final long min, final long max) {
        return RandomUtils.nextLong(min, max);
    }


    /**
     * Random {@link java.math.BigDecimal} within 0 - Double.MAX_VALUE.
     *
     * @see RandomUtils#nextDouble()
     **/
    default BigDecimal randomBigDecimal() {
        return BigDecimal.valueOf(RandomUtils.nextDouble());
    }

    /**
     * Random {@link java.math.BigInteger} within 0 - Long.MAX_VALUE.
     *
     * @see RandomUtils#nextLong()
     **/
    default BigInteger randomBigInteger() {
        return BigInteger.valueOf(RandomUtils.nextLong());
    }

}
