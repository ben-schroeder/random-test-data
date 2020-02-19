package eu.benschroeder.testdata;

import eu.benschroeder.assertj.WithAssertJForMockito;
import eu.benschroeder.mockito.WithBDDMockito;
import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.security.SecureRandom;

@ExtendWith(MockitoExtension.class)
class WithRandomStringsTest implements WithAssertJForMockito, WithBDDMockito {

    private static SecureRandom RANDOM;

    @BeforeAll
    @SneakyThrows
    static void initRandom() {
        RANDOM = SecureRandom.getInstance("SHA1PRNG");
    }

    @Spy
    private WithRandomStrings withRandomStrings;

    @RepeatedTest(100)
    void randomAlphabetic_sizeIsTen() {

        // WHEN
        String randomAlphabetic = withRandomStrings.randomAlphabetic();

        // THEN
        thenAssert(randomAlphabetic).hasSize(10);

    }

    @RepeatedTest(100)
    void randomAlphabetic_containsOnlyAlphabeticCharacters() {

        // WHEN
        String randomAlphabetic = withRandomStrings.randomAlphabetic();

        // THEN
        thenAssert(randomAlphabetic).matches("[A-Za-z]+");

    }

    @RepeatedTest(100)
    void randomAlphabetic_withMinMax_SizeIsBetweenMinAndMax() {

        // GIVEN
        int min = createMinValue();
        int max = createMaxValue(min);

        // WHEN
        String randomAlphabetic = withRandomStrings.randomAlphabetic(min, max);

        // THEN
        thenAssert(randomAlphabetic).hasSizeBetween(min, max - 1);

    }

    @RepeatedTest(100)
    void randomAlphabetic_withMinMax_containsOnlyAlphabeticCharacters() {

        // GIVEN
        int min = createMinValue();
        int max = createMaxValue(min);

        // WHEN
        String randomAlphabetic = withRandomStrings.randomAlphabetic(min, max);

        // THEN
        thenAssert(randomAlphabetic).matches("[A-Za-z]+");

    }

    @RepeatedTest(100)
    void randomNumeric_sizeIsTen() {

        // WHEN
        String randomNumeric = withRandomStrings.randomNumeric();

        // THEN
        thenAssert(randomNumeric).hasSize(10);
    }

    @RepeatedTest(100)
    void randomNumeric_containsOnlyDigits() {

        // WHEN
        String randomNumeric = withRandomStrings.randomNumeric();

        // THEN
        thenAssert(randomNumeric).containsOnlyDigits();
    }

    @RepeatedTest(100)
    void randomNumeric_withMinMax_SizeIsBetweenMinAndMax() {

        // GIVEN
        int min = createMinValue();
        int max = createMaxValue(min);

        // WHEN
        String randomNumeric = withRandomStrings.randomNumeric(min, max);

        // THEN
        thenAssert(randomNumeric).hasSizeBetween(min, max - 1);

    }

    @RepeatedTest(100)
    void randomNumeric_withMinMax_containsOnlyDigits() {

        // GIVEN
        int min = createMinValue();
        int max = createMaxValue(min);

        // WHEN
        String randomNumeric = withRandomStrings.randomNumeric(min, max);

        // THEN
        thenAssert(randomNumeric).containsOnlyDigits();

    }

    @RepeatedTest(100)
    void randomAlphanumeric_sizeIsTen() {

        // WHEN
        String randomAlphanumeric = withRandomStrings.randomAlphanumeric();

        // THEN
        thenAssert(randomAlphanumeric).hasSize(10);

    }

    @RepeatedTest(100)
    void randomAlphanumeric_containsOnlyAlphanumericCharacters() {

        // WHEN
        String randomAlphanumeric = withRandomStrings.randomAlphanumeric();

        // THEN
        thenAssert(randomAlphanumeric).matches("[A-Za-z0-9]+");

    }

    @RepeatedTest(100)
    void randomAlphanumeric_withMinMax_SizeIsBetweenMinAndMax() {

        // GIVEN
        int min = createMinValue();
        int max = createMaxValue(min);

        // WHEN
        String randomAlphanumeric = withRandomStrings.randomAlphanumeric(min, max);

        // THEN
        thenAssert(randomAlphanumeric).hasSizeBetween(min, max - 1);

    }

    @RepeatedTest(100)
    void randomAlphanumeric_withMinMax_containsOnlyAlphanumeriCharacters() {

        // GIVEN
        int min = createMinValue();
        int max = createMaxValue(min);

        // WHEN
        String randomAlphanumeric = withRandomStrings.randomAlphanumeric(min, max);

        // THEN
        thenAssert(randomAlphanumeric).matches("[A-Za-z0-9]+");

    }

    @RepeatedTest(100)
    void randomAscii_sizeIsTen() {

        // WHEN
        String randomAscii = withRandomStrings.randomAscii();

        // THEN
        thenAssert(randomAscii).hasSize(10);

    }

    @RepeatedTest(100)
    void randomAscii_containsOnlyAsciiCharacters() {

        // WHEN
        String randomAscii = withRandomStrings.randomAscii();

        // THEN
        thenAssert(randomAscii).matches("[\\x20-\\x7E]+");

    }

    @RepeatedTest(100)
    void randomAscii_withMinMax_SizeIsBetweenMinAndMax() {

        // GIVEN
        int min = createMinValue();
        int max = createMaxValue(min);

        // WHEN
        String randomAscii = withRandomStrings.randomAscii(min, max);

        // THEN
        thenAssert(randomAscii).hasSizeBetween(min, max - 1);

    }

    @RepeatedTest(1000)
    void randomAscii_withMinMax_containsOnlyAsciiCharacters() {

        // GIVEN
        int min = createMinValue();
        int max = createMaxValue(min);

        // WHEN
        String randomAscii = withRandomStrings.randomAscii(min, max);

        // THEN
        thenAssert(randomAscii).matches("[\\x20-\\x7E]+");

    }

    private int createMaxValue(int min) {
        return min + RANDOM.nextInt(100) + 1;
    }

    private int createMinValue() {
        return RANDOM.nextInt(100) + 1;
    }

}