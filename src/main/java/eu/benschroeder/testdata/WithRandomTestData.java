package eu.benschroeder.testdata;

import org.apache.commons.lang3.RandomUtils;

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
    default byte[] randomByteArray(int length) {
        return RandomUtils.nextBytes(length);
    }

}
