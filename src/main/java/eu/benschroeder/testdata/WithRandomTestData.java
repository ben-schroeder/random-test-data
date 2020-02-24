package eu.benschroeder.testdata;

import org.apache.commons.lang3.ArrayUtils;
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

    /**
     * Random enum of given class.
     *
     * @param clazz enum class
     */
    default <T extends Enum<T>> T randomEnum(Class<T> clazz) {
        T[] enumConstants = clazz.getEnumConstants();
        return enumConstants[RandomUtils.nextInt(0, enumConstants.length)];
    }

    /**
     * Random enum of given class, excluding the given values.
     *
     * @param clazz    enum class
     * @param excludes excluded values
     */
    default <T extends Enum<T>> T randomEnumExcluding(Class<T> clazz, T... excludes) {
        T[] enumConstants = ArrayUtils.removeElements(clazz.getEnumConstants(), excludes);
        return enumConstants[RandomUtils.nextInt(0, enumConstants.length)];
    }

}
