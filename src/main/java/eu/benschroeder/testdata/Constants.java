package eu.benschroeder.testdata;

import java.time.Instant;

final class Constants {

    private Constants() {
        // empty
    }

    /**
     * 1970-01-01T00:00:00Z
     */
    static final long MIN_UTC_EPOCH = Instant.EPOCH.getEpochSecond();

    /**
     * 2200-01-01T00:00:00Z
     */
    static final long MAX_UTC_EPOCH = 7258118400L;

}
