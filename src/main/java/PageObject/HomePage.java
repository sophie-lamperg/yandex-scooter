package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends ObjectPage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public static String URL = "https://qa-scooter.praktikum-services.ru/";

    //logo & order-button in header
    private final By headerOrderButton = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[@class='Button_Button__ra12g']");
    private final By headerLogo = By.className("Header_Logo__23yGT");
    private final By headerLogoYandex = By.className("Header_LogoYandex__3TSOI");
    private final By headerLogoScooter = By.className("Header_LogoScooter__3lsAR");

    //status order
    private final By headerStatusOrder = By.className("Header_Link__1TAG7");
    private final By headerInputOrder = By.className("Input_Input__1iN_Z Header_Input__xIoUq");
    private final By headerGoButton = By.className("Header_Button__28dPO");

    //img order not found
    private final By orderNotFound = By.xpath(".//img[@alt='Not found']");

    //accordeon-menu
    private final By expectedPayment = By.id("accordion__heading-8");
    private final By expectedAmount = By.id("accordion__heading-9");
    private final By expectedRentalTime = By.id("accordion__heading-10");
    private final By expectedOrderToday = By.id("accordion__heading-11");
    private final By expectedExtendOrder = By.id("accordion__heading-12");
    private final By expectedCharger = By.id("accordion__heading-13");
    private final By expectedCancellation = By.id("accordion__heading-14");
    private final By expectedCoverageZone = By.id("accordion__heading-15");

    @Override
    public HomePage open() {
        driver.get(URL);
        return this;
    }
}
