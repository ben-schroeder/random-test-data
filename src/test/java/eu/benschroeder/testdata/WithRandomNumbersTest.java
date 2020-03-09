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

    @RepeatedTest(100)
    void randomBigDecimal_isNotNegative() {

        // WHEN
        final BigDecimal bigDecimal = withRandomNumbers.randomBigDecimal();

        // THEN
        thenAssert(bigDecimal).isNotNegative();

    }

    @RepeatedTest(100)
    void randomBigInteger_isNotNegative() {

        // WHEN
        final BigInteger bigInteger = withRandomNumbers.randomBigInteger();

        // THEN
        thenAssert(bigInteger).isNotNegative();

    }

}