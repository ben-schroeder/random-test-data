package eu.benschroeder.testdata.statics;

import eu.benschroeder.assertj.WithAssertJForMockito;
import org.junit.jupiter.api.RepeatedTest;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

class RandomDateAndTimeTest implements WithAssertJForMockito {

    @RepeatedTest(1_000)
    void randomPastDate_isBeforeOrEqualToNow() {

        // WHEN
        final Date date = RandomDateAndTime.randomPastDate();

        // THEN
        thenAssert(date).isBeforeOrEqualTo(new Date());

    }

    @RepeatedTest(1_000)
    void randomFutureDate_isAfterOrEqualToNow() {

        // WHEN
        final Date date = RandomDateAndTime.randomFutureDate();

        // THEN
        thenAssert(date).isAfterOrEqualTo(new Date());

    }

    @RepeatedTest(1_000)
    void randomPastOffsetDateTime_isBeforeOrEqualToNow() {

        // WHEN
        final OffsetDateTime offsetDateTime = RandomDateAndTime.randomPastOffsetDateTime();

        // THEN
        thenAssert(offsetDateTime).isBeforeOrEqualTo(OffsetDateTime.now());

    }

    @RepeatedTest(1_000)
    void randomPastOffsetDateTime_isAfterOrEqualToEpoch() {

        // WHEN
        final OffsetDateTime offsetDateTime = RandomDateAndTime.randomPastOffsetDateTime();

        // THEN
        thenAssert(offsetDateTime).isAfterOrEqualTo(OffsetDateTime.ofInstant(Instant.EPOCH, ZoneId.systemDefault()));

    }

    @RepeatedTest(1_000)
    void randomFutureOffsetDateTime_isAfterOrEqualToNow() {

        // WHEN
        final OffsetDateTime offsetDateTime = RandomDateAndTime.randomFutureOffsetDateTime();

        // THEN
        thenAssert(offsetDateTime).isAfterOrEqualTo(OffsetDateTime.now());

    }

    @RepeatedTest(1_000)
    void randomPastZonedDateTime_isBeforeOrEqualToNow() {

        // WHEN
        final ZonedDateTime zonedDateTime = RandomDateAndTime.randomPastZonedDateTime();

        // THEN
        thenAssert(zonedDateTime).isBeforeOrEqualTo(ZonedDateTime.now());

    }

    @RepeatedTest(1_000)
    void randomPastZonedDateTime_isAfterOrEqualToEpoch() {

        // WHEN
        final ZonedDateTime zonedDateTime = RandomDateAndTime.randomPastZonedDateTime();

        // THEN
        thenAssert(zonedDateTime).isAfterOrEqualTo(ZonedDateTime.ofInstant(Instant.EPOCH, ZoneId.systemDefault()));

    }

    @RepeatedTest(1_000)
    void randomFutureZonedDateTime_isAfterOrEqualToNow() {

        // WHEN
        final ZonedDateTime zonedDateTime = RandomDateAndTime.randomFutureZonedDateTime();

        // THEN
        thenAssert(zonedDateTime).isAfterOrEqualTo(ZonedDateTime.now());

    }

    @RepeatedTest(1_000)
    void randomPastLocalDateTime_isBeforeOrEqualToNow() {

        // WHEN
        final LocalDateTime localDateTime = RandomDateAndTime.randomPastLocalDateTime();

        // THEN
        thenAssert(localDateTime).isBeforeOrEqualTo(LocalDateTime.now());

    }

    @RepeatedTest(1_000)
    void randomFutureLocalDateTime_isAfterOrEqualToNow() {

        // WHEN
        final LocalDateTime localDateTime = RandomDateAndTime.randomFutureLocalDateTime();

        // THEN
        thenAssert(localDateTime).isAfterOrEqualTo(LocalDateTime.now());

    }

    @RepeatedTest(1_000)
    void randomPastLocalDate_isBeforeOrEqualToNow() {

        // WHEN
        final LocalDate localDate = RandomDateAndTime.randomPastLocalDate();

        // THEN
        thenAssert(localDate).isBeforeOrEqualTo(LocalDate.now());

    }

    @RepeatedTest(1_000)
    void randomFutureLocalDate_isAfterOrEqualToNow() {

        // WHEN
        final LocalDate localDate = RandomDateAndTime.randomFutureLocalDate();

        // THEN
        thenAssert(localDate).isAfterOrEqualTo(LocalDate.now());

    }

    @RepeatedTest(1_000)
    void randomLocalTime_isValid() {

        assertThatCode(RandomDateAndTime::randomLocalTime).doesNotThrowAnyException();

    }

    @RepeatedTest(1_000)
    void randomOffsetTime_isValid() {

        assertThatCode(RandomDateAndTime::randomOffsetTime).doesNotThrowAnyException();

    }

}