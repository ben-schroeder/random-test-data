package eu.benschroeder.testdata;

import eu.benschroeder.assertj.WithAssertJForMockito;
import eu.benschroeder.mockito.WithBDDMockito;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class WithRandomStringUtilsTest implements WithAssertJForMockito, WithBDDMockito {

    @Spy
    private WithRandomStringUtils withRandomStringUtils;

    @Test
    void testRandomAlphabeticCaseSizeIsTen() {

        // WHEN
        String randomAlphabetic = withRandomStringUtils.randomAlphabetic();

        // THEN
        thenAssert(randomAlphabetic).hasSize(10);

    }

    @Test
    void testRandomNumericCaseSizeIsTen() {

        // WHEN
        String randomNumeric = withRandomStringUtils.randomNumeric();

        // THEN
        thenAssert(randomNumeric).hasSize(10);
    }

    @Test
    void testRandomAlphanumericCaseSizeIsTen() {

        // WHEN
        String randomAlphanumeric = withRandomStringUtils.randomAlphanumeric();

        // THEN
        thenAssert(randomAlphanumeric).hasSize(10);

    }

}