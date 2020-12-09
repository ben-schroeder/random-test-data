package eu.benschroeder.testdata.statics;

import eu.benschroeder.assertj.WithAssertJForMockito;
import org.junit.jupiter.api.RepeatedTest;

import java.math.BigDecimal;
import java.math.BigInteger;

class RandomNumbersTest implements WithAssertJForMockito {

    @RepeatedTest(1_000)
    void randomDouble_isNotNegative() {

        // WHEN
        final double randomDouble = RandomNumbers.randomDouble();

        // THEN
        thenAssert(randomDouble).isNotNegative();
    }

    @RepeatedTest(1_000)
    void randomInt_isNotNegative() {

        // WHEN
        final int randomInt = RandomNumbers.randomInt();

        // THEN
        thenAssert(randomInt).isNotNegative();
    }

    @RepeatedTest(1_000)
    void randomFloat_isNotNegative() {

        // WHEN
        final float randomFloat = RandomNumbers.randomFloat();

        // THEN
        thenAssert(randomFloat).isNotNegative();
    }

    @RepeatedTest(1_000)
    void randomLong_isNotNegative() {

        // WHEN
        final long randomLong = RandomNumbers.randomLong();

        // THEN
        thenAssert(randomLong).isNotNegative();
    }

    @RepeatedTest(1_000)
    void randomBigDecimal_isNotNegative() {

        // WHEN
        final BigDecimal bigDecimal = RandomNumbers.randomBigDecimal();

        // THEN
        thenAssert(bigDecimal).isNotNegative();

    }

    @RepeatedTest(1_000)
    void randomBigInteger_isNotNegative() {

        // WHEN
        final BigInteger bigInteger = RandomNumbers.randomBigInteger();

        // THEN
        thenAssert(bigInteger).isNotNegative();

    }

    @RepeatedTest(1_000)
    void randomPositiveInt_isPositive() {

        // WHEN
        final int positiveInt = RandomNumbers.randomPositiveInt();

        // THEN
        thenAssert(positiveInt).isPositive();

    }

    @RepeatedTest(1_000)
    void randomPositiveLong_isPositive() {

        // WHEN
        final long positiveLong = RandomNumbers.randomPositiveLong();

        // THEN
        thenAssert(positiveLong).isPositive();

    }

    @RepeatedTest(1_000)
    void randomPositiveFloat_isPositive() {

        // WHEN
        final float positiveFloat = RandomNumbers.randomPositiveFloat();

        // THEN
        thenAssert(positiveFloat).isPositive();

    }

    @RepeatedTest(1_000)
    void randomPositiveDouble_isPositive() {

        // WHEN
        final double positiveDouble = RandomNumbers.randomPositiveDouble();

        // THEN
        thenAssert(positiveDouble).isPositive();

    }


}