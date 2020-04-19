package eu.benschroeder.testdata;

import eu.benschroeder.testdata.statics.RandomStrings;

/**
 * Provides the random {@link String}s of {@link RandomStrings} as an interface.
 *
 * @author Benjamin Schröder
 **/
public interface WithRandomStrings {

    /**
     * Random alphabetic (A-Z, a-z) string of length 10.
     *
     * @see RandomStrings#randomAlphabetic()
     **/
    default String randomAlphabetic() {
        return RandomStrings.randomAlphabetic();
    }

    /**
     * Random alphabetic (A-Z, a-z) string of lengthbetween min (inclusive) and max (exclusive).
     *
     * @param min min value (inclusive)
     * @param max max value (exclusive)
     * @see RandomStrings#randomAlphabetic(int, int)
     */
    default String randomAlphabetic(final int min, final int max) {
        return RandomStrings.randomAlphabetic(min, max);
    }

    /**
     * Random numeric (0-9) string of length 10.
     *
     * @see RandomStrings#randomNumeric
     **/
    default String randomNumeric() {
        return RandomStrings.randomNumeric();
    }

    /**
     * Random numeric (0-9) string of lengthbetween min (inclusive) and max (exclusive).
     *
     * @param min min value (inclusive)
     * @param max max value (exclusive)
     * @see RandomStrings#randomNumeric(int, int)
     */
    default String randomNumeric(final int min, final int max) {
        return RandomStrings.randomNumeric(min, max);
    }

    /**
     * Random alphanumeric (A-Z, a-z, 0-9) string of length 10.
     *
     * @see RandomStrings#randomAlphanumeric
     **/
    default String randomAlphanumeric() {
        return RandomStrings.randomAlphanumeric();
    }

    /**
     * Random alphanumeric (A-Z, a-z, 0-9) string of lengthbetween min (inclusive) and max (exclusive).
     *
     * @param min min value (inclusive)
     * @param max max value (exclusive)
     * @see RandomStrings#randomAlphanumeric(int, int)
     */
    default String randomAlphanumeric(final int min, final int max) {
        return RandomStrings.randomAlphanumeric(min, max);
    }

    /**
     * Random string (ASCII value is between {@code 32} and {@code 126} (inclusive)) of length 10.
     *
     * @see RandomStrings#randomAscii()
     **/
    default String randomAscii() {
        return RandomStrings.randomAscii();
    }

    /**
     * Random string (ASCII value is between {@code 32} and {@code 126} (inclusive)) of lengthbetween min (inclusive) and max (exclusive).
     *
     * @param min min value (inclusive)
     * @param max max value (exclusive)
     * @see RandomStrings#randomAscii(int, int)
     */
    default String randomAscii(final int min, final int max) {
        return RandomStrings.randomAscii(min, max);
    }

}
