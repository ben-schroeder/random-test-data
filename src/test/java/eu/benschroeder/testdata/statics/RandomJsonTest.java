package eu.benschroeder.testdata.statics;

import eu.benschroeder.assertj.WithAssertJForMockito;
import eu.benschroeder.mockito.WithBDDMockito;
import eu.benschroeder.testdata.JsonPatterns;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class RandomJsonTest implements WithAssertJForMockito, WithBDDMockito {

    @RepeatedTest(100)
    void randomJson() {

        // WHEN
        final String randomJson = RandomJson.randomJson();

        // THEN
        thenAssert(randomJson).matches(JsonPatterns.STRING_PATTERN);

    }

    @RepeatedTest(100)
    void randomJson_classInteger() {

        // WHEN
        final String randomJson = RandomJson.randomJson(Integer.class);

        // THEN
        thenAssert(randomJson).matches(JsonPatterns.INTEGER_PATTERN);

    }

    @RepeatedTest(100)
    void randomJson_valueClassString() {

        // WHEN
        final String randomJson = RandomJson.randomJson(String.class);

        // THEN
        thenAssert(randomJson).matches(JsonPatterns.STRING_PATTERN);

    }

    @Test
    void randomJson_unsupportedValueClass() {

        // WHEN
        final Throwable throwable = catchThrowable(() -> RandomJson.randomJson(Throwable.class));

        // THEN
        thenAssert(throwable).isExactlyInstanceOf(IllegalArgumentException.class)
                .hasMessage("Unsupported value class 'class java.lang.Throwable'.");

    }

    @Test
    void randomJson_nullValueClass() {

        // WHEN
        final Throwable throwable = catchThrowable(() -> RandomJson.randomJson(null));

        // THEN
        thenAssert(throwable).isExactlyInstanceOf(IllegalArgumentException.class)
                .hasMessage("Value class can not be null.");

    }
}