package eu.benschroeder.testdata;

import eu.benschroeder.assertj.WithAssertJForMockito;
import eu.benschroeder.mockito.WithBDDMockito;
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
        final byte[] bytes = withRandomTestData.randomByteArray();

        // THEN
        thenAssert(bytes).hasSize(10);

    }

    @RepeatedTest(100)
    void randomByteArray_lengthMatchesGivenLength() {

        // GIVEN
        final int length = RandomUtils.nextInt(1, 100);

        // WHEN
        final byte[] bytes = withRandomTestData.randomByteArray(length);

        // THEN
        thenAssert(bytes).hasSize(length);

    }

    @RepeatedTest(100)
    void randomEnum() {

        // WHEN
        final DayOfWeek dayOfWeek = withRandomTestData.randomEnum(DayOfWeek.class);

        // THEN
        thenAssert(dayOfWeek).isExactlyInstanceOf(DayOfWeek.class);

    }

    @RepeatedTest(100)
    void randomEnumExcluding_noExclude() {

        // WHEN
        final DayOfWeek dayOfWeek = withRandomTestData.randomEnumExcluding(DayOfWeek.class);

        // THEN
        thenAssert(dayOfWeek).isExactlyInstanceOf(DayOfWeek.class);

    }

    @RepeatedTest(100)
    void randomEnumExcluding_oneExclude() {

        // GIVEN
        final DayOfWeek exclude = DayOfWeek.MONDAY;

        // WHEN
        final DayOfWeek dayOfWeek = withRandomTestData.randomEnumExcluding(DayOfWeek.class, exclude);

        // THEN
        thenAssert(dayOfWeek).isExactlyInstanceOf(DayOfWeek.class).isNotEqualTo(exclude);

    }

    @RepeatedTest(100)
    void randomEnumExcluding_twoExcludes() {

        // GIVEN
        final DayOfWeek exclude1 = DayOfWeek.MONDAY;
        final DayOfWeek exclude2 = DayOfWeek.SATURDAY;

        // WHEN
        final DayOfWeek dayOfWeek = withRandomTestData.randomEnumExcluding(DayOfWeek.class, exclude1, exclude2);

        // THEN
        thenAssert(dayOfWeek).isExactlyInstanceOf(DayOfWeek.class).isNotEqualTo(exclude1).isNotEqualTo(exclude2);

    }

}