package eu.benschroeder.testdata;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * {@link RandomStringUtils} as an interface.
 *
 * @author Benjamin Schrödder
 **/
public interface WithRandomStringUtils {

    /**
     * Random alphabetic string of length 10.
     *
     * @see RandomStringUtils#randomAlphabetic(int)
     **/
    default String randomAlphabetic() {
        return RandomStringUtils.randomAlphabetic(10);
    }

    /**
     * Random numeric string of length 10.
     *
     * @see RandomStringUtils#randomNumeric(int)
     **/
    default String randomNumeric() {
        return RandomStringUtils.randomNumeric(10);
    }

    /**
     * Random alphanumeric string of length 10.
     *
     * @see RandomStringUtils#randomAlphanumeric(int)
     **/
    default String randomAlphanumeric() {
        return RandomStringUtils.randomAlphanumeric(10);
    }

}
