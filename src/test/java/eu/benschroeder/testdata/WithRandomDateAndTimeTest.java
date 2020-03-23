package eu.benschroeder.testdata;

import eu.benschroeder.assertj.WithAssertJForMockito;
import eu.benschroeder.mockito.WithBDDMockito;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.util.Date;

@ExtendWith(MockitoExtension.class)
class WithRandomDateAndTimeTest implements WithAssertJForMockito, WithBDDMockito {

    @Spy
    private WithRandomDateAndTime withRandomDateAndTime;

    @RepeatedTest(100)
    void randomPastDate_isBeforeOrEqualToNow() {

        // WHEN
        final Date date = withRandomDateAndTime.randomPastDate();

        // THEN
        thenAssert(date).isBeforeOrEqualTo(new Date());

    }

    @RepeatedTest(100)
    void randomFutureDate_isAfterOrEqualToNow() {

        // WHEN
        final Date date = withRandomDateAndTime.randomFutureDate();

        // THEN
        thenAssert(date).isAfterOrEqualTo(new Date());

    }

    @RepeatedTest(100)
    void randomPastLocalDateTime_isBeforeOrEqualToNow() {

        // WHEN
        final LocalDateTime localDateTime = withRandomDateAndTime.randomPastLocalDateTime();

        // THEN
        thenAssert(localDateTime).isBeforeOrEqualTo(LocalDateTime.now());

    }

    @RepeatedTest(100)
    void randomFutureLocalDateTime_isAfterOrEqualToNow() {

        // WHEN
        final LocalDateTime localDateTime = withRandomDateAndTime.randomFutureLocalDateTime();

        // THEN
        thenAssert(localDateTime).isAfterOrEqualTo(LocalDateTime.now());

    }

}