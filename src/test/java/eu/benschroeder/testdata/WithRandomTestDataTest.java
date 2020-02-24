package eu.benschroeder.testdata;

import eu.benschroeder.assertj.WithAssertJForMockito;
import eu.benschroeder.mockito.WithBDDMockito;
import io.github.artsok.RepeatedIfExceptionsTest;
import org.apache.commons.lang3.RandomUtils;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.DayOfWeek;

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

    @RepeatedTest(100)
    void randomEnum() {

        // WHEN
        DayOfWeek dayOfWeek = withRandomTestData.randomEnum(DayOfWeek.class);

        // THEN
        thenAssert(dayOfWeek).isExactlyInstanceOf(DayOfWeek.class);

    }

    @RepeatedIfExceptionsTest(repeats = 10, minSuccess = 5)
    void randomEnum_notEqual() {

        // WHEN
        DayOfWeek dayOfWeek1 = withRandomTestData.randomEnum(DayOfWeek.class);
        DayOfWeek dayOfWeek2 = withRandomTestData.randomEnum(DayOfWeek.class);


        // THEN
        thenAssert(dayOfWeek1).isNotEqualTo(dayOfWeek2);

    }

    @RepeatedTest(100)
    void randomEnumExcluding_noExclude() {

        // WHEN
        DayOfWeek dayOfWeek = withRandomTestData.randomEnumExcluding(DayOfWeek.class);

        // THEN
        thenAssert(dayOfWeek).isExactlyInstanceOf(DayOfWeek.class);

    }

    @RepeatedTest(100)
    void randomEnumExcluding_oneExclude() {

        // GIVEN
        DayOfWeek exclude = DayOfWeek.MONDAY;

        // WHEN
        DayOfWeek dayOfWeek = withRandomTestData.randomEnumExcluding(DayOfWeek.class, exclude);

        // THEN
        thenAssert(dayOfWeek).isExactlyInstanceOf(DayOfWeek.class).isNotEqualTo(exclude);

    }

    @RepeatedTest(100)
    void randomEnumExcluding_twoExcludes() {

        // GIVEN
        DayOfWeek exclude1 = DayOfWeek.MONDAY;
        DayOfWeek exclude2 = DayOfWeek.SATURDAY;

        // WHEN
        DayOfWeek dayOfWeek = withRandomTestData.randomEnumExcluding(DayOfWeek.class, exclude1, exclude2);

        // THEN
        thenAssert(dayOfWeek).isExactlyInstanceOf(DayOfWeek.class).isNotEqualTo(exclude1).isNotEqualTo(exclude2);

    }

}