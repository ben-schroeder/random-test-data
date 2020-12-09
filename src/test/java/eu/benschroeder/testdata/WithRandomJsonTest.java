package eu.benschroeder.testdata;

import eu.benschroeder.assertj.WithAssertJForMockito;
import eu.benschroeder.mockito.WithBDDMockito;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class WithRandomJsonTest implements WithAssertJForMockito, WithBDDMockito {

    @Spy
    private WithRandomJson withRandomJson;

    @RepeatedTest(1_000)
    void randomJson() {

        // WHEN
        final String randomJson = withRandomJson.randomJson();

        // THEN
        thenAssert(randomJson).matches(JsonPatterns.STRING_PATTERN);

    }

    @RepeatedTest(1_000)
    void randomJson_valueClassInteger() {

        // WHEN
        final String randomJson = withRandomJson.randomJson(Integer.class);

        // THEN
        thenAssert(randomJson).matches(JsonPatterns.INTEGER_PATTERN);

    }

    @RepeatedTest(1_000)
    void randomJson_valueClassString() {

        // WHEN
        final String randomJson = withRandomJson.randomJson(String.class);

        // THEN
        thenAssert(randomJson).matches(JsonPatterns.STRING_PATTERN);

    }

}