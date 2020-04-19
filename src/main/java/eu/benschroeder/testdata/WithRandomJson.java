package eu.benschroeder.testdata;

import eu.benschroeder.testdata.statics.RandomJson;

/**
 * Provides the random json strings of {@link RandomJson} as an interface.
 *
 * @author Benjamin Schröder
 **/
public interface WithRandomJson {

    /**
     * Random json containing one key (of length 5) and one string value (of length 5).
     *
     * @see RandomJson#randomJson()
     **/
    default String randomJson() {
        return RandomJson.randomJson();
    }

    /**
     * Random json containing one key (of length 5) and one value of the given class.
     * Supported value classes are {@link Integer} and {@link String}.
     *
     * @throws IllegalArgumentException if the value class is null or not supported.
     * @see RandomJson#randomJson()
     **/
    default String randomJson(final Class<?> valueClass) {
        return RandomJson.randomJson(valueClass);
    }

}
