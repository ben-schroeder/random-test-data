package eu.benschroeder.testdata;

import lombok.experimental.UtilityClass;

import java.time.Instant;

@UtilityClass
public class Constants {

    /**
     * 1970-01-01T00:00:00Z
     */
    public final long MIN_UTC_EPOCH = Instant.EPOCH.getEpochSecond();

    /**
     * 2200-01-01T00:00:00Z
     */
    public final long MAX_UTC_EPOCH = 7258118400L;

}
