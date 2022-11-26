import PageObject.HomePage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

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
       page.getExpectedPayment().click();
       WebElement text = page.getExpectedPaymentText();
       page.waitElement(text);
       Assert.assertEquals(EXPECTED_PAYMENT, text.getText());
    }
    @Test
    public void checkExpectedAmount() {
        page.getExpectedAmount().click();
        WebElement text = page.getExpectedAmountText();
        page.waitElement(text);
        Assert.assertEquals(EXPECTED_AMOUNT, text.getText());
    }
    @Test
    public void checkExpectedRentalTime() {
        page.getExpectedRentalTime().click();
        WebElement text = page.getExpectedRentalTimeText();
        page.waitElement(text);
        Assert.assertEquals(EXPECTED_RENTAL_TIME, text.getText());
    }
    @Test
    public void checkExpectedOrderToday() {
        page.getExpectedOrderToday().click();
        WebElement text = page.getExpectedOrderTodayText();
        page.waitElement(text);
        Assert.assertEquals(EXPECTED_ORDER_TODAY, text.getText());
    }
    @Test
    public void checkExpectedExtendOrder() {
        page.getExpectedExtendOrder().click();
        WebElement text = page.getExpectedExtendOrderText();
        page.waitElement(text);
        Assert.assertEquals(EXPECTED_EXTEND_ORDER, text.getText());
    }
    @Test
    public void checkExpectedCharger() {
        page.getExpectedCharger().click();
        WebElement text = page.getExpectedChargerText();
        page.waitElement(text);
        Assert.assertEquals(EXPECTED_CHARGER, text.getText());
    }
    @Test
    public void checkExpectedCancellation() {
        page.getExpectedCancellation().click();
        WebElement text = page.getExpectedCancellationText();
        page.waitElement(text);
        Assert.assertEquals(EXPECTED_CANCELLATION, text.getText());
    }
    @Test
    public void checkExpectedCoverageZone() {
        page.getExpectedCoverageZone().click();
        WebElement text = page.getExpectedCoverageZoneText();
        page.waitElement(text);
        Assert.assertEquals(EXPECTED_COVERAGE_ZONE, text.getText());
    }
}
