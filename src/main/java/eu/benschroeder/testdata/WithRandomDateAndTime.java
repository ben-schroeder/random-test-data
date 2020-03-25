package eu.benschroeder.testdata;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Provides random date and time objects.
 *
 * @author Benjamin Schröder
 **/
public interface WithRandomDateAndTime extends WithRandomNumbers {

    /**
     * Random {@link OffsetDateTime} between 1970-01-01T00:00:00Z and now.
     */
    default OffsetDateTime randomPastOffsetDateTime() {
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(randomLong(Constants.MIN_UTC_EPOCH, Instant.now().getEpochSecond())), ZoneId.systemDefault());
    }

    /**
     * Random {@link OffsetDateTime} between now and 2200-01-01T00:00:00Z.
     */
    default OffsetDateTime randomFutureOffsetDateTime() {
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(randomLong(Instant.now().getEpochSecond(), Constants.MAX_UTC_EPOCH)), ZoneId.systemDefault());
    }

    /**
     * Random {@link ZonedDateTime} between 1970-01-01T00:00:00Z and now.
     */
    default ZonedDateTime randomPastZonedDateTime() {
        return ZonedDateTime.ofInstant(Instant.ofEpochSecond(randomLong(Constants.MIN_UTC_EPOCH, Instant.now().getEpochSecond())), ZoneId.systemDefault());
    }

    /**
     * Random {@link ZonedDateTime} between now and 2200-01-01T00:00:00Z.
     */
    default ZonedDateTime randomFutureZonedDateTime() {
        return ZonedDateTime.ofInstant(Instant.ofEpochSecond(randomLong(Instant.now().getEpochSecond(), Constants.MAX_UTC_EPOCH)), ZoneId.systemDefault());
    }

    /**
     * Random {@link LocalDateTime} between 1970-01-01T00:00:00 and now.
     */
    default LocalDateTime randomPastLocalDateTime() {
        return LocalDateTime.ofEpochSecond(randomLong(Constants.MIN_UTC_EPOCH, Instant.now().getEpochSecond()), 0, ZoneOffset.UTC);
    }

    /**
     * Random {@link LocalDateTime} between now and 2200-01-01T00:00:00.
     */
    default LocalDateTime randomFutureLocalDateTime() {
        return LocalDateTime.ofEpochSecond(randomLong(Instant.now().getEpochSecond(), Constants.MAX_UTC_EPOCH), 0, ZoneOffset.UTC);
    }

    /**
     * Random {@link LocalDate} between 1970-01-01 and now.
     */
    default LocalDate randomPastLocalDate() {
        return LocalDate.ofEpochDay(randomLong(0, LocalDate.now().plusDays(1L).toEpochDay()));
    }

    /**
     * Random {@link LocalDate} between now and 2200-01-01T00:00:00.
     */
    default LocalDate randomFutureLocalDate() {
        return LocalDate.ofEpochDay(randomLong(LocalDate.now().toEpochDay(), LocalDate.of(2200, 1, 1).toEpochDay()));
    }

    /**
     * Random {@link java.time.LocalTime}.
     */
    default LocalTime randomLocalTime() {
        return LocalTime.of(randomInt(0, 24), randomInt(0, 60), randomInt(0, 60));
    }

    /**
     * Random {@link Date} between 1970-02-01T00:00:00 and now.
     */
    default Date randomPastDate() {
        final long from = new GregorianCalendar(1970, Calendar.FEBRUARY, 1, 0, 0, 0).getTimeInMillis();
        final long to = new Date().getTime();
        return new Date(randomLong(from, to));
    }

    /**
     * Random {@link Date} between now and 2200-01-01T00:00:00.
     */
    default Date randomFutureDate() {
        final long from = new Date().getTime();
        final long to = new GregorianCalendar(2200, Calendar.JANUARY, 1, 0, 0, 0).getTimeInMillis();
        return new Date(randomLong(from, to));
    }

}
