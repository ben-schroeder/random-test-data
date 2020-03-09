package eu.benschroeder.testdata;

import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.util.Objects;

public interface WithRandomJson {

    /**
     * Random json containing one key (of length 5) and one string value (of length 5).
     *
     * @see RandomStringUtils#randomAlphabetic(int)
     **/
    default String randomJson() {
        return String.format("{ \"%s\": \"%s\" }", RandomStringUtils.randomAlphabetic(5), RandomStringUtils.randomAlphabetic(5));
    }

    /**
     * Random json containing one key (of length 5) and one value of the given class.
     *
     * @see WithRandomJson#randomJson()
     * @see WithRandomJson#randomJsonIntegerValue()
     **/
    default String randomJson(final Class<?> valueClass) {
        Objects.requireNonNull(valueClass);

        if (valueClass.equals(String.class)) {
            return randomJson();
        } else if (valueClass.equals(Integer.class)) {
            return randomJsonIntegerValue();
        }

        throw new NotImplementedException("Unsupported value class " + valueClass);

    }

    /**
     * Random json containing one key (of length 5) and one int value (between 1 and 99.999).
     *
     * @see RandomStringUtils#randomAlphabetic(int)
     * @see RandomUtils#nextInt(int, int)
     **/
    default String randomJsonIntegerValue() {
        return String.format("{ \"%s\": %d }", RandomStringUtils.randomAlphabetic(5), RandomUtils.nextInt(1, 100_000));
    }


}
