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

    @RepeatedTest(100)
    void randomJson() {

        // WHEN
        final String randomJson = withRandomJson.randomJson();

        // THEN
        thenAssert(randomJson).matches("\\{ \\\"[A-Za-z]{5}\\\": \\\"[A-Za-z]{5}\\\" \\}");

    }

    @RepeatedTest(100)
    void randomJsonIntegerValue() {

        // WHEN
        final String randomJson = withRandomJson.randomJsonIntegerValue();

        // THEN
        thenAssert(randomJson).matches("\\{ \\\"[A-Za-z]{5}\\\": [0-9]{1,5} \\}");

    }

}