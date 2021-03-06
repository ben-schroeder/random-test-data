package eu.benschroeder.testdata.statics;

import eu.benschroeder.assertj.WithAssertJForMockito;
import org.apache.commons.lang3.RandomUtils;
import org.junit.jupiter.api.RepeatedTest;

import java.time.DayOfWeek;

class RandomTestDataTest implements WithAssertJForMockito {

    @RepeatedTest(1_000)
    void randomBoolean_isValid() {

        assertThatCode(RandomTestData::randomBoolean).doesNotThrowAnyException();

    }

    @RepeatedTest(1_000)
    void randomByteArray_lengthIsTen() {

        // WHEN
        final byte[] bytes = RandomTestData.randomByteArray();

        // THEN
        thenAssert(bytes).hasSize(10);

    }

    @RepeatedTest(1_000)
    void randomByteArray_lengthMatchesGivenLength() {

        // GIVEN
        final int length = RandomUtils.nextInt(1, 100);

        // WHEN
        final byte[] bytes = RandomTestData.randomByteArray(length);

        // THEN
        thenAssert(bytes).hasSize(length);

    }

    @RepeatedTest(1_000)
    void randomEnum() {

        // WHEN
        final DayOfWeek dayOfWeek = RandomTestData.randomEnum(DayOfWeek.class);

        // THEN
        thenAssert(dayOfWeek).isExactlyInstanceOf(DayOfWeek.class);

    }

    @RepeatedTest(1_000)
    void randomEnumExcluding_noExclude() {

        // WHEN
        final DayOfWeek dayOfWeek = RandomTestData.randomEnumExcluding(DayOfWeek.class);

        // THEN
        thenAssert(dayOfWeek).isExactlyInstanceOf(DayOfWeek.class);

    }

    @RepeatedTest(1_000)
    void randomEnumExcluding_oneExclude() {

        // GIVEN
        final DayOfWeek exclude = DayOfWeek.MONDAY;

        // WHEN
        final DayOfWeek dayOfWeek = RandomTestData.randomEnumExcluding(DayOfWeek.class, exclude);

        // THEN
        thenAssert(dayOfWeek).isExactlyInstanceOf(DayOfWeek.class).isNotEqualTo(exclude);

    }

    @RepeatedTest(1_000)
    void randomEnumExcluding_twoExcludes() {

        // GIVEN
        final DayOfWeek exclude1 = DayOfWeek.MONDAY;
        final DayOfWeek exclude2 = DayOfWeek.SATURDAY;

        // WHEN
        final DayOfWeek dayOfWeek = RandomTestData.randomEnumExcluding(DayOfWeek.class, exclude1, exclude2);

        // THEN
        thenAssert(dayOfWeek).isExactlyInstanceOf(DayOfWeek.class).isNotEqualTo(exclude1).isNotEqualTo(exclude2);

    }

}