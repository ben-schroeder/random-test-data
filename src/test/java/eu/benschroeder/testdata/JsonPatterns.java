package eu.benschroeder.testdata;

import lombok.experimental.UtilityClass;

@UtilityClass
public class JsonPatterns {

    private final String JSON_PATTERN = "\\{ %s: %s }";
    private final String KEY_PATTERN = "\"[A-Za-z]{5}\"";
    private final String STRING_VALUE_PATTERN = KEY_PATTERN;
    private final String INTEGER_VALUE_PATTERN = "[0-9]{1,5}";

    public final String INTEGER_PATTERN = String.format(JSON_PATTERN, KEY_PATTERN, INTEGER_VALUE_PATTERN);
    public final String STRING_PATTERN = String.format(JSON_PATTERN, KEY_PATTERN, STRING_VALUE_PATTERN);

}
