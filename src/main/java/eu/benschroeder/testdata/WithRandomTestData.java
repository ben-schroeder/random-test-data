package eu.benschroeder.testdata;

import eu.benschroeder.testdata.statics.RandomTestData;

/**
 * Provides random data for testing.
 *
 * @author Benjamin Schröder
 **/
public interface WithRandomTestData extends WithRandomNumbers, WithRandomDateAndTime, WithRandomStrings, WithRandomJson {
    
    /**
     * Random boolean.
     *
     * @see RandomTestData#randomBoolean()
     **/
    default boolean randomBoolean() {
        return RandomTestData.randomBoolean();
    }

    /**
     * Random byte array of length 10.
     *
     * @see RandomTestData#randomByteArray()
     **/
    default byte[] randomByteArray() {
        return RandomTestData.randomByteArray();
    }

    /**
     * Random byte array of given length.
     *
     * @param length length of the byte array
     * @see RandomTestData#randomByteArray(int)
     */
    default byte[] randomByteArray(final int length) {
        return RandomTestData.randomByteArray(length);
    }

    /**
     * Random enum of given class.
     *
     * @param clazz enum class
     * @see RandomTestData#randomEnum(Class)
     */
    default <T extends Enum<T>> T randomEnum(final Class<T> clazz) {
        return RandomTestData.randomEnum(clazz);
    }

    /**
     * Random enum of given class, excluding the given values.
     *
     * @param clazz    enum class
     * @param excludes excluded values
     * @see RandomTestData#randomEnumExcluding(Class, Enum[])
     */
    default <T extends Enum<T>> T randomEnumExcluding(final Class<T> clazz, final T... excludes) {
        return RandomTestData.randomEnumExcluding(clazz, excludes);
    }

}
