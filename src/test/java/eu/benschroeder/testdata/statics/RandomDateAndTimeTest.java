package eu.benschroeder.testdata.statics;

import eu.benschroeder.assertj.WithAssertJForMockito;
import eu.benschroeder.mockito.WithBDDMockito;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

@ExtendWith(MockitoExtension.class)
class RandomDateAndTimeTest implements WithAssertJForMockito, WithBDDMockito {

    @RepeatedTest(100)
    void randomPastDate_isBeforeOrEqualToNow() {

        // WHEN
        final Date date = RandomDateAndTime.randomPastDate();

        // THEN
        thenAssert(date).isBeforeOrEqualTo(new Date());

    }

    @RepeatedTest(100)
    void randomFutureDate_isAfterOrEqualToNow() {

        // WHEN
        final Date date = RandomDateAndTime.randomFutureDate();

        // THEN
        thenAssert(date).isAfterOrEqualTo(new Date());

    }

    @RepeatedTest(100)
    void randomPastOffsetDateTime_isBeforeOrEqualToNow() {

        // WHEN
        final OffsetDateTime offsetDateTime = RandomDateAndTime.randomPastOffsetDateTime();

        // THEN
        thenAssert(offsetDateTime).isBeforeOrEqualTo(OffsetDateTime.now());

    }

    @RepeatedTest(100)
    void randomPastOffsetDateTime_isAfterOrEqualToEpoch() {

        // WHEN
        final OffsetDateTime offsetDateTime = RandomDateAndTime.randomPastOffsetDateTime();

        // THEN
        thenAssert(offsetDateTime).isAfterOrEqualTo(OffsetDateTime.ofInstant(Instant.EPOCH, ZoneId.systemDefault()));

    }

    @RepeatedTest(100)
    void randomFutureOffsetDateTime_isAfterOrEqualToNow() {

        // WHEN
        final OffsetDateTime offsetDateTime = RandomDateAndTime.randomFutureOffsetDateTime();

        // THEN
        thenAssert(offsetDateTime).isAfterOrEqualTo(OffsetDateTime.now());

    }

    @RepeatedTest(100)
    void randomPastZonedDateTime_isBeforeOrEqualToNow() {

        // WHEN
        final ZonedDateTime zonedDateTime = RandomDateAndTime.randomPastZonedDateTime();

        // THEN
        thenAssert(zonedDateTime).isBeforeOrEqualTo(ZonedDateTime.now());

    }

    @RepeatedTest(100)
    void randomPastZonedDateTime_isAfterOrEqualToEpoch() {

        // WHEN
        final ZonedDateTime zonedDateTime = RandomDateAndTime.randomPastZonedDateTime();

        // THEN
        thenAssert(zonedDateTime).isAfterOrEqualTo(ZonedDateTime.ofInstant(Instant.EPOCH, ZoneId.systemDefault()));

    }

    @RepeatedTest(100)
    void randomFutureZonedDateTime_isAfterOrEqualToNow() {

        // WHEN
        final ZonedDateTime zonedDateTime = RandomDateAndTime.randomFutureZonedDateTime();

        // THEN
        thenAssert(zonedDateTime).isAfterOrEqualTo(ZonedDateTime.now());

    }

    @RepeatedTest(100)
    void randomPastLocalDateTime_isBeforeOrEqualToNow() {

        // WHEN
        final LocalDateTime localDateTime = RandomDateAndTime.randomPastLocalDateTime();

        // THEN
        thenAssert(localDateTime).isBeforeOrEqualTo(LocalDateTime.now());

    }

    @RepeatedTest(100)
    void randomFutureLocalDateTime_isAfterOrEqualToNow() {

        // WHEN
        final LocalDateTime localDateTime = RandomDateAndTime.randomFutureLocalDateTime();

        // THEN
        thenAssert(localDateTime).isAfterOrEqualTo(LocalDateTime.now());

    }

    @RepeatedTest(100)
    void randomPastLocalDate_isBeforeOrEqualToNow() {

        // WHEN
        final LocalDate localDate = RandomDateAndTime.randomPastLocalDate();

        // THEN
        thenAssert(localDate).isBeforeOrEqualTo(LocalDate.now());

    }

    @RepeatedTest(100)
    void randomFutureLocalDate_isAfterOrEqualToNow() {

        // WHEN
        final LocalDate localDate = RandomDateAndTime.randomFutureLocalDate();

        // THEN
        thenAssert(localDate).isAfterOrEqualTo(LocalDate.now());

    }

    @RepeatedTest(100)
    void randomLocalTime_isValid() {

        assertThatCode(RandomDateAndTime::randomLocalTime).doesNotThrowAnyException();

    }

    @RepeatedTest(100)
    void randomOffsetTime_isValid() {

        assertThatCode(RandomDateAndTime::randomOffsetTime).doesNotThrowAnyException();

    }

}