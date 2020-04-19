package eu.benschroeder.testdata;

import eu.benschroeder.testdata.statics.RandomDateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * Provides random date and time objects in an interface.
 *
 * @author Benjamin Schröder
 **/
public interface WithRandomDateAndTime extends WithRandomNumbers {

    /**
     * Random {@link OffsetDateTime} between 1970-01-01T00:00:00Z and now.
     *
     * @see RandomDateAndTime#randomPastOffsetDateTime()
     */
    default OffsetDateTime randomPastOffsetDateTime() {
        return RandomDateAndTime.randomPastOffsetDateTime();
    }

    /**
     * Random {@link OffsetDateTime} between now and 2200-01-01T00:00:00Z.
     *
     * @see RandomDateAndTime#randomFutureOffsetDateTime()
     */
    default OffsetDateTime randomFutureOffsetDateTime() {
        return RandomDateAndTime.randomFutureOffsetDateTime();
    }

    /**
     * Random {@link ZonedDateTime} between 1970-01-01T00:00:00Z and now.
     *
     * @see RandomDateAndTime#randomPastZonedDateTime()
     */
    default ZonedDateTime randomPastZonedDateTime() {
        return RandomDateAndTime.randomPastZonedDateTime();
    }

    /**
     * Random {@link ZonedDateTime} between now and 2200-01-01T00:00:00Z.
     *
     * @see RandomDateAndTime#randomFutureZonedDateTime()
     */
    default ZonedDateTime randomFutureZonedDateTime() {
        return RandomDateAndTime.randomFutureZonedDateTime();
    }

    /**
     * Random {@link LocalDateTime} between 1970-01-01T00:00:00 and now.
     *
     * @see RandomDateAndTime#randomPastLocalDateTime()
     */
    default LocalDateTime randomPastLocalDateTime() {
        return RandomDateAndTime.randomPastLocalDateTime();
    }

    /**
     * Random {@link LocalDateTime} between now and 2200-01-01T00:00:00.
     *
     * @see RandomDateAndTime#randomFutureLocalDateTime()
     */
    default LocalDateTime randomFutureLocalDateTime() {
        return RandomDateAndTime.randomFutureLocalDateTime();
    }

    /**
     * Random {@link LocalDate} between 1970-01-01 and now.
     *
     * @see RandomDateAndTime#randomPastLocalDate()
     */
    default LocalDate randomPastLocalDate() {
        return RandomDateAndTime.randomPastLocalDate();
    }

    /**
     * Random {@link LocalDate} between now and 2200-01-01T00:00:00.
     *
     * @see RandomDateAndTime#randomFutureLocalDate()
     */
    default LocalDate randomFutureLocalDate() {
        return RandomDateAndTime.randomFutureLocalDate();
    }

    /**
     * Random {@link java.time.LocalTime}.
     *
     * @see RandomDateAndTime#randomLocalTime()
     */
    default LocalTime randomLocalTime() {
        return RandomDateAndTime.randomLocalTime();
    }

    /**
     * Random {@link java.time.OffsetTime}.
     *
     * @see RandomDateAndTime#randomOffsetTime()
     */
    default OffsetTime randomOffsetTime() {
        return RandomDateAndTime.randomOffsetTime();
    }

    /**
     * Random {@link Date} between 1970-02-01T00:00:00 and now.
     *
     * @see RandomDateAndTime#randomPastDate()
     */
    default Date randomPastDate() {
        return RandomDateAndTime.randomPastDate();
    }

    /**
     * Random {@link Date} between now and 2200-01-01T00:00:00.
     *
     * @see RandomDateAndTime#randomFutureDate()
     */
    default Date randomFutureDate() {
        return RandomDateAndTime.randomFutureDate();
    }

}
