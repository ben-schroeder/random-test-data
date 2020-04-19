package eu.benschroeder.testdata.statics;

import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.RandomStringUtils;

/**
 * Provides random {@link String}s. Based on {@link RandomStringUtils}.
 *
 * @author Benjamin Schröder
 **/
@UtilityClass
public class RandomStrings {

    /**
     * Random alphabetic (A-Z, a-z) string of length 10.
     *
     * @see RandomStringUtils#randomAlphabetic(int)
     **/
    public String randomAlphabetic() {
        return RandomStringUtils.randomAlphabetic(10);
    }

    /**
     * Random alphabetic (A-Z, a-z) string of length between min (inclusive) and max (exclusive).
     *
     * @param min min value (inclusive)
     * @param max max value (exclusive)
     * @see RandomStringUtils#randomAlphabetic(int, int)
     */
    public String randomAlphabetic(final int min, final int max) {
        return RandomStringUtils.randomAlphabetic(min, max);
    }

    /**
     * Random numeric (0-9) string of length 10.
     *
     * @see RandomStringUtils#randomNumeric(int)
     **/
    public String randomNumeric() {
        return RandomStringUtils.randomNumeric(10);
    }

    /**
     * Random numeric (0-9) string of length between min (inclusive) and max (exclusive).
     *
     * @param min min value (inclusive)
     * @param max max value (exclusive)
     * @see RandomStringUtils#randomNumeric(int, int)
     */
    public String randomNumeric(final int min, final int max) {
        return RandomStringUtils.randomNumeric(min, max);
    }

    /**
     * Random alphanumeric (A-Z, a-z, 0-9) string of length 10.
     *
     * @see RandomStringUtils#randomAlphanumeric(int)
     **/
    public String randomAlphanumeric() {
        return RandomStringUtils.randomAlphanumeric(10);
    }

    /**
     * Random alphanumeric (A-Z, a-z, 0-9) string of length between min (inclusive) and max (exclusive).
     *
     * @param min min value (inclusive)
     * @param max max value (exclusive)
     * @see RandomStringUtils#randomAlphanumeric(int, int)
     */
    public String randomAlphanumeric(final int min, final int max) {
        return RandomStringUtils.randomAlphanumeric(min, max);
    }

    /**
     * Random string (ASCII value is between {@code 32} and {@code 126} (inclusive)) of length 10.
     *
     * @see RandomStringUtils#random(int)
     **/
    public String randomAscii() {
        return RandomStringUtils.randomAscii(10);
    }

    /**
     * Random string (ASCII value is between {@code 32} and {@code 126} (inclusive)) of length between min (inclusive) and max (exclusive).
     *
     * @param min min value (inclusive)
     * @param max max value (exclusive)
     * @see RandomStringUtils#randomAscii(int, int)
     */
    public String randomAscii(final int min, final int max) {
        return RandomStringUtils.randomAscii(min, max);
    }

}
