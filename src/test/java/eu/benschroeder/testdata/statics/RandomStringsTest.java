package eu.benschroeder.testdata.statics;

import eu.benschroeder.assertj.WithAssertJForMockito;
import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;

import java.security.SecureRandom;

class RandomStringsTest implements WithAssertJForMockito {

    private static SecureRandom RANDOM;

    @BeforeAll
    @SneakyThrows
    static void initRandom() {
        RANDOM = SecureRandom.getInstance("SHA1PRNG");
    }

    @RepeatedTest(1_000)
    void randomAlphabetic_sizeIsTen() {

        // WHEN
        final String randomAlphabetic = RandomStrings.randomAlphabetic();

        // THEN
        thenAssert(randomAlphabetic).hasSize(10);

    }

    @RepeatedTest(1_000)
    void randomAlphabetic_containsOnlyAlphabeticCharacters() {

        // WHEN
        final String randomAlphabetic = RandomStrings.randomAlphabetic();

        // THEN
        thenAssert(randomAlphabetic).matches("[A-Za-z]+");

    }

    @RepeatedTest(1_000)
    void randomAlphabetic_withMinMax_SizeIsBetweenMinAndMax() {

        // GIVEN
        final int min = createMinValue();
        final int max = createMaxValue(min);

        // WHEN
        final String randomAlphabetic = RandomStrings.randomAlphabetic(min, max);

        // THEN
        thenAssert(randomAlphabetic).hasSizeBetween(min, max - 1);

    }

    @RepeatedTest(1_000)
    void randomAlphabetic_withMinMax_containsOnlyAlphabeticCharacters() {

        // GIVEN
        final int min = createMinValue();
        final int max = createMaxValue(min);

        // WHEN
        final String randomAlphabetic = RandomStrings.randomAlphabetic(min, max);

        // THEN
        thenAssert(randomAlphabetic).matches("[A-Za-z]+");

    }

    @RepeatedTest(1_000)
    void randomNumeric_sizeIsTen() {

        // WHEN
        final String randomNumeric = RandomStrings.randomNumeric();

        // THEN
        thenAssert(randomNumeric).hasSize(10);
    }

    @RepeatedTest(1_000)
    void randomNumeric_containsOnlyDigits() {

        // WHEN
        final String randomNumeric = RandomStrings.randomNumeric();

        // THEN
        thenAssert(randomNumeric).containsOnlyDigits();
    }

    @RepeatedTest(1_000)
    void randomNumeric_withMinMax_SizeIsBetweenMinAndMax() {

        // GIVEN
        final int min = createMinValue();
        final int max = createMaxValue(min);

        // WHEN
        final String randomNumeric = RandomStrings.randomNumeric(min, max);

        // THEN
        thenAssert(randomNumeric).hasSizeBetween(min, max - 1);

    }

    @RepeatedTest(1_000)
    void randomNumeric_withMinMax_containsOnlyDigits() {

        // GIVEN
        final int min = createMinValue();
        final int max = createMaxValue(min);

        // WHEN
        final String randomNumeric = RandomStrings.randomNumeric(min, max);

        // THEN
        thenAssert(randomNumeric).containsOnlyDigits();

    }

    @RepeatedTest(1_000)
    void randomAlphanumeric_sizeIsTen() {

        // WHEN
        final String randomAlphanumeric = RandomStrings.randomAlphanumeric();

        // THEN
        thenAssert(randomAlphanumeric).hasSize(10);

    }

    @RepeatedTest(1_000)
    void randomAlphanumeric_containsOnlyAlphanumericCharacters() {

        // WHEN
        final String randomAlphanumeric = RandomStrings.randomAlphanumeric();

        // THEN
        thenAssert(randomAlphanumeric).matches("[A-Za-z0-9]+");

    }

    @RepeatedTest(1_000)
    void randomAlphanumeric_withMinMax_SizeIsBetweenMinAndMax() {

        // GIVEN
        final int min = createMinValue();
        final int max = createMaxValue(min);

        // WHEN
        final String randomAlphanumeric = RandomStrings.randomAlphanumeric(min, max);

        // THEN
        thenAssert(randomAlphanumeric).hasSizeBetween(min, max - 1);

    }

    @RepeatedTest(1_000)
    void randomAlphanumeric_withMinMax_containsOnlyAlphanumeriCharacters() {

        // GIVEN
        final int min = createMinValue();
        final int max = createMaxValue(min);

        // WHEN
        final String randomAlphanumeric = RandomStrings.randomAlphanumeric(min, max);

        // THEN
        thenAssert(randomAlphanumeric).matches("[A-Za-z0-9]+");

    }

    @RepeatedTest(1_000)
    void randomAscii_sizeIsTen() {

        // WHEN
        final String randomAscii = RandomStrings.randomAscii();

        // THEN
        thenAssert(randomAscii).hasSize(10);

    }

    @RepeatedTest(1_000)
    void randomAscii_containsOnlyAsciiCharacters() {

        // WHEN
        final String randomAscii = RandomStrings.randomAscii();

        // THEN
        thenAssert(randomAscii).matches("[\\x20-\\x7E]+");

    }

    @RepeatedTest(1_000)
    void randomAscii_withMinMax_SizeIsBetweenMinAndMax() {

        // GIVEN
        final int min = createMinValue();
        final int max = createMaxValue(min);

        // WHEN
        final String randomAscii = RandomStrings.randomAscii(min, max);

        // THEN
        thenAssert(randomAscii).hasSizeBetween(min, max - 1);

    }

    @RepeatedTest(1000)
    void randomAscii_withMinMax_containsOnlyAsciiCharacters() {

        // GIVEN
        final int min = createMinValue();
        final int max = createMaxValue(min);

        // WHEN
        final String randomAscii = RandomStrings.randomAscii(min, max);

        // THEN
        thenAssert(randomAscii).matches("[\\x20-\\x7E]+");

    }

    private int createMaxValue(final int min) {
        return min + RANDOM.nextInt(100) + 1;
    }

    private int createMinValue() {
        return RANDOM.nextInt(100) + 1;
    }

}