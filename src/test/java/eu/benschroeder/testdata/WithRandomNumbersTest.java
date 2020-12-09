package eu.benschroeder.testdata;

import eu.benschroeder.assertj.WithAssertJForMockito;
import eu.benschroeder.mockito.WithBDDMockito;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.math.BigInteger;

@ExtendWith(MockitoExtension.class)
class WithRandomNumbersTest implements WithAssertJForMockito, WithBDDMockito {

    @Spy
    private WithRandomNumbers withRandomNumbers;


    @RepeatedTest(1_000)
    void randomDouble_isNotNegative() {

        // WHEN
        final double randomDouble = withRandomNumbers.randomDouble();

        // THEN
        thenAssert(randomDouble).isNotNegative();
    }

    @RepeatedTest(1_000)
    void randomInt_isNotNegative() {

        // WHEN
        final int randomInt = withRandomNumbers.randomInt();

        // THEN
        thenAssert(randomInt).isNotNegative();
    }

    @RepeatedTest(1_000)
    void randomFloat_isNotNegative() {

        // WHEN
        final float randomFloat = withRandomNumbers.randomFloat();

        // THEN
        thenAssert(randomFloat).isNotNegative();
    }

    @RepeatedTest(1_000)
    void randomLong_isNotNegative() {

        // WHEN
        final long randomLong = withRandomNumbers.randomLong();

        // THEN
        thenAssert(randomLong).isNotNegative();
    }

    @RepeatedTest(1_000)
    void randomBigDecimal_isNotNegative() {

        // WHEN
        final BigDecimal bigDecimal = withRandomNumbers.randomBigDecimal();

        // THEN
        thenAssert(bigDecimal).isNotNegative();

    }

    @RepeatedTest(1_000)
    void randomBigInteger_isNotNegative() {

        // WHEN
        final BigInteger bigInteger = withRandomNumbers.randomBigInteger();

        // THEN
        thenAssert(bigInteger).isNotNegative();

    }

    @RepeatedTest(1_000)
    void randomPositiveInt_isPositive() {

        // WHEN
        final int positiveInt = withRandomNumbers.randomPositiveInt();

        // THEN
        thenAssert(positiveInt).isPositive();

    }

    @RepeatedTest(1_000)
    void randomPositiveLong_isPositive() {

        // WHEN
        final long positiveLong = withRandomNumbers.randomPositiveLong();

        // THEN
        thenAssert(positiveLong).isPositive();

    }

    @RepeatedTest(1_000)
    void randomPositiveFloat_isPositive() {

        // WHEN
        final float positiveFloat = withRandomNumbers.randomPositiveFloat();

        // THEN
        thenAssert(positiveFloat).isPositive();

    }

    @RepeatedTest(1_000)
    void randomPositiveDouble_isPositive() {

        // WHEN
        final double positiveDouble = withRandomNumbers.randomPositiveDouble();

        // THEN
        thenAssert(positiveDouble).isPositive();

    }

}