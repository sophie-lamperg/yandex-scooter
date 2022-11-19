package PageObject;

import org.openqa.selenium.WebDriver;

public abstract class ObjectPage {
    protected WebDriver driver;
    public ObjectPage(WebDriver driver) {
        this.driver = driver;
    }

    public abstract Object open();
}
