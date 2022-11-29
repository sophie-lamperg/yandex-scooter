package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static PageObject.HomePage.URL;

public class OrderPage extends ObjectPage {

    public OrderPage(WebDriver driver) {
        super(driver);
        driver.get(URL);
    }
    //order button in header
    private final By headerOrderButton = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[@class='Button_Button__ra12g']");
    //order btn in middle page
    private final By contentOrderButton = By.xpath("(//button [text()='Заказать'])[2]");

    //inputs
    private final By nameInput = By.xpath(".//div[@class='Order_Form__17u6u']/div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Имя']");
    private final By lastNameInput = By.xpath(".//div[@class='Order_Form__17u6u']/div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Фамилия']");
    private final By addressInput = By.xpath(".//div[@class='Order_Form__17u6u']/div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Адрес: куда привезти заказ']");
    private final By selectElements = By.className("select-search__input");
    private final By selectElement = By.xpath(".//div[contains(@class, 'Order_Text__2broi') and contains(text(), 'Фрунзенская')]");
    private final By phoneNumberInput = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");

    //кнопка далее
    private final By nextButton = By.className("Button_Middle__1CSJM");

    //вторая страница заполнения заказа
    private final By date = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    private final By rentalPeriod = By.className("Dropdown-arrow");
    private final By twoDays = By.xpath(".//div[contains(text(), 'двое суток')]");
    private final By colorBlack = By.id("black");
    private final By comment = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    private final By orderModal = By.className("Order_Modal__YZ-d3");
    private final By yesButton = By.xpath(".//button[contains(@class, 'Button_Button__ra12g Button_Middle__1CSJM') and contains(text(), 'Да')]");
    private final By status = By.xpath(".//div[contains(@class,'Order_ModalHeader') and text()='Заказ оформлен']");
    public void scrollDown() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(contentOrderButton));
    };
    //установка значений в инпуты
    public void setName(String value) {
        driver.findElement(nameInput).sendKeys(value);
    }
    public void setLastName(String value) {
        driver.findElement(lastNameInput).sendKeys(value);
    }
    public void setAddress(String value) {
        driver.findElement(addressInput).sendKeys(value);
    }
    public void setPhoneNumber(String value) {
        driver.findElement(phoneNumberInput).sendKeys(value);
    }
    //клик на кнопку заказать
    public void clickOnHeaderButton() {
        driver.findElement(headerOrderButton).click();
    }

    public void clickOnContentButton() {
        driver.findElement(contentOrderButton).click();
    }
    public void waitElement(WebElement element) {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.elementToBeClickable(element));
    };
    public void setSelectElement(String element) {
        driver.findElement(selectElements).sendKeys(element);
        driver.findElement(selectElement).click();
    }
    public void clickOnNextButton() {
        driver.findElement(nextButton).click();
    }
    public void setDate(String value) {
        driver.findElement(date).sendKeys(value);
    }
    public void setRentalPeriod() {
        driver.findElement(rentalPeriod).click();
        driver.findElement(twoDays).click();
    }
    public void setColorBlack() {
        driver.findElement(colorBlack);
    }
    public void setComment(String value) {
        driver.findElement(comment).sendKeys(value);
    }
    public void clickOnYesButton() {
        waitElement(driver.findElement(yesButton));
        driver.findElement(yesButton).click();
    }
    public void setStatus() {
        waitElement(driver.findElement(status));
        driver.findElement(status).isDisplayed();
    }
    public void setFields() {
        waitElement(driver.findElement(nameInput));
        setName("София");
        setLastName("Иванова");
        setAddress("Пушкина 174");
        setSelectElement("Фру");
        setPhoneNumber("+79993334455");
        clickOnNextButton();
        waitElement(driver.findElement(date));
        setDate("23.11.2022");
        setRentalPeriod();
        setColorBlack();
        setComment("Privet");
        clickOnNextButton();
        clickOnYesButton();
        setStatus();
    }
}
