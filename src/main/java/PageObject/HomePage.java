package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends ObjectPage {

    //WebDriver driver;

    public static String URL = "https://qa-scooter.praktikum-services.ru/";

    //logo in header
    private final By headerLogo = By.className("Header_Logo__23yGT");
    private final By headerLogoYandex = By.className("Header_LogoYandex__3TSOI");
    private final By headerLogoScooter = By.className("Header_LogoScooter__3lsAR");

    //status order
    private final By headerStatusOrder = By.className("Header_Link__1TAG7");
    private final By headerInputOrder = By.className("Input_Input__1iN_Z Header_Input__xIoUq");
    private final By headerGoButton = By.className("Header_Button__28dPO");

    //img order not found
    private final By orderNotFound = By.xpath(".//img[@alt='Not found']");

    //accordion-menu
    private final By accordionMenu = By.className("Home_FourPart__1uthg");

    private final By expectedPayment = By.id("accordion__heading-0");
    private final By expectedAmount = By.id("accordion__heading-1");
    private final By expectedRentalTime = By.id("accordion__heading-2");
    private final By expectedOrderToday = By.id("accordion__heading-3");
    private final By expectedExtendOrder = By.id("accordion__heading-4");
    private final By expectedCharger = By.id("accordion__heading-5");
    private final By expectedCancellation = By.id("accordion__heading-6");
    private final By expectedCoverageZone = By.id("accordion__heading-7");

    private final By expectedPaymentText = By.id("accordion__panel-0");
    private final By expectedAmountText = By.id("accordion__panel-1");
    private final By expectedRentalTimeText = By.id("accordion__panel-2");
    private final By expectedOrderTodayText = By.id("accordion__panel-3");
    private final By expectedExtendOrderText = By.id("accordion__panel-4");
    private final By expectedChargerText = By.id("accordion__panel-5");
    private final By expectedCancellationText = By.id("accordion__panel-6");
    private final By expectedCoverageZoneText = By.id("accordion__panel-7");


    public HomePage(WebDriver driver) {
        super(driver);
        driver.get(URL);
    }
    //scroll
    public void scrollDown() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(accordionMenu));
    };
    //ожидание
    public void waitElement(WebElement element) {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.elementToBeClickable(element));
    };
    //функции для обработки меню-аккордиона
    public String getExpectedPayment() {
       WebElement element = driver.findElement(expectedPayment);
           element.click();
           WebElement text = driver.findElement(expectedPaymentText);
           waitElement(text);
           return text.getText();
    };

    public String getExpectedAmount() {
        driver.findElement(expectedAmount).click();
        WebElement element = driver.findElement(expectedAmountText);
        waitElement(element);
        return element.getText();
    };

    public String getExpectedRentalTime() {
        driver.findElement(expectedRentalTime).click();
        WebElement element = driver.findElement(expectedRentalTimeText);
        waitElement(element);
        return element.getText();
    };

    public String getExpectedOrderToday() {
        driver.findElement(expectedOrderToday).click();
        WebElement element = driver.findElement(expectedOrderTodayText);
        waitElement(element);
        return element.getText();
    };

    public String getExpectedExtendOrder() {
        driver.findElement(expectedExtendOrder).click();
        WebElement element = driver.findElement(expectedExtendOrderText);
        waitElement(element);
        return element.getText();
    };

    public String getExpectedCharger() {
        driver.findElement(expectedCharger).click();
        WebElement element = driver.findElement(expectedChargerText);
        waitElement(element);
        return element.getText();
    };

    public String getExpectedCancellation() {
        driver.findElement(expectedCancellation).click();
        WebElement element = driver.findElement(expectedCancellationText);
        waitElement(element);
        return element.getText();
    };

    public String getExpectedCoverageZone() {
        driver.findElement(expectedCoverageZone).click();
        WebElement element = driver.findElement(expectedCoverageZoneText);
        waitElement(element);
        return element.getText();
    };
}
