package eu.benschroeder.testdata;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.RandomUtils;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Provides random data for testing
 *
 * @author Benjamin Schröder
 **/
public interface WithRandomTestData extends WithRandomNumbers, WithRandomStrings {

    /**
     * Random boolean.
     *
     * @see RandomUtils#nextBoolean()
     **/
    default boolean randomBoolean() {
        return RandomUtils.nextBoolean();
    }

    /**
     * Random byte array of length 10.
     *
     * @see RandomUtils#nextBytes(int)
     **/
    default byte[] randomByteArray() {
        return RandomUtils.nextBytes(10);
    }


    /**
     * Random byte array of given length.
     *
     * @param length length of the byte array
     * @see RandomUtils#nextBytes(int)
     */
    default byte[] randomByteArray(final int length) {
        return RandomUtils.nextBytes(length);
    }

    /**
     * Random enum of given class.
     *
     * @param clazz enum class
     */
    default <T extends Enum<T>> T randomEnum(final Class<T> clazz) {
        final T[] enumConstants = clazz.getEnumConstants();
        return enumConstants[RandomUtils.nextInt(0, enumConstants.length)];
    }

    /**
     * Random enum of given class, excluding the given values.
     *
     * @param clazz    enum class
     * @param excludes excluded values
     */
    default <T extends Enum<T>> T randomEnumExcluding(final Class<T> clazz, final T... excludes) {
        final T[] enumConstants = ArrayUtils.removeElements(clazz.getEnumConstants(), excludes);
        return enumConstants[RandomUtils.nextInt(0, enumConstants.length)];
    }

    /**
     * Random date between 1970-02-01T00:00:00 and now.
     */
    default Date randomPastDate() {
        final long from = new GregorianCalendar(1970, Calendar.FEBRUARY, 1, 0, 0, 0).getTimeInMillis();
        final long to = new Date().getTime();
        return new Date(randomLong(from, to));
    }

    /**
     * Random date between now and 2200-01-01T00:00:00.
     */
    default Date randomFutureDate() {
        final long from = new Date().getTime();
        final long to = new GregorianCalendar(2200, Calendar.JANUARY, 1, 0, 0, 0).getTimeInMillis();
        return new Date(randomLong(from, to));
    }


}
