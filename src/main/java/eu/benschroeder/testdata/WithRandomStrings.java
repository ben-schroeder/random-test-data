package eu.benschroeder.testdata;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * Provides random {@link String}s for testing. Based on {@link RandomStringUtils}.
 *
 * @author Benjamin Schröder
 **/
public interface WithRandomStrings {

    /**
     * Random alphabetic (A-Z, a-z) string of length 10.
     *
     * @see RandomStringUtils#randomAlphabetic(int)
     **/
    default String randomAlphabetic() {
        return RandomStringUtils.randomAlphabetic(10);
    }

    /**
     * Random alphabetic (A-Z, a-z) string of lengthbetween min (inclusive) and max (exclusive).
     *
     * @param min min value (inclusive)
     * @param max max value (exclusive)
     * @see RandomStringUtils#randomAlphabetic(int, int)
     */
    default String randomAlphabetic(int min, int max) {
        return RandomStringUtils.randomAlphabetic(min, max);
    }

    /**
     * Random numeric (0-9) string of length 10.
     *
     * @see RandomStringUtils#randomNumeric(int)
     **/
    default String randomNumeric() {
        return RandomStringUtils.randomNumeric(10);
    }

    /**
     * Random numeric (0-9) string of lengthbetween min (inclusive) and max (exclusive).
     *
     * @param min min value (inclusive)
     * @param max max value (exclusive)
     * @see RandomStringUtils#randomNumeric(int, int)
     */
    default String randomNumeric(int min, int max) {
        return RandomStringUtils.randomNumeric(min, max);
    }

    /**
     * Random alphanumeric (A-Z, a-z, 0-9) string of length 10.
     *
     * @see RandomStringUtils#randomAlphanumeric(int)
     **/
    default String randomAlphanumeric() {
        return RandomStringUtils.randomAlphanumeric(10);
    }

    /**
     * Random alphanumeric (A-Z, a-z, 0-9) string of lengthbetween min (inclusive) and max (exclusive).
     *
     * @param min min value (inclusive)
     * @param max max value (exclusive)
     * @see RandomStringUtils#randomAlphanumeric(int, int)
     */
    default String randomAlphanumeric(int min, int max) {
        return RandomStringUtils.randomAlphanumeric(min, max);
    }

    /**
     * Random string (ASCII value is between {@code 32} and {@code 126} (inclusive)) of length 10.
     *
     * @see RandomStringUtils#random(int)
     **/
    default String randomAscii() {
        return RandomStringUtils.randomAscii(10);
    }

    /**
     * Random string (ASCII value is between {@code 32} and {@code 126} (inclusive)) of lengthbetween min (inclusive) and max (exclusive).
     *
     * @param min min value (inclusive)
     * @param max max value (exclusive)
     * @see RandomStringUtils#randomAscii(int, int)
     */
    default String randomAscii(int min, int max) {
        return RandomStringUtils.randomAscii(min, max);
    }

}
