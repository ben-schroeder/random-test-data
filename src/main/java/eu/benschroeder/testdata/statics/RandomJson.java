package eu.benschroeder.testdata.statics;

import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

/**
 * Provides random json strings.
 *
 * @author Benjamin Schröder
 **/
@UtilityClass
public class RandomJson {

    /**
     * Random json containing one key (of length 5) and one string value (of length 5).
     *
     * @see RandomStringUtils#randomAlphabetic(int)
     **/
    public String randomJson() {
        return String.format("{ \"%s\": \"%s\" }", RandomStringUtils.randomAlphabetic(5), RandomStringUtils.randomAlphabetic(5));
    }

    /**
     * Random json containing one key (of length 5) and one value of the given class.
     *
     * @throws IllegalArgumentException if the value class is null or not supported.
     * @see RandomJson#randomJson()
     * @see RandomJson#randomJsonIntegerValue()
     **/
    public String randomJson(final Class<?> valueClass) {
        if (valueClass == null) {
            throw new IllegalArgumentException("Value class can not be null.");
        }

        if (valueClass.equals(String.class)) {
            return randomJson();
        } else if (valueClass.equals(Integer.class)) {
            return randomJsonIntegerValue();
        }

        throw new IllegalArgumentException(String.format("Unsupported value class '%s'.", valueClass));

    }

    /**
     * Random json containing one key (of length 5) and one int value (between 1 and 99.999).
     *
     * @see RandomStringUtils#randomAlphabetic(int)
     * @see RandomUtils#nextInt(int, int)
     **/
    private String randomJsonIntegerValue() {
        return String.format("{ \"%s\": %d }", RandomStringUtils.randomAlphabetic(5), RandomUtils.nextInt(1, 100_000));
    }

}
