package eu.benschroeder.testdata.statics;

import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.RandomUtils;

/**
 * Provides random data that fits no other group or category.
 *
 * @author Benjamin Schröder
 **/
@UtilityClass
public class RandomTestData {

    /**
     * Random boolean.
     *
     * @see RandomUtils#nextBoolean()
     **/
    public boolean randomBoolean() {
        return RandomUtils.nextBoolean();
    }

    /**
     * Random byte array of length 10.
     *
     * @see RandomUtils#nextBytes(int)
     **/
    public byte[] randomByteArray() {
        return RandomUtils.nextBytes(10);
    }
    
    /**
     * Random byte array of given length.
     *
     * @param length length of the byte array
     * @see RandomUtils#nextBytes(int)
     */
    public byte[] randomByteArray(final int length) {
        return RandomUtils.nextBytes(length);
    }

    /**
     * Random enum of given class.
     *
     * @param clazz enum class
     */
    public <T extends Enum<T>> T randomEnum(final Class<T> clazz) {
        final T[] enumConstants = clazz.getEnumConstants();
        return enumConstants[RandomNumbers.randomInt(0, enumConstants.length)];
    }

    /**
     * Random enum of given class, excluding the given values.
     *
     * @param clazz    enum class
     * @param excludes excluded values
     */
    public <T extends Enum<T>> T randomEnumExcluding(final Class<T> clazz, final T... excludes) {
        final T[] enumConstants = ArrayUtils.removeElements(clazz.getEnumConstants(), excludes);
        return enumConstants[RandomNumbers.randomInt(0, enumConstants.length)];
    }

}
