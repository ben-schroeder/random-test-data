package eu.benschroeder.testdata;

import eu.benschroeder.assertj.WithAssertJForMockito;
import eu.benschroeder.mockito.WithBDDMockito;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

@ExtendWith(MockitoExtension.class)
class WithRandomDateAndTimeTest implements WithAssertJForMockito, WithBDDMockito {

    @Spy
    private WithRandomDateAndTime withRandomDateAndTime;

    @RepeatedTest(1_000)
    void randomPastDate_isBeforeOrEqualToNow() {

        // WHEN
        final Date date = withRandomDateAndTime.randomPastDate();

        // THEN
        thenAssert(date).isBeforeOrEqualTo(new Date());

    }

    @RepeatedTest(1_000)
    void randomFutureDate_isAfterOrEqualToNow() {

        // WHEN
        final Date date = withRandomDateAndTime.randomFutureDate();

        // THEN
        thenAssert(date).isAfterOrEqualTo(new Date());

    }

    @RepeatedTest(1_000)
    void randomPastOffsetDateTime_isBeforeOrEqualToNow() {

        // WHEN
        final OffsetDateTime offsetDateTime = withRandomDateAndTime.randomPastOffsetDateTime();

        // THEN
        thenAssert(offsetDateTime).isBeforeOrEqualTo(OffsetDateTime.now());

    }

    @RepeatedTest(1_000)
    void randomPastOffsetDateTime_isAfterOrEqualToEpoch() {

        // WHEN
        final OffsetDateTime offsetDateTime = withRandomDateAndTime.randomPastOffsetDateTime();

        // THEN
        thenAssert(offsetDateTime).isAfterOrEqualTo(OffsetDateTime.ofInstant(Instant.EPOCH, ZoneId.systemDefault()));

    }

    @RepeatedTest(1_000)
    void randomFutureOffsetDateTime_isAfterOrEqualToNow() {

        // WHEN
        final OffsetDateTime offsetDateTime = withRandomDateAndTime.randomFutureOffsetDateTime();

        // THEN
        thenAssert(offsetDateTime).isAfterOrEqualTo(OffsetDateTime.now());

    }

    @RepeatedTest(1_000)
    void randomPastZonedDateTime_isBeforeOrEqualToNow() {

        // WHEN
        final ZonedDateTime zonedDateTime = withRandomDateAndTime.randomPastZonedDateTime();

        // THEN
        thenAssert(zonedDateTime).isBeforeOrEqualTo(ZonedDateTime.now());

    }

    @RepeatedTest(1_000)
    void randomPastZonedDateTime_isAfterOrEqualToEpoch() {

        // WHEN
        final ZonedDateTime zonedDateTime = withRandomDateAndTime.randomPastZonedDateTime();

        // THEN
        thenAssert(zonedDateTime).isAfterOrEqualTo(ZonedDateTime.ofInstant(Instant.EPOCH, ZoneId.systemDefault()));

    }

    @RepeatedTest(1_000)
    void randomFutureZonedDateTime_isAfterOrEqualToNow() {

        // WHEN
        final ZonedDateTime zonedDateTime = withRandomDateAndTime.randomFutureZonedDateTime();

        // THEN
        thenAssert(zonedDateTime).isAfterOrEqualTo(ZonedDateTime.now());

    }

    @RepeatedTest(1_000)
    void randomPastLocalDateTime_isBeforeOrEqualToNow() {

        // WHEN
        final LocalDateTime localDateTime = withRandomDateAndTime.randomPastLocalDateTime();

        // THEN
        thenAssert(localDateTime).isBeforeOrEqualTo(LocalDateTime.now());

    }

    @RepeatedTest(1_000)
    void randomFutureLocalDateTime_isAfterOrEqualToNow() {

        // WHEN
        final LocalDateTime localDateTime = withRandomDateAndTime.randomFutureLocalDateTime();

        // THEN
        thenAssert(localDateTime).isAfterOrEqualTo(LocalDateTime.now());

    }

    @RepeatedTest(1_000)
    void randomPastLocalDate_isBeforeOrEqualToNow() {

        // WHEN
        final LocalDate localDate = withRandomDateAndTime.randomPastLocalDate();

        // THEN
        thenAssert(localDate).isBeforeOrEqualTo(LocalDate.now());

    }

    @RepeatedTest(1_000)
    void randomFutureLocalDate_isAfterOrEqualToNow() {

        // WHEN
        final LocalDate localDate = withRandomDateAndTime.randomFutureLocalDate();

        // THEN
        thenAssert(localDate).isAfterOrEqualTo(LocalDate.now());

    }

    @RepeatedTest(1_000)
    void randomLocalTime_isValid() {

        assertThatCode(() -> withRandomDateAndTime.randomLocalTime()).doesNotThrowAnyException();

    }

    @RepeatedTest(1_000)
    void randomOffsetTime_isValid() {

        assertThatCode(() -> withRandomDateAndTime.randomOffsetTime()).doesNotThrowAnyException();

    }
}