package eu.benschroeder.testdata;

import eu.benschroeder.assertj.WithAssertJForMockito;
import eu.benschroeder.mockito.WithBDDMockito;
import org.apache.commons.lang3.RandomUtils;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class WithRandomTestDataTest implements WithAssertJForMockito, WithBDDMockito {

    @Spy
    private WithRandomTestData withRandomTestData;

    @RepeatedTest(100)
    void randomByteArray_lengthIsTen() {

        // WHEN
        byte[] bytes = withRandomTestData.randomByteArray();

        // THEN
        thenAssert(bytes).hasSize(10);

    }

    @RepeatedTest(100)
    void randomByteArray_lengthMatchesGivenLength() {

        // GIVEN
        int length = RandomUtils.nextInt(1, 100);

        // WHEN
        byte[] bytes = withRandomTestData.randomByteArray(length);

        // THEN
        thenAssert(bytes).hasSize(length);

    }

}