import PageObject.HomePage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static Constants.Constants.*;

public class Faq extends Main {
    HomePage page;
    @Before
     public void startTest() {
        page = new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        page.scrollDown();
    }

    @Test
    public void checkExpectedPayment() {

        Assert.assertEquals(EXPECTED_PAYMENT, page.getExpectedPayment());
    }
    @Test
    public void checkExpectedAmount() {
        Assert.assertEquals(EXPECTED_AMOUNT, page.getExpectedAmount());
    }
    @Test
    public void checkExpectedRentalTime() {
        Assert.assertEquals(EXPECTED_RENTAL_TIME, page.getExpectedRentalTime());
    }
    @Test
    public void checkExpectedOrderToday() {
        Assert.assertEquals(EXPECTED_ORDER_TODAY, page.getExpectedOrderToday());
    }
    @Test
    public void checkExpectedExtendOrder() {
        Assert.assertEquals(EXPECTED_EXTEND_ORDER, page.getExpectedExtendOrder());
    }
    @Test
    public void checkExpectedCharger() {
        Assert.assertEquals(EXPECTED_CHARGER, page.getExpectedCharger());
    }
    @Test
    public void checkExpectedCancellation() {
        Assert.assertEquals(EXPECTED_CANCELLATION, page.getExpectedCancellation());
    }
    @Test
    public void checkExpectedCoverageZone() {
        Assert.assertEquals(EXPECTED_COVERAGE_ZONE, page.getExpectedCoverageZone());
    }
}
