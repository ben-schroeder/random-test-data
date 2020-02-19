package eu.benschroeder.testdata;

import org.apache.commons.lang3.RandomUtils;

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
    default double randomDouble(double min, double max) {
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
    default float randomFloat(float min, float max) {
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
    default int randomInt(int min, int max) {
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
    default long randomLong(long min, long max) {
        return RandomUtils.nextLong(min, max);
    }

}
