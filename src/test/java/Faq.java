import PageObject.HomePage;
import PageObject.HomePage.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static Constants.Constants.EXPECTED_PAYMENT;

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
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Assert.assertEquals(EXPECTED_PAYMENT, page.getExpectedPayment());
    }

}
