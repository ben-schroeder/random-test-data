package eu.benschroeder.testdata.statics;

import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.RandomUtils;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Provides random {@link Number}s. Based on {@link org.apache.commons.lang3.RandomUtils}.
 *
 * @author Benjamin Schröder
 **/
@UtilityClass
public class RandomNumbers {

    /**
     * Random double between 0 and {@link Double#MAX_VALUE}.
     *
     * @see RandomUtils#nextDouble()
     **/
    public double randomDouble() {
        return RandomUtils.nextDouble();
    }

    /**
     * Random double between 1 and {@link Double#MAX_VALUE}.
     *
     * @see RandomUtils#nextDouble(double, double)
     **/
    public double randomPositiveDouble() {
        return RandomUtils.nextDouble(1, Double.MAX_VALUE);
    }

    /**
     * Random double between min (inclusive) and max (exclusive).
     *
     * @param min minimum value (inclusive)
     * @param max maximum value (exclusive)
     * @throws IllegalArgumentException if {@code min > max} or if {@code min} is negative
     * @see RandomUtils#nextDouble(double, double)
     */
    public double randomDouble(final double min, final double max) {
        return RandomUtils.nextDouble(min, max);
    }

    /**
     * Random float between 0 and {@link Float#MAX_VALUE}.
     *
     * @see RandomUtils#nextFloat()
     **/
    public float randomFloat() {
        return RandomUtils.nextFloat();
    }

    /**
     * Random float between 1 and {@link Float#MAX_VALUE}.
     *
     * @see RandomUtils#nextFloat(float, float)
     **/
    public float randomPositiveFloat() {
        return RandomUtils.nextFloat(1, Float.MAX_VALUE);
    }

    /**
     * Random float between min (inclusive) and max (exclusive).
     *
     * @param min minimum value (inclusive)
     * @param max maximum value (exclusive)
     * @throws IllegalArgumentException if {@code min > max} or if {@code min} is negative
     * @see RandomUtils#nextFloat(float, float)
     */
    public float randomFloat(final float min, final float max) {
        return RandomUtils.nextFloat(min, max);
    }

    /**
     * Random int.
     *
     * @see RandomUtils#nextInt()
     **/
    public int randomInt() {
        return RandomUtils.nextInt();
    }

    /**
     * Random int between 1 and {@link Integer#MAX_VALUE}.
     *
     * @see RandomUtils#nextInt(int, int)
     **/
    public int randomPositiveInt() {
        return RandomUtils.nextInt(1, Integer.MAX_VALUE);
    }

    /**
     * Random int between min (inclusive) and max (exclusive).
     *
     * @param min minimum value (inclusive)
     * @param max maximum value (exclusive)
     * @throws IllegalArgumentException if {@code min > max} or if {@code min} is negative
     * @see RandomUtils#nextInt(int, int)
     */
    public int randomInt(final int min, final int max) {
        return RandomUtils.nextInt(min, max);
    }

    /**
     * Random long between 0 and {@link Long#MAX_VALUE}.
     *
     * @see RandomUtils#nextLong()
     **/
    public long randomLong() {
        return RandomUtils.nextLong();
    }

    /**
     * Random long between 1 and {@link Long#MAX_VALUE}.
     *
     * @see RandomUtils#nextLong(long, long)
     **/
    public long randomPositiveLong() {
        return RandomUtils.nextLong(1, Long.MAX_VALUE);
    }

    /**
     * Random long between min (inclusive) and max (exclusive).
     *
     * @param min minimum value (inclusive)
     * @param max maximum value (exclusive)
     * @throws IllegalArgumentException if {@code min > max} or if {@code min} is negative
     * @see RandomUtils#nextLong(long, long)
     */
    public long randomLong(final long min, final long max) {
        return RandomUtils.nextLong(min, max);
    }

    /**
     * Random {@link java.math.BigDecimal} within 0 - Double.MAX_VALUE.
     *
     * @see RandomUtils#nextDouble()
     **/
    public BigDecimal randomBigDecimal() {
        return BigDecimal.valueOf(RandomUtils.nextDouble());
    }

    /**
     * Random {@link java.math.BigInteger} within 0 - Long.MAX_VALUE.
     *
     * @see RandomUtils#nextLong()
     **/
    public BigInteger randomBigInteger() {
        return BigInteger.valueOf(RandomUtils.nextLong());
    }

}
