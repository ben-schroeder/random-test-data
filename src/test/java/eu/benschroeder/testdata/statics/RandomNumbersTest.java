package eu.benschroeder.testdata.statics;

import eu.benschroeder.assertj.WithAssertJForMockito;
import eu.benschroeder.mockito.WithBDDMockito;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.math.BigInteger;

@ExtendWith(MockitoExtension.class)
class RandomNumbersTest implements WithAssertJForMockito, WithBDDMockito {

    @RepeatedTest(100)
    void randomDouble_isValid() {
        assertThatCode(RandomNumbers::randomDouble).doesNotThrowAnyException();
    }

    @RepeatedTest(100)
    void randomInt_isValid() {
        assertThatCode(RandomNumbers::randomInt).doesNotThrowAnyException();
    }

    @RepeatedTest(100)
    void randomFloat_isValid() {
        assertThatCode(RandomNumbers::randomFloat).doesNotThrowAnyException();
    }

    @RepeatedTest(100)
    void randomLong_isValid() {
        assertThatCode(RandomNumbers::randomLong).doesNotThrowAnyException();
    }

    @RepeatedTest(100)
    void randomBigDecimal_isNotNegative() {

        // WHEN
        final BigDecimal bigDecimal = RandomNumbers.randomBigDecimal();

        // THEN
        thenAssert(bigDecimal).isNotNegative();

    }

    @RepeatedTest(100)
    void randomBigInteger_isNotNegative() {

        // WHEN
        final BigInteger bigInteger = RandomNumbers.randomBigInteger();

        // THEN
        thenAssert(bigInteger).isNotNegative();

    }

}